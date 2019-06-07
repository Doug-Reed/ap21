package game.mechanics;

import java.util.ArrayList;

import game.cards.DiscardTray;
import game.players.Dealer;
import game.players.HiLo;
import game.players.Player;
import game.cards.Shoe;

public class Table {
    private Shoe shoe;
    private DiscardTray discardTray;
    private Dealer dealer;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Table() {
        shoe = new Shoe(numberOfDecks);
        discardTray = new DiscardTray(numberOfDecks, new HiLo());
        dealer = new Dealer();
    }

    public Shoe getShoe() {
        return shoe;
    }

    public DiscardTray getDiscardTray() {
        return discardTray;
    }
    public Player addPlayer() {
        Player p = new Player();
        players.add(p);
        return p;
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }
    public Dealer getDealer(){
        return dealer;
    }


    public boolean canSurrender = false;
    public boolean canDoubleAfterSplit = true;
    public boolean dealerHitsSoft17 = true;
    public int numberOfDecks = 6;
    public int numberOfSplits = 3;
    public boolean canSplitAces = true;
    public boolean dealerPeeks = true;
}