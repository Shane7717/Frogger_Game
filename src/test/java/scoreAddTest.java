package test.java;

import static org.junit.Assert.*;
import org.junit.Test;
import main.java.xixuan.froggerapp.highscores.HighscoreManager;

/**
 * This class tests the correctness of the "addScore" method of HighscoreManager.<br>
 * This ensures the correct adding of the player's final score.
 * @see main.java.xixuan.froggerapp.highscores.HighscoreManager
 * @author XIXUAN WANG
 */
public class scoreAddTest {

	@Test
	public void test() {
		 HighscoreManager hsManager = HighscoreManager.getInstance();
		 int beforeLength =  hsManager.getScores().size();
		 hsManager.addScore("junit", 1);
		 int afterLength =  hsManager.getScores().size();
		 assertEquals(beforeLength + 1, afterLength);		 
	}
}
