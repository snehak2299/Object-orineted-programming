package com.bridglab.objectoriented;

public class DeckOfCards {
	static int[] deck=new int[52];
	static String[] suit= {"Clubs","Diamonds","Hearts","Spades"};
	static String rank[]= {"2","3","4","5","6","7","8","9","10","Jack","Queen","king","Ace"};
	static String suitArray[];
	
	public static void shuffleCards(int[] deck) {


		for(int i=0;i<deck.length;i++) {
			
			int position=(int)(Math.random()*deck.length);		
		     int var=deck[i];
		     deck[i]=deck[position];
		     deck[position]=var;
		}
		
	}
    public static void displayCards(int[] deck,String suitArray[],String rankArray[]) {
		
		for(int i=0;i<deck.length;i++) {
			String suit=suitArray[deck[i]/13];
			String rank=rankArray[deck[i]%13];
			System.out.println(suit+" : "+rank);
		}
		
	}
    public static void distruteCards(int deck[]) {
		int card=0;
		for(int i=1;i<5;i++){
			System.out.print("For Player " + i + ": \n");
			for (int j = 1; j < 10; j++) {

				System.out.print(suit[card]+rank[card]+ "  ");
				card++;
			}
			System.out.println();
		}
	}
    public static void main(String[] args) {
    	for(int i=0;i<deck.length;i++) {
		    deck[i]=i;
	     }
    	shuffleCards(deck);
	    displayCards(deck,suit,rank);
	    distruteCards(deck);
	}
     
}
