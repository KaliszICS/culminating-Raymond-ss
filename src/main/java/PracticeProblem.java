/* Steps and instruction checks in correct order? 
	Declearing 
	Create cardeck and how to draw the cards from the deck
	Players cards - their five handheld cards
	Poker Hands - tier ranking strongest to weakest hands

	Ante; Player bet phase 1: all chips be amount must be the same draw all 5 cards
	after drawing all 5 cards - players must bet to continue the play
	After those player have bet; thier allowed to discard up to 3 cards and draw new draw(depends on discard cards)
	After the Draw the player are allowed to bet once again; 
	After the bet phase is over those player that bet flip their cards over to see who has strongest hand. 
 */

import javax.smartcardio.Card;

public class PracticeProblem {

	public static void main(String args[]) {
	String suit[] = {"Diamonds","Hearts", "Clubs", "Spades"};
	String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};
	String deck[] = new String[52];
	//Assigning values to each card in the deck
	int ctr = 0;

	for (int i = 0; ctr < 4; ++i) {
		for (int j = 0; j < 13; ++j) {
			deck[ctr] = deck(rank[j], suit[i]);
			++ctr;
		}
	}
	System.out.println(deck);
	}

}



