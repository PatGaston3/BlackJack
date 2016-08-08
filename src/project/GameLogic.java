package project;

import java.util.Scanner;

public class GameLogic {
	Deck deck = new Deck();
	Player player;
	Player computer;
	
	void menu() {
		System.out.println("______________________");
		System.out.println("_____GASTON CASINO____");
		System.out.println("______________________");
		System.out.println("______BLACKJACK_______");
		System.out.println("______________________");
	}
	
	
	void prompt() throws InterruptedException {
		Scanner keyboard = new Scanner(System.in);
		
		menu();
		System.out.println("≈ Welcome to Gaston's Casino!");
		System.out.print("≈ You are Black Jack table 21.\nEnter your first name to play: ");
		String name = keyboard.next();
		
		Player player = new Player(name);
		Player computer = new Player("computer");
		
		System.out.println("\nOkay, " + name + "! Give me a second to deal... ");
		Thread.sleep(2000);
		deck.shuffle(); // shuffle deck before game starts
		
		
		
		
		System.out.println("\nDealer's hand: ");
		computer.hand.addCard(deck.dealCard());
		deck.removeCard(deck.dealCard());
		computer.hand.addCard(deck.dealCard());
		deck.removeCard(deck.dealCard());
		computer.hand.showHand();
		System.out.println("Dealer's hand value: " + computer.hand.getValue());
		
		System.out.println("\nhere is your hand: ");
		player.hand.addCard(deck.dealCard());
		deck.removeCard(deck.dealCard());
		player.hand.addCard(deck.dealCard());
		deck.removeCard(deck.dealCard());
		player.hand.showHand();
		System.out.println("Your hand value: " + player.hand.getValue());
		
		if (player.hand.getValue()  == 21 || computer.hand.getValue() == 21) {
			System.out.println("Game over! no player can be dealt a 21 to start the game!");
			System.exit(0);
		}
	
		int playerVal = player.hand.getValue();
		int dealerVal = computer.hand.getValue();
		while (playerVal  < 22 || dealerVal < 22) {
			System.out.println("'Hit' or 'Stay': ");
			String hit = keyboard.next().toLowerCase();
			
			if (hit.equalsIgnoreCase("hit")) {
				player.hand.addCard(deck.dealCard());
				System.out.println("You picked up: " + deck.dealCard());
				deck.removeCard(deck.dealCard());
				System.out.println("Your new hand: ");
				player.hand.showHand();
				System.out.println("Your hand value: " + player.hand.getValue());
				if( computer.hand.getValue() > 21 ) {
					System.out.println("Bust! The dealer is over 21! You Win");
					System.exit(0);
				}
			
				if( player.hand.getValue() > 21 ) {
					System.out.println("Bust! You're over 21! You lose");
					System.exit(0);
				}
			
				if( computer.hand.getValue() == 21 ) {
					System.out.println("Dealer hit 21! You lose!");
					System.exit(0);
				}
			
				if( player.hand.getValue() == 21 ) {
					System.out.println("BlackJack! You win!");
					System.exit(0);
				}
					if (computer.hand.getValue() >= 17 ){
						System.out.println("Dealer stays.");
					}
				else {
					computer.hand.addCard(deck.dealCard());
					System.out.println("\nDealer picked up: " + deck.dealCard());
					deck.removeCard(deck.dealCard());
					System.out.println("Dealer's hand value: " + computer.hand.getValue());
					if( computer.hand.getValue() > 21 ) {
						System.out.println("Bust! The dealer is over 21! You Win");
						System.exit(0);
					}
					
					if( player.hand.getValue() > 21 ) {
						System.out.println("Bust! You're over 21! You lose");
						System.exit(0);
					}
					
					if( computer.hand.getValue() == 21 ) {
						System.out.println("Dealer hit 21! You lose!");
						System.exit(0);
					}
					
					if( player.hand.getValue() == 21 ) {
						System.out.println("BlackJack! You win!");
						System.exit(0);
					}
				}
			}
			
			if (hit.equalsIgnoreCase("stay")) {
				System.out.println("\nYou chose to stay.");
				if (computer.hand.getValue() >= 17 && 
					computer.hand.getValue() > player.hand.getValue() ){
					System.out.println("\nYou lose! Dealer is closer to 21!");
					System.exit(0);
				}
				if (computer.hand.getValue() < 17) {
					computer.hand.addCard(deck.dealCard());
					System.out.println("Dealer picked up: " + deck.dealCard());
					deck.removeCard(deck.dealCard());
					System.out.println("Your hand value: " + player.hand.getValue());
					if( computer.hand.getValue() > 21 ) {
						System.out.println("Bust! The dealer is over 21! You Win");
						System.exit(0);
					}
					
					if( player.hand.getValue() > 21 ) {
						System.out.println("Bust! You're over 21! You lose");
						System.exit(0);
					}
					
					if( computer.hand.getValue() == 21 ) {
						System.out.println("Dealer hit 21! You lose!");
						System.exit(0);
					}
					
					if( player.hand.getValue() == 21 ) {
						System.out.println("BlackJack! You win!");
						System.exit(0);
					}
					System.out.println("Dealer's hand value: " + computer.hand.getValue());
					System.out.println("");
					player.hand.showHand();
				}
				else {
					System.out.println("\nYou win!");
					System.exit(0);
				}
			}
		}
	}
}
