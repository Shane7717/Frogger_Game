package main.java.xixuan.froggerapp.highscores;

import java.io.Serializable;

/**
 * This class stores a player's game score ,his name and corresponding difficulty level.
 * @author XIXUAN WANG
 */
@SuppressWarnings("serial")
public class Score implements Serializable {
	
	private int score;
	private String name;
	private String level;
	
	public Score(String name, int score, String level) {
		this.name = name;
		this.score = score;
		this.level = level;
	}
	
	/**
	 * Player score getter
	 * @return the player's score
	 */
	public int getScore() {
		return this.score;
	}
	
	/**
	 * Player name getter
	 * @return the player's name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Player difficulty level getter
	 * @return the player's chosen difficulty level
	 */
	public String getLevel() {
		return this.level;
	}
}
