package game.mechanics.handActions;

import game.cards.Hand;
import game.mechanics.HandAction;
import game.players.Player;

public class PayBlackjack implements HandAction{
    public Hand execute(Hand h, Player p) {
        double b = h.getBet();
        b = b + (b * 1.5);
        h.setBet(b);
        return h;
    }
}