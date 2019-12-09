package test.java;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import main.java.xixuan.froggerapp.highscores.ScoreComparator;
import main.java.xixuan.froggerapp.highscores.Score;

/**
 * This class tests the correctness of ScoreComparator.<br>
 * Specifically, it tests the method "compare" of ScoreComparator.
 * @see main.java.xixuan.froggerapp.highscores.ScoreComparator
 * @author XIXUAN WANG
 */
class ScoreComparatorTest {

	@Test
	void test() {
		ScoreComparator comparator = ScoreComparator.getInstance();
		Score instance1 = new Score("tester1", 200);
		Score instance2 = new Score("tester2", 300);
		Score instance3 = new Score("tester3", 200);
		int result = comparator.compare(instance1, instance2);
		assertEquals(1, result);
		result = comparator.compare(instance2, instance1);
		assertEquals(-1, result);
		result = comparator.compare(instance3, instance1);
		assertEquals(0, result);
	}

}
