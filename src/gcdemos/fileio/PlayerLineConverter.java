package gcdemos.fileio;

/**
 * An implementation of LineConverter that converts Player objects
 */
public class PlayerLineConverter implements LineConverter<Player> {

	@Override
	public String toLine(Player player) {
		return String.format("%S\t%d\t%S", player.getName(), player.getJerseyNum(), player.getTeamName());
	}

	@Override
	public Player fromLine(String line) {
		String[] parts = line.split("\t");
		String name = parts[0];
		int jerseyNum = Integer.parseInt(parts[1]);
		String teamName = parts[2];

		return new Player(name, jerseyNum, teamName);
	}

}
