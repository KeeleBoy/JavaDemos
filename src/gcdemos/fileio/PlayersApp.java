package gcdemos.fileio;

import java.util.Arrays;
import java.util.List;

public class PlayersApp {

	// FileHelper constructor requires file path and a line converter.
	private static FileHelper<Player> helper = new FileHelper<>("players.txt", new PlayerLineConverter());

	public static void main(String[] args) {

		helper.rewrite(Arrays.asList(new Player("Kortana", 12, "Sharks"), new Player("Breeze", 3, "Dolphins")));

		helper.append(new Player("Ronda", 77, "Sharks"));
		helper.append(new Player("Billie", 34, "Dolphins"));

		List<Player> players = helper.readAll();
		for (Player p : players) {
			System.out.println(p);
		}
	}

}
