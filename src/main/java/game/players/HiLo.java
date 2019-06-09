package game.players;

public class HiLo extends CountingSystem{
    public HiLo(){
        setAce(-1);
        setTen(-1);

        setTwo(1);
        setThree(1);
        setFour(1);
        setFive(1);
        setSix(1);
        
        setSeven(0);
        setEight(0);
        setNine(0);
    }
}