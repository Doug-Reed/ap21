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
         Player p = tm.getNextPlayer();
         while(!tm.allPlayed) {
             HandManager hm = new HandManager(p);
             Hand h = hm.getNextHand();
             while(!hm.allPlayed) {
                 h.addToHand(t.getShoe().draw(), false);
                 h = hm.getNextHand();
             }
             p = tm.getNextPlayer();
         }
         return t;
    }

}