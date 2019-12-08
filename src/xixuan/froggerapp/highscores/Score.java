package xixuan.froggerapp.highscores;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Score implements Serializable {
	private int score;
	private String name;
	
	public Score(String name, int score) {
		this.name = name;
		this.score = score;
	}

	//Player score getter
	public int getScore() {
		return this.score;
	}
	
	//Player name getter
	public String getName() {
		return this.name;
	}
}
