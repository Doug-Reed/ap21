package game.mechanics;

import game.cards.Hand;
import game.players.Player;

public interface HandAction{
    public Hand execute(Hand h, Player p);
}