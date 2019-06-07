package game.players;

public class Lucky extends CountingSystem {
    public Lucky() {
        setAce(-1);
        setTwo(1);
        setThree(1);
        setFour(0);
        setFive(0);
        setSix(-1);
        setSeven(-2);
        setEight(-2);
        setNine(0);
        setTen(1);
    }
}