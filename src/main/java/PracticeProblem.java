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
import java.util.List;

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
	String suit[] = { "Clubs", "Diamonds","Hearts",  "Spades"};
	String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "1"}; 
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
	System.out.println("Welcome to Vegas StudPoker");
	 
	System.out.println("Please Place your bets"); 
	System.out.println();
	ArrayList<String> player1hand= new ArrayList<>(); 
	ArrayList<String> player2handbot= new ArrayList<>(); 
	ArrayList<String> player3handbot= new ArrayList<>(); 
	ArrayList<String> player4handbot= new ArrayList<>(); 
	int player1handbal = 5000;
	int player2handbotbal = 5000;
	int player3handbotbal = 5000;
	int player4handbotbal = 5000;

	// random card geneator - each hand
	// having a dupe of deck to sort cards
	// sorting by index is easier as the index is sorted from great to 
	// game
	ArrayList<String> deckTemp1 = new ArrayList<>(deck); 
		int randomIndexPlayer1 = (int) (Math.random() * deckTemp1.size()); 
		deckTemp1.remove(randomIndexPlayer1);
		int randomIndexPlayer2 = (int) (Math.random() * deckTemp1.size());
		deckTemp1.remove(randomIndexPlayer2);
		int randomIndexPlayer3 = (int) (Math.random() * deckTemp1.size());
		deckTemp1.remove(randomIndexPlayer3);
		int randomIndexPlayer4 = (int) (Math.random() * deckTemp1.size());
		deckTemp1.remove(randomIndexPlayer4);
		int randomIndexPlayer5 = (int) (Math.random() * deckTemp1.size());
		deckTemp1.remove(randomIndexPlayer5);
		ArrayList<Integer> cardtemp = new ArrayList<>(List.of(randomIndexPlayer1, randomIndexPlayer2, randomIndexPlayer3, randomIndexPlayer4, randomIndexPlayer5));
		 
		//String cardtemp = deck.get(randomIndex);
		for (int i = 0; cardtemp.size() > 0; i++) {
			int cardIndex = cardtemp.get(i);
			player1hand.add(deck.get(cardIndex));
			deck.remove(cardIndex);
		}
		System.out.println(player1handbal);
	
		
		ArrayList<String> deckTemp2 = new ArrayList<>(deck); 
		int randomIndexBotTwo1 = (int) (Math.random() * deckTemp2.size()); 
		deckTemp2.remove(randomIndexPlayer1);
		int randomIndexBotTwo2 = (int) (Math.random() * deckTemp2.size());
		deckTemp2.remove(randomIndexPlayer2);
		int randomIndexBotTwo3 = (int) (Math.random() * deckTemp2.size());
		deckTemp2.remove(randomIndexPlayer3);
		int randomIndexBotTwo4 = (int) (Math.random() * deckTemp2.size());
		deckTemp2.remove(randomIndexPlayer4);
		int randomIndexBotTwo5 = (int) (Math.random() * deckTemp2.size());
		deckTemp2.remove(randomIndexPlayer5);
		List<Integer> cardtemp2 = new ArrayList <>(List.of(randomIndexBotTwo1, randomIndexBotTwo2, randomIndexBotTwo3, randomIndexBotTwo4, randomIndexBotTwo5));
		 
		//String cardtemp = deck.get(randomIndex);
		for (int i = 0; cardtemp2.size() > 0; i++) {
			int cardIndex = cardtemp2.get(i);
			player2handbot.add(deck.get(cardIndex));
			deck.remove(cardIndex);
		}
		System.out.println(player1handbal);

		ArrayList<String> deckTemp3 = new ArrayList<>(deck); 
		int randomIndexBotThree1 = (int) (Math.random() * deckTemp3.size()); 
		deckTemp3.remove(randomIndexPlayer1);
		int randomIndexBotThree2 = (int) (Math.random() * deckTemp3.size());
		deckTemp3.remove(randomIndexPlayer2);
		int randomIndexBotThree3 = (int) (Math.random() * deckTemp3.size());
		deckTemp3.remove(randomIndexPlayer3);
		int randomIndexBotThree4 = (int) (Math.random() * deckTemp3.size());
		deckTemp3.remove(randomIndexPlayer4);
		int randomIndexBotThree5 = (int) (Math.random() * deckTemp3.size());
		deckTemp3.remove(randomIndexPlayer5);
		List<Integer> cardtemp3 = new ArrayList <>(List.of(randomIndexBotThree1, randomIndexBotThree2, randomIndexBotThree3, randomIndexBotThree4, randomIndexBotThree5));
		 
		//String cardtemp = deck.get(randomIndex);
		for (int i = 0; cardtemp3.size() > 0; i++) {
			int cardIndex = cardtemp3.get(i);
			player3handbot.add(deck.get(cardIndex));
			deck.remove(cardIndex);
		}
		System.out.println(player1handbal);

		ArrayList<String> deckTemp2 = new ArrayList<>(deck); 
		int randomIndexBotTwo1 = (int) (Math.random() * deck.size()); 
		deckTemp1.remove(randomIndexPlayer1);
		int randomIndexBotTwo2 = (int) (Math.random() * deckTemp2.size());
		deckTemp1.remove(randomIndexPlayer2);
		int randomIndexBotTwo3 = (int) (Math.random() * deckTemp2.size());
		deckTemp1.remove(randomIndexPlayer3);
		int randomIndexBotTwo4 = (int) (Math.random() * deckTemp2.size());
		deckTemp1.remove(randomIndexPlayer4);
		int randomIndexBotTwo5 = (int) (Math.random() * deckTemp2.size());
		deckTemp1.remove(randomIndexPlayer5);
		List<Integer> cardtemp2 = new ArrayList <>(List.of(randomIndexBotTwo1, randomIndexBotTwo2, randomIndexBotTwo3, randomIndexBotTwo4, randomIndexBotTwo5));
		 
		//String cardtemp = deck.get(randomIndex);
		for (int i = 0; cardtemp2.size() > 0; i++) {
			int cardIndex = cardtemp2.get(i);
			player2handbot.add(deck.get(cardIndex));
			deck.remove(cardIndex);
		}
		System.out.println(player1handbal);

		}
}
	


	for (int i = 0; i < 5; i++) {
		int randomIndex = (int) (Math.random() * deck.size()); 

		String cardTemp = deck.get(randomIndex);
		player2handbot.add(cardTemp);
		int indexTempPrevious = randomIndex; //a
		if ((i < 1) && indexTempPrevious == randomIndex){
			
		}
		
		
		deck.remove(randomIndex);
	}
		//index 

		
	}
	for (int i = 0; i < 5; i++) {
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
	//System.out.println(player1hand);
	//System.out.println(player2handbot);
	//System.out.println(player3handbot);
	//System.out.println(player4handbot);
	
	//check for poker hands

}

public static String pokerHands(ArrayList<String>player1hand, ArrayList<String>player2handbot, ArrayList<String>player3handbot, ArrayList<String>player4handbot) {
	//Royal flush. Ace, king, queen, jack, and 10, all in the same suit. ...
	String firstCard = player1hand.get(0);
	String firstCardSuit = firstCard.substring(firstCard.indexOf(":"));
	String firstCardRank = firstCard.substring(0, firstCard.indexOf(":"));

	String SecondCard = player2handbot.get(1);
	String SecondCardSuit = 
	String SecondCardRank = 
	String ThirdCard = player1hand.get(2);
	String FourthCard = player1hand.get(3);
	String FifthCard = player1hand.get(4);
	

	if () {
		
	}
		
	//Straight flush. Five cards of sequential rank that are all of the same suit. ...
 	//Four of a kind. Four cards of the same rank, plus one of another rank. ...
	//Full House
	//Flush
	//Straight
	//Three of a kind
	//Two pair
	//High card
	

}








