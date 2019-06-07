package game.mechanics.gameActions;

import java.util.ArrayList;

import game.cards.Card;
import game.cards.Hand;
import game.mechanics.GameAction;
import game.mechanics.HandManager;
import game.mechanics.Table;
import game.mechanics.TurnManager;
import game.players.Player;

public class EndRound implements GameAction {
    public Table execute(Table t) {

        ArrayList<Card> discards = new ArrayList<Card>();
        ArrayList<Hand> oldHands = new ArrayList<Hand>();

        TurnManager tm = new TurnManager(t);
        Player p = tm.getNextPlayer();

        while (!tm.allPlayed) {
            HandManager hm = new HandManager(p);
            Hand h = hm.getNextHand();
            while (!hm.allPlayed) {
                p.changeBankroll(h.getBet());
            }
            oldHands.addAll(p.sweepCards());
            p = tm.getNextPlayer();
        }

        for (Hand h : oldHands) {
            discards.addAll(h.getCards());
        }

        return t;

    }
}