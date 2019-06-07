package game.mechanics.handActions;

import game.cards.Hand;
import game.mechanics.HandAction;
import game.players.Player;

public class PayBet implements HandAction {
   public Hand execute(Hand h, Player p) {
       double b = h.getBet();
       h.setBet(b*2);
       return h;
   }
}