package game.players.betspread;

public class Bet{
    private int numberOfSpots;
    private int betAmount;

    public Bet(){

    }

    public Bet(int numberOfSpots, int betAmount) {
        this.betAmount = betAmount;
        this.numberOfSpots = numberOfSpots;
    }
    public int getNumberOfSpots(){
        return this.numberOfSpots;
    }

    public int getBetAmount() {
        return this.betAmount;
    }

    public void setNumberOfSpots(int numberOfSpots){
        this.numberOfSpots = numberOfSpots;
    }

    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
    }
}