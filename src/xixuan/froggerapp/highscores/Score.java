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

	public int getScore() {
		return this.score;
	}
	
	public String getName() {
		return this.name;
	}
}
