package game.cards;

import game.players.CountingSystem;
import java.util.ArrayList;

public class DiscardTray {
    private int numberOfDecks = 0;
    private CountingSystem countingSystem;
    private ArrayList<Card> discarded = new ArrayList<Card>();
    private int cutCard;

    public DiscardTray(int numberOfDecks, CountingSystem countingSystem) {
        this.numberOfDecks = numberOfDecks;
        this.countingSystem = countingSystem;
    }

    public void setCountingSystem(CountingSystem cs){
        this.countingSystem = cs;
    }
    public void setPenetration(int cutCard) {
        this.cutCard = cutCard;
    }

    public boolean penetrationReached(){
        if(numberOfDiscards() >= cutCard) {
            return true;
        }

        return false;
    }

    public void reset() {
        this.discarded = new ArrayList<Card>();
    }

    public int numberOfDiscards(){
        return discarded.size();
    }

    public void setNumberOfDecks(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }

    public void discard(ArrayList<Card> discards) {
        discarded.addAll(discards);
    }

    public int trueCount() {
        int discardSize = discarded.size();
        if(discardSize ==0) {discardSize++;}
        double decksDiscardedExact = discardSize/ 52;
        int decksDiscardedFloored = (int) decksDiscardedExact;
        if (decksDiscardedFloored==0){decksDiscardedFloored =1;}

        double rawDivide = runningCount()/decksDiscardedFloored;

        int returnVal = (int) rawDivide;

        return returnVal;
    }

    public int runningCount() {
        return this.countingSystem.getRunningCount(discarded);
    }
}