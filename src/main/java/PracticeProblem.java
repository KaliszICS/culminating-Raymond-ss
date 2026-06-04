/* Steps and instruction checks in correct order? - Stud poker
	Declearing 
	Create cardeck and how to draw the cards from the deck - done: Univerial deck
	Players cards - their five handheld cards - done
	create card random geneator
	Poker Hands - tier ranking strongest to weakest hands

	Ante; Player bet phase 1: all chips be amount must be the same draw all 5 cards
	after drawing all 5 cards - players must bet to continue the play
	After those player have bet; thier allowed to discard up to 3 cards and draw new draw(depends on discard cards)
	After the Draw the player are allowed to bet once again; 
	After the bet phase is over those player that bet flip their cards over to see who has strongest hand. 
 */

//import javax.smartcardio.Card;

import java.util.ArrayList;

public class PracticeProblem {
	public static void q1() {
		//Write question 1 code here
	}
	public static void q2() {
		//Write question 2 code here
	}
	public static void q3() {
		//Write question 3 code here
	}
	public static void q4() {
		//Write question 4 code here
	}
	public static void q5() {
		//Write question 5 code here
	}

	public static void main(String args[]) {
	// creating the univerisl dekcs of cards
	String suit[] = {"Diamonds","Hearts", "Clubs", "Spades"};
	String rank[] = {"1","2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",}; 
								// "Ace" = 1 "Jack" = 11, "Queen" = 12, "King" = 13, 
	ArrayList<String> deck = new ArrayList<>();
	//int indTemp = 0;
	int indTempSuit = 0;

		for (int r = 0; indTempSuit < 4; r++) {// creaitng cards based on sutis since one cards has 4 diff suits
			for (int s = 0; s < 13; s++) {
				deck.add (rank[s] + ":" + suit[r]); //creates one cards at one index and : to split it index to easy get values
				//indTemp++;
				
			}
			indTempSuit++;
		}

	
	ArrayList<String> player1hand= new ArrayList<>(); 
	ArrayList<String> player2handbot= new ArrayList<>(); 
	ArrayList<String> player3handbot= new ArrayList<>(); 
	ArrayList<String> player4handbot= new ArrayList<>(); 
	// random ccard geneator - each hand
	for (int i = player1hand.size(); i < 5; i++) {
		int randomIndex = (int) (Math.random() * deck.size()); 
		String cardtemp = deck.get(randomIndex);
		player1hand.add(cardtemp);
		deck.remove(randomIndex);
		
	}
	for (int i = player2handbot.size(); i < 5; i++) {
		int randomIndex = (int) (Math.random() * deck.size()); 
		String cardtemp = deck.get(randomIndex);
		String cardtemppreveious = cardtemp;
		player2handbot.add(cardtemp);
		deck.remove(randomIndex);
		//index 
		

	}
	for (int i = player3handbot.size(); i < 5; i++) {
		int randomIndex = (int) (Math.random() * deck.size()); 
		String cardtemp = deck.get(randomIndex);
		player3handbot.add(cardtemp);
		deck.remove(randomIndex);
	}
	for (int i = player4handbot.size(); i < 5; i++) {
		int randomIndex = (int) (Math.random() * deck.size()); 
		String cardtemp = deck.get(randomIndex);
		player4handbot.add(cardtemp);
		deck.remove(randomIndex);
	}
	//sort 
	
}


	



public static void pokerHands() {
	

}

}





