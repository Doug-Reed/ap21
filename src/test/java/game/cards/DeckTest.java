package game.cards;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import game.cards.Deck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;


@DisplayName("Test Deck")
class DeckTest {
    @Test
    @DisplayName("52 cards")
     void test52Cards(){
       Deck d = new Deck();
       Assertions.assertEquals(52, d.getCards().size());
    }
}