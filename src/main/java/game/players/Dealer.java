package game.players;

import game.cards.Hand;

public class Dealer {
    public Hand hand;

    public void nextRound(){
        hand = new Hand();
    }
}