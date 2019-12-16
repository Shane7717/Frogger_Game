package test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.java.xixuan.froggerapp.highscores.*;

/**
 * This class tests the correctness of ScoreComparator.<br>
 * Specifically, it tests the method "compare" of ScoreComparator.
 * @see main.java.xixuan.froggerapp.highscores.ScoreComparator
 * @author XIXUAN WANG
 */
public class ScoreComparatorTest {

	@Test
	public void test() {
		ScoreComparator comparator = ScoreComparator.getInstance();
		Score instance1 = new Score("tester1", 200, "null");
		Score instance2 = new Score("tester2", 300, "null");
		Score instance3 = new Score("tester3", 200, "null");
		int result = comparator.compare(instance1, instance2);
		assertEquals(1, result);
		result = comparator.compare(instance2, instance1);
		assertEquals(-1, result);
		result = comparator.compare(instance3, instance1);
		assertEquals(0, result);
	}
}
