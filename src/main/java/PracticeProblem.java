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
import java.util.Scanner;

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

	Scanner input = new Scanner(System.in);
	//declear
	int player1handbal = 5000;
	int player2handbotbal = 50000;
	int player3handbotbal = 50000;		
	int player4handbotbal = 50000;
	int pot = 0;
	int ante = 100;
	player1handbal -= ante;
	player2handbotbal -= ante;
	player3handbotbal -= ante;
	player4handbotbal -= ante;
	pot += (ante * 4);

	while (true) {
		if (player1handbal < 100) {
			System.out.println("out of chips");
			break;
		}
	
	// creating the univerisl dekcs of cards
	String suit[] = { "Clubs", "Diamonds","Hearts",  "Spades"};
	String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "1"}; 
								// "Ace" = 1 "Jack" = 11, "Queen" = 12, "King" = 13, 
	ArrayList<String> deck = new ArrayList<>();
	int indTempSuit = 0;

		for (int r = 0; indTempSuit < 4; r++) {// creaitng cards based on sutis since one cards has 4 diff suits
			for (int s = 0; s < 13; s++) {
				deck.add (rank[s] + ":" + suit[r]); //creates one cards at one index and : to split it index to easy get values
				
			}
			indTempSuit++;
		}
	System.out.println("Welcome to goated StudPoker");
	System.out.println("Your balence is: " + player1handbal);
	System.out.println("All players must play the Ante, All bets has been matched: 100"); 
	System.out.println("\nThe pot amount is: "+ pot);

	ArrayList<String> player1hand= new ArrayList<>(); 
	ArrayList<String> player2handbot= new ArrayList<>(); 
	ArrayList<String> player3handbot= new ArrayList<>(); 
	ArrayList<String> player4handbot= new ArrayList<>(); 
	
	
	// ante must be played
	// random card geneator - each hand
	// having a dupe of deck to sort cards
	// sorting by index is easier as the index is sorted from great to 
	// game
	
	// first card draw
	  for (int i = 0; i < 5; i++) {
            int r1 = (int) (Math.random() * deck.size());
			String cardtemp = deck.get(r1);
            player1hand.add(cardtemp);
			deck.remove(r1);
            
            int r2 = (int) (Math.random() * deck.size());
            String cardtemp2 = deck.get(r2);
			player2handbot.add(cardtemp2);
			deck.remove(r2);
            
            int r3 = (int) (Math.random() * deck.size());
           	String cardtemp3 = deck.get(r3);
			player3handbot.add(cardtemp3);
			deck.remove(r3);
            
            int r4 = (int) (Math.random() * deck.size());
            String cardtemp4 = deck.get(r4);
			player4handbot.add(cardtemp4);
			deck.remove(r4);
	  }
		


		//discard
		System.out.println("Your current hand: " + player1hand);
		System.out.println("How many cards do you want to discard? ");
		int discardCount = input.nextInt();

		if (discardCount > 0 && discardCount <= 3) {
            ArrayList<Integer> cardToRemove = new ArrayList<>();
            for (int in = 0; in < discardCount; in++) {
                System.out.print("Enter indexs of card to discard(enter from GREATEST to LEASTEST): ");
				//error code if you enter form leastest to greatest as cards from least to greater shift over one after the for loop
				// the error the first card get discard properly but the the cards after get shifted one over (1-2) -> (1-3)
				int carinddiscard = input.nextInt();
				while (carinddiscard > 5 || carinddiscard < 1){
					System.out.print("Enter indexs of your hand: ");
					 carinddiscard = input.nextInt();
				}
				// shifts the index
                 int internalIndex = carinddiscard - 1;
       			 cardToRemove.add(internalIndex);
			}	
			//0 1 2
			//12 13 15
	
			//removing cards
			for (int r = 0; r < cardToRemove.size(); r++) {
                int index = cardToRemove.get(r);
                player1hand.remove(index);
			}
		
			//drawing new ones
			while (player1hand.size() < 5) {
				int r = (int) (Math.random() * deck.size());
				String cardtemp = deck.get(r);
				player1hand.add(cardtemp);
				deck.remove(r);
			}
		
		}
		//bots?

		//final bets
		System.out.println("Your New hand: " + player1hand);
		System.out.println("Players place your final bet");
		int bet2 = input.nextInt();
		while (bet2 > player1handbal){
			System.out.println("Players your final bet too much balence not enough");
			bet2 = input.nextInt();
		}
		//play-in bet
        player1handbal -= bet2;
        player2handbotbal -= bet2;
        player3handbotbal -= bet2;
        player4handbotbal -= bet2;
        pot += (bet2 * 4);

		System.out.println("All bet matched");
		System.out.println(pot);
		int player1 = evaluatepokerhand(player1hand);
		int player2 = evaluatepokerhand(player2handbot);
		int player3 = evaluatepokerhand(player3handbot);
		int player4 = evaluatepokerhand(player4handbot);

		//checking for player best hand out of 4
		int maxscore = Math.max(Math.max(player1, player2), Math.max(player3, player4));	
		//playerr with best hand wins 
		if  (player1 == maxscore) {
			System.out.println("player 1 wins");
			player1handbal += pot;
			}
		
		else if (player2 == maxscore) {
                System.out.println("Bot 2 wins the pot amount: "+ pot);
                player2handbotbal += pot;
            } 
		else if (player3 == maxscore) {
                System.out.println("Bot 3 wins the pot amount: " + pot);
                player3handbotbal += pot;
            }  
		else if (player4 == maxscore){
                System.out.println("Bot 4 wins the pot amount: " + pot);
				player4handbotbal += pot;
		}

		
		}

	
	}

//soritng hands in order to get ranking of poker hands
public static int[] getsortedranks(ArrayList<String> hand) {
        int[] ranks = new int[5];
        for (int i = 0; i < 5; i++) {
            String card = hand.get(i);
            String[] split = card.split(":");
            int val = Integer.parseInt(split[0]);
			ranks[i] = val;
			
            
        }
        
        for (int i = 0; i < ranks.length - 1; i++) {
            for (int j = 0; j < ranks.length - i - 1; j++) {
                if (ranks[j] > ranks[j + 1]) {
                    int temp = ranks[j];
                    ranks[j] = ranks[j + 1];
                    ranks[j + 1] = temp;
                }
            }
        }
        return ranks;
    }
	public static int[] getrankcounts(int[] sortedranks) {
        int[] counts = new int[15]; 
        for (int i = 0; i < sortedranks.length; i++) {
            int rankvalue = sortedranks[i];
            counts[rankvalue]++;
        }
        return counts;
    }

	public static int evaluatepokerhand(ArrayList<String> hand) {
        int[] ranks = getsortedranks(hand);
        int[] counts = getrankcounts(ranks);
		
		
		String firstCard = hand.get(0);
		String firstSuit = firstCard.split(":")[1];

		boolean flush = true;
		for (int i = 0; i < hand.size(); i++) {
			String currentcard = hand.get(i);
			String currentsuit = currentcard.split(":")[1];
			if (!currentcard.equals(firstSuit)){
				flush = false;
			}
		}

		//Sraight for hand under 9
		boolean straight = false;
		if (ranks[1] == ranks[0]+1 && ranks[2] == ranks[1]+1 && ranks[3] == ranks[2]+1 && ranks[4] == ranks[4]+1) {
			straight = true;
		}

		//straight above 10
		if (ranks[4] == 14 && ranks[0] == 2 && ranks[1] == 3 && ranks[2] == 4 && ranks[3] == 5) {
			straight = true;
		}

		// sorting for poker hands number of pairs 2 3 4 5

		int quadcount = 0;
        int triplecount = 0;
        int paircount = 0;

        for (int i = 0; i < counts.length; i++) {
            int countValue = counts[i];
            if (countValue == 5) {
				return 10;
			} 
            if (countValue == 4) {
				quadcount++;
			}
            if (countValue == 3) { 
				triplecount++;
			}
            if (countValue == 2) {
				 paircount++;
			}


        }

		if (straight == true && flush == true){
			return 900;
		}
			
		if (quadcount == 1){
			return 800;
		}

		if (triplecount ==1 && paircount ==1) {
			return 700;
		}
		if (straight == true){
			return 600;
		}

		if (flush == true){
			return 500;
		}

		if (triplecount == 1){
			return 400;
		}

		if (paircount == 2) {
			return 300;
		}

		if (paircount == 1) {
			return 200;
		}
		//getting hte highest card
		//sorting my number value 
		int highcard = ranks[4];
		return 100 + highcard;
	}

}


		// 
		//Straight flush. Five cards of sequential rank that are all of the same suit. ...
			//Four of a kind. Four cards of the same rank, plus one of another rank. ...
			//Full House
			//Flush
			//Straight
			//Three of a kind
			//Two pair
			//High card
			

		


/*
	
		
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
	
*/






