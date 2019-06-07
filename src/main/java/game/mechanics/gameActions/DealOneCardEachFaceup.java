package game.mechanics.gameActions;

import game.cards.Hand;
import game.mechanics.GameAction;
import game.mechanics.HandManager;
import game.mechanics.Table;
import game.mechanics.TurnManager;
import game.players.Player;

public class DealOneCardEachFaceup implements GameAction{
    public Table execute(Table t) {
         TurnManager tm = new TurnManager(t);
         Player p = null;
         while(!tm.allPlayed) {
             p = tm.getNextPlayer();
             HandManager hm = new HandManager(p);
             while(!hm.allPlayed) {
                 Hand h = hm.getNextHand();
                 h.addToHand(t.getShoe().draw(), false);
             }
         }
         return t;
    }

}