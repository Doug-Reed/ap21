package game.cards;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import game.cards.Deck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;


@DisplayName("Hand Test")

public class HandTest{
    @Test
    void testSoftHands(){
        Card aceOfClubs = new Card();
        aceOfClubs.setValue(11);
        aceOfClubs.setSuit(Suit.CLUBS);
        aceOfClubs.setName("ACE");

        Card kingOfHearts = new Card();
        kingOfHearts.setName("KING");
        kingOfHearts.setValue(10);
        kingOfHearts.setSuit(Suit.HEARTS);

        Card aceOfSpades = new Card();
        aceOfSpades.setValue(11);
        aceOfSpades.setSuit(Suit.SPADES);
        aceOfSpades.setName("ACE");

        Card twoOfDiamonds = new Card();
        twoOfDiamonds.setValue(2);
        twoOfDiamonds.setName("TWO");
        twoOfDiamonds.setSuit(Suit.DIAMONDS);

        Hand h1 = new Hand();
        h1.addToHand(aceOfClubs, false);
        h1.addToHand(aceOfSpades, false);
         Assertions.assertEquals(h1.valueOfHand(), 12);

         Hand h2 = new Hand();
         h2.addToHand(kingOfHearts, false);
         h2.addToHand(aceOfClubs, false);
         Assertions.assertEquals(h2.valueOfHand(), 21);
         h2.addToHand(aceOfSpades, false);
         Assertions.assertEquals(h2.valueOfHand(), 12);
    }

    @Test
    void testDealerHand() {

        Card twoOfDiamonds = new Card();
        twoOfDiamonds.setValue(2);
        twoOfDiamonds.setName("TWO");
        twoOfDiamonds.setSuit(Suit.DIAMONDS);

        Card sevenOfClubs = new Card();
        sevenOfClubs.setValue(7);
        sevenOfClubs.setName("SEVEN");
        sevenOfClubs.setSuit(Suit.CLUBS);

        Hand dealer = new Hand();
        dealer.addToHand(twoOfDiamonds, true);
        dealer.addToHand(sevenOfClubs, false);
        Assertions.assertEquals(dealer.dealerUpcard().getValue(), 7);

    }

}