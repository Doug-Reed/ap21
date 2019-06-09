package game.mechanics;
import org.apache.log4j.Logger;

import game.mechanics.gameActions.DealOneCardEachFaceup;
import game.mechanics.gameActions.DealSelfOneCardFacedown;
import game.mechanics.gameActions.DealSelfOneCardFaceup;
import game.mechanics.gameActions.StartRound;
import game.players.Player;
public class GameStart{
final static Logger log = Logger.getLogger(GameStart.class);
private Table t;
private int roundCount = 1;
    public GameStart(){
      log.debug("Start game");
      t = new Table();
      Player baron = t.addPlayer();
      baron.setName("baron");
      Player dogchip = t.addPlayer();
      dogchip.setName("dogchip");
     
      for(int i = 0; i < roundCount; i++){
        log.debug("StartRound");
        StartRound start = new StartRound();
        start.execute(t);
        DealOneCardEachFaceup deal1 = new DealOneCardEachFaceup();
        deal1.execute(t);
        DealSelfOneCardFacedown dealMe = new DealSelfOneCardFacedown();
        dealMe.execute(t);
        deal1.execute(t);
        DealSelfOneCardFaceup dealMeUp = new DealSelfOneCardFaceup();
        dealMeUp.execute(t);
        log.debug("Dealer gets " + t.getDealer().hand.dealerUpcard().toString());
      }
    }

    public Table getTable(){
      return t;
    }

}