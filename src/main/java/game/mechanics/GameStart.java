package game.mechanics;
import org.apache.log4j.Logger;
public class GameStart{
final static Logger log = Logger.getLogger(GameStart.class);
private Table t;
    public GameStart(){
      log.debug("Start game");
      t = new Table();
    }

    public Table getTable(){
      return t;
    }

}