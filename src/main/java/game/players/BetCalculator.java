package game.players;

import game.players.betspread.*;
public class BetCalculator {
    private Betspread betspread = new TenDollarSpread();
    public void setBetspread(Betspread betspread){
        this.betspread = betspread;
    }

    public Bet calculateBet(int trueCount) {
        return betspread.getBet(trueCount);
    }
}