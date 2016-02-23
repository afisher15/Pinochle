package main;

import players.Player;
import players.PlayerCharacter;
import players.NonPlayerCharacter;

public class RunGame {
	public static void main(String[] args) {
		Player p = new PlayerCharacter();
		p.bid();
	}
}
