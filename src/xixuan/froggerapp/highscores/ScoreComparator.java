package xixuan.froggerapp.highscores;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Score>{
	private static ScoreComparator uniqueComparator; //Singleton
	
	private ScoreComparator() {}
	
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
	
	//Used for Singleton design pattern
	public static ScoreComparator getInstance() {
		if (uniqueComparator == null) {
			uniqueComparator = new ScoreComparator();
		}
		return uniqueComparator;
	}
}
