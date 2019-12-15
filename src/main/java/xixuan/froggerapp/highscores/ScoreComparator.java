package main.java.xixuan.froggerapp.highscores;

import java.util.Comparator;

/**
 * This class implements a mechanism that compares two different scores
 * @author XIXUAN WANG
 */
public class ScoreComparator implements Comparator<Score>{
	/** The unique score comparator instance that uses Singleton Pattern.*/
	private static ScoreComparator uniqueComparator; //Singleton
	
	private ScoreComparator() {}
	
	/**
	 * This compares two players' scores. <br>
	 * @param score1  player1's Score instance
	 * @param score2  player2's Score instance
	 * @return -1 if player1's score is larger than that of player2<br>
	 * 			1 if player2's score is larger than that of player1<br>
	 *			0 if two players' scores are equal
	 */
	@Override
	public int compare(Score score1, Score score2) {
		int sc1 = score1.getScore();
		int sc2 = score2.getScore();
		
		if (sc1 > sc2) {
			return -1;
		} else if (sc1 < sc2) {
			return 1;
		} else {
			return 0;
		}
	}
	
	/**
     * This gets the single instance of ScoreComparator.
     * @return single instance of ScoreComparator.
     */
	public static ScoreComparator getInstance() {
		if (uniqueComparator == null) {
			uniqueComparator = new ScoreComparator();
		}
		return uniqueComparator;
	}
}
