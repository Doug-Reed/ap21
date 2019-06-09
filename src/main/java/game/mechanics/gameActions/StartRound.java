package game.mechanics.gameActions;

import game.mechanics.GameAction;
import game.mechanics.Table;
import game.mechanics.TurnManager;
import game.players.Player;
import org.apache.log4j.Logger;

public class StartRound implements GameAction {
    final static Logger log = Logger.getLogger(StartRound.class);
    public Table execute(Table t) {
        log.debug("STARTING ROUND");
        TurnManager tm = new TurnManager(t);
        //Fix to include dealt cards. 
        int trueCount = t.getDiscardTray().trueCount();
        Player p = tm.getNextPlayer();
        while(!tm.allPlayed) {
            p.startRound(trueCount);
            p = tm.getNextPlayer();

        }
        return t;
    }
}