package game.mechanics;

import java.util.ArrayList;

import game.players.Player;

public class TurnManager{
    private ArrayList<Player> playersIn;
    int index = 0;
    private ArrayList<Player> busted;
    public boolean allPlayed;

    public TurnManager(Table t) {
        allPlayed = false;
        playersIn = t.getPlayers();
    }

    public void bustPlayer(Player p) {
        for(int i=0;i<playersIn.size();i++){
            if(playersIn.get(i) == p) {
                busted.add(playersIn.get(i));
            }
        }
    }

    public Player getNextPlayer(){
        Player next = null;
        while(next == null){
            if(index > playersIn.size()) {
                allPlayed = true;
                return null;
            }
            if(!busted.contains(playersIn.get(index))){
                next = playersIn.get(index);
            }
            
            index++;
        }
        return next;
    }


}