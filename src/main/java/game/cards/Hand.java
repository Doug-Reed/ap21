package game.cards;

import java.util.ArrayList;

public class Hand {
    private ArrayList<OrientedCard> hand = new ArrayList<OrientedCard>();
    private boolean soft = false;
    private boolean canSplit = true;
    private boolean resolved = false;
    private double bet;

    private class OrientedCard {

        private Card card;
        private boolean facedown = false;
        OrientedCard(Card card, boolean facedown) {
            this.card = card;
            this.facedown = facedown;
        }

        public int getValue() {
            return card.getValue();
        }

        public String toString() {
            if(facedown) {
                return "XX";
            }
            return card.toString();
        }

        public void turnUp() {
            facedown = false;
        }

        public int value() {
            return card.getValue();
        }

        public Card getCard() {
            return card;
        }

        public boolean isAce() {
            if (card.getName().equalsIgnoreCase("ACE")) {
                return true;
            }

            return false;
        }
    }

    public void setBet(double bet) {
        this.bet = bet;
    }

    public double getBet() {
        return this.bet;
    }
    public void addToHand(Card c, Boolean facedown) {
        hand.add(new OrientedCard(c, facedown));
    }

    public Card dealerUpcard() {
        for(OrientedCard oc: this.hand) {
            if(!oc.facedown) {
                return oc.getCard();
            }
        }
        return null;
    }

    public boolean firstTwoCards() {
        if(hand.size() ==2) {
            return true;
        }
        return false;
    }

    public boolean isSoft() {
         int theLogicIsInTheOtherMethodSoIWillMakeAUselessVariableNameHere = valueOfHand();
         return this.soft;
    }

    public ArrayList<Card> getCards() {
        ArrayList<Card> retVal = new ArrayList<Card>();
        for(OrientedCard oc: hand) {
            retVal.add(oc.getCard());
        }
        return retVal;
    }

    public void noSplit(){
        canSplit = false;
    }

    public boolean isPair() {
        if(!canSplit) {
            return false;
        }
        
        if (hand.size() != 2) {
            return false;
        }

        if (hand.get(0).getValue() == hand.get(1).getValue()) {
            return true;
        }

        return false;
    }

    public int size() {
        return hand.size();
    }

    @Override
    public String toString() {
        String retVal = "";
        for (OrientedCard c : hand) {
            retVal = retVal + " " + c.toString();
        }

        retVal = retVal + " Value: " + valueOfHand();
        return retVal;
    }

    public int valueOfHand() {

        int value = 0;
        ArrayList<Card> aces = new ArrayList<Card>();

        for (OrientedCard card : hand) {
            value += card.getValue();
            if (card.isAce()) {
                soft = true;
                aces.add(card.getCard());
            }
        }

        if (value > 21) {
            int aceCount = aces.size();
            for (Card ace : aces) {
                aceCount--;
                value = value - 10;
                if (aceCount == 0) {
                    soft = false;
                }

                if (value < 21) {
                    return value;
                }
            }
        }

        return value;
    }

   public Card getSplit() {
        if(canSplit) {
            Card c = hand.get(1).getCard();
            hand.remove(1);
            return c;
        }
        return null;
    }

    public void resolveHand(){
        System.out.println("Resolving hand " + this.toString());
        this.resolved  = true;
    }
    public boolean isResolved(){
        System.out.println("Am I resolved? " + this.resolved);
        return this.resolved;
    }

}