package game.players.decisions;

import game.cards.Card;
import game.cards.Hand;
import game.mechanics.Table;
import game.players.Player;
import game.players.decisions.Decision;

public class PlayingDecision {



    public Decision getDecision (Table t, Hand h, Card dealerUpcard) {
          if(h.valueOfHand() >=12) {
            return Decision.STAND;
          } else {
              return Decision.HIT;
          }
    }

    public boolean takeInsurance (Table t, Hand h, Player p) {
        return true;
    }

}