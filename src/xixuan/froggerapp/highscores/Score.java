package xixuan.froggerapp.highscores;

import java.io.Serializable;

/**
 * This class stores a player's game score and his name.
 * @author XIXUAN WANG
 */
@SuppressWarnings("serial")
public class Score implements Serializable {
	

	private int score;
	private String name;
	
	public Score(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	/**
	 * Player score getter
	 */
	public int getScore() {
		return this.score;
	}
	
	/**
	 * Player name getter
	 * @return player's name
	 */
	public String getName() {
		return this.name;
	}
}
