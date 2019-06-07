package game.players.betspread;


public class TenDollarSpread extends Betspread {
    private Bet bet;
    public TenDollarSpread() {
        setDThree(new Bet(1,10));
        setDTwo(new Bet(1,10));
        setDOne(new Bet(1,10));
        setZero(new Bet(1,10));
        setOne(new Bet(1,15));
        setTwo(new Bet(2,25));
        setThree(new Bet(2,40));
        setFour(new Bet(2,50));
        setOne(new Bet(2,60));
        setOne(new Bet(2,60));
    }
}