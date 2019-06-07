package game.mechanics.gameActions;

import game.cards.Hand;
import game.mechanics.GameAction;
import game.mechanics.Table;

public class DealSelfOneCardFacedown implements GameAction {
    public Table execute(Table t) {
       Hand h =  t.getDealer().hand;
       h.addToHand(t.getShoe().draw(), true);
       return t;
    }
}