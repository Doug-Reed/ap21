package game.players;

import java.util.ArrayList;

import game.cards.Card;


public abstract class CountingSystem {

    private int A = -1;
    private int two = 1;
    private int three = 1;
    private int four = 1;
    private int five = 1;
    private int six = 1;
    private int seven = 0;
    private int eight = 0;
    private int nine = 0;
    private int ten = -1;
    public int getRunningCount(ArrayList<Card> cards){
      int runningCount = 0;
      for(Card c: cards) {
        switch ( c.getValue()){
            case 1:
                runningCount += A;
                break;
            case 2:
                runningCount += two;
                break;
            case 3:
                runningCount += three;
                break;
            case 4:
                runningCount += four;
                break;
            case 5:
                runningCount += five;
                break;
            case 6:
                runningCount += six;
                break;
            case 7:
                runningCount += seven;
                break;
            case 8:
                runningCount += eight;
                break;
            case 9:
                runningCount += nine;
                break;
            case 10:
                runningCount += ten;
                break;
            default:
                runningCount +=A;
        }
      }
       return runningCount;
    } 
    public void setAce(int AceVal){
        A = AceVal;
    }
    public void setTwo(int val){
        two = val;
    }
    public void setThree(int val){
        three = val;
    }
    public void setFour(int val){
        four = val;
    }
    public void setFive(int val){
        five = val;
    }
    public void setSix(int val){
        six = val;
    }
    public void setSeven(int val){
        seven = val;
    }
    public void setEight(int val){
        eight = val;
    }
    public void setNine(int val){
        nine = val;
    }
    public void setTen(int val){
        ten = val;
    }
}