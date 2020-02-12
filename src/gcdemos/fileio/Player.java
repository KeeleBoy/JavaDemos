package gcdemos.fileio;

public class Player {

	private String name;
	private int jerseyNum;
	private String teamName;

	public Player(String name, int jerseyNum, String teamName) {
		super();
		this.name = name;
		this.jerseyNum = jerseyNum;
		this.setTeamName(teamName);
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", jerseyNum=" + jerseyNum + ", teamName=" + teamName + "]";
	}

	public Player() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJerseyNum() {
		return jerseyNum;
	}

	public void setJerseyNum(int jerseyNum) {
		this.jerseyNum = jerseyNum;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

}
