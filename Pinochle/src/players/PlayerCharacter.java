package players;

import java.util.Scanner;

public class PlayerCharacter implements Player {

	@Override
	public int bid() {
		Scanner playerInput = new Scanner(System.in);
		int bid;

		System.out.print("Enter bid: ");
		while (!playerInput.hasNextInt()) {
			System.out.println("Your input does not match the criteria, please enter a number.");
			playerInput.next();
		}
		bid = playerInput.nextInt();
		System.out.println("\nYou bid " + bid);
		playerInput.close();
		return bid;
	}
}
