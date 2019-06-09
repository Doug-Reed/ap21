package game.players;

import java.util.ArrayList;

import game.cards.Hand;
import game.players.betspread.Betspread;
import game.players.betspread.TenDollarSpread;
import game.players.betspread.Bet;

import org.apache.log4j.Logger;

public class Player {
    final static Logger log = Logger.getLogger(Player.class);
    private String name;
    private double bankroll = 10000;
    private CountingSystem countingSystem = new HiLo();
    private Betspread betspread = new TenDollarSpread();

    public ArrayList<Hand> hands = new ArrayList<Hand>();
    public ArrayList<Hand> getHands(){
        return hands;
    }

    public ArrayList<Hand> sweepCards() {
        ArrayList<Hand> discards = (ArrayList<Hand>) hands.clone();
        hands = new ArrayList<Hand>();
        return discards;
    }

    public void changeBankroll(double winnings) {
        bankroll += winnings;
    }

  public String toString() {
      return this.name + " bankroll= " + this.bankroll;
  }

    public void split(Hand h) {
        game.cards.Card c = h.getSplit();
        Hand newHand = new Hand();
        newHand.addToHand(c, false);
        hands.add(newHand);
    }
    public void startRound(int trueCount) {
      hands = new ArrayList<Hand>();
      Bet bet = betspread.getBet(trueCount);
      for (int i = 0; i >= bet.getNumberOfSpots();i++){
          Hand h = new Hand();
          h.setBet(bet.getBetAmount());
          hands.add(h);
          this.bankroll = bankroll- bet.getBetAmount();
      }
    }

    public int placeSideBet() {
        return 0;
    }
    public void setBankroll(double bankroll) {
        this.bankroll = bankroll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}