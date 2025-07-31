package Objects;

public class Coach {
	private String name;
	private int score;

	public Coach(String name, int points) {
		this.name = name;
		this.score = points;
	}

	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
}
