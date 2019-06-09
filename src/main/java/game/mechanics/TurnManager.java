package game.mechanics;

import java.util.ArrayList;

import game.players.Player;
import org.apache.log4j.Logger;
public class TurnManager{
    final static Logger log = Logger.getLogger(TurnManager.class);

    private ArrayList<Player> playersIn;
    int index = 0;
    private ArrayList<Player> busted;
    public boolean allPlayed;

    public TurnManager(Table t) {
        allPlayed = false;
        playersIn = t.getPlayers();
       log.debug(playersIn.size() + " players");
       busted = new ArrayList<Player>();
    }

    public void bustPlayer(Player p) {
        for(int i=0;i<playersIn.size();i++){
            if(playersIn.get(i) == p) {
                busted.add(playersIn.get(i));
            }
        }
    }

    public Player getNextPlayer(){
        log.debug("Get next Player index = " + index );
        Player next = null;
        if(playersIn.size()==0){
            allPlayed = true;
            return null;
        }
        while(next == null){
            log.debug("playersIn.size() = " + playersIn.size() + " index = " + index);
            if(index >= playersIn.size()) {
                allPlayed = true;
                return null;
            }
            if(!busted.contains(playersIn.get(index))){
                next = playersIn.get(index);
            }
            
            index++;
        }
        log.debug("next = " + next.toString());
        return next;
    }


}