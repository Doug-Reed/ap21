package game.mechanics;

import game.cards.Hand;
import game.players.Player;

public class HandManager {
    private Player p;
    int index = 0;
    public boolean allPlayed;
    public HandManager(Player p) {
        this.p = p;
        allPlayed = false;
    }

    public Hand getNextHand() {
        if(index >= p.getHands().size()) {
            allPlayed = true;
            return null;
        }
        
        return p.getHands().get(index);

    }
}