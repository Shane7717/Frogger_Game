package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Digit;
import xixuan.froggerapp.settings.MyStage;

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
