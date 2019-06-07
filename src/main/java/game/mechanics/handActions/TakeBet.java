package game.mechanics.handActions;

import game.cards.Hand;
import game.mechanics.HandAction;
import game.players.Player;

public class TakeBet implements HandAction{
    public Hand execute(Hand h, Player p) {
        h.setBet(0);
        return h;
    }
}