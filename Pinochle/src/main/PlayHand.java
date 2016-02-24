package main;
import java.util.*;

import players.Player;
import players.PlayerCharacter;
import players.NonPlayerCharacter;

public class PlayHand {
	private static final int NUM_HANDS = 4;
	private static final int CARDS_PER_HAND = 12;
	private static final int UNIQUE_CARDS = 24;
	
	public static void main(String[] args) {
		int[][] hand = DealHand();
		for(int i = 0; i < UNIQUE_CARDS; i++){
			System.out.println(hand[0][i]+" "+hand[1][i]+" "+hand[2][i]+" "+hand[3][i]);
		}
	}
	
	public static int[][] dealHand() {
		int[] threshold = new int[NUM_HANDS];
		for(int i = 0; i < NUM_HANDS; i++){
			threshold[i] = CARDS_PER_HAND * (i + 1);
		}
		int[][] hand = new int[NUM_HANDS][UNIQUE_CARDS];
		Random rand = new Random();
		while(threshold[NUM_HANDS - 1] > 0){
			int i = rand.nextInt(threshold[NUM_HANDS - 1]);
			int player;
			for(player = 0; i >= threshold[player]; player++){}
			hand[player][threshold[NUM_HANDS - 1] % UNIQUE_CARDS]++;
			for(int j = player; j < NUM_HANDS; j++){
				threshold[j]--;
			}
		}
		return hand;
	}
}
