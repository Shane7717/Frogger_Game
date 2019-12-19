package main.java.xixuan.froggerapp.views;

import main.java.xixuan.froggerapp.models.Digit;
import main.java.xixuan.froggerapp.settings.MyStage;

/**
 * This class displays a digit in the game.
 * @author XIXUAN WANG
 */
public class DigitView {
	MyStage background;

	public DigitView(MyStage background) {
		this.background = background;
	}
	
	/**
	 * This adds the digit into the game.
	 * @param model an instance of Digit
	 */
	public void viewDigit(Digit model) {
		background.add(model);
	}
}
