package game.players.betspread;
import game.players.betspread.Bet;

public abstract class Betspread {
    private Bet dThree;
    private Bet dTwo;
    private Bet dOne;
    private Bet zero;
    private Bet one;
    private Bet two;
    private Bet three;
    private Bet four;
    private Bet five;
    private Bet six;

    public Bet getBet(int trueCount) {
        if(trueCount < -3) {
            return new Bet(1,-3);
        }
        if(trueCount > 6) {
            return new Bet(2,6);
        }
        switch(trueCount){
            case -3:
                return dThree;
            case -2:
                return dTwo;
            case -1:
                return dOne;
            case 0:
                return zero;
            case 1:
                return one;
            case 2:
                return two;
            case 3:
                return three;
            case 4:
                return four;
            case 5:
                return five;
            case 6:
                return six;
            default:
                return zero;
        }
    }

    public void setDThree(Bet bet) {
        dThree = bet;
    }

    public void setDTwo(Bet bet) {
        dTwo = bet;
    }
    public void setDOne(Bet bet) {
        dOne = bet;
    }
    public void setZero(Bet bet) {
        zero = bet;
    }
    public void setOne(Bet bet) {
        one = bet;
    }    
    public void setTwo(Bet bet) {
        two = bet;
    }    
    public void setThree(Bet bet) {
        three = bet;
    }    
    public void setFour(Bet bet) {
        four = bet;
    }    
    public void setFive(Bet bet) {
        five = bet;
    }    
    public void setSix(Bet bet) {
        six = bet;
    }
}