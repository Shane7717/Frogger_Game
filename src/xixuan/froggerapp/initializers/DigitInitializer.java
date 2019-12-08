package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.DigitController;
import xixuan.froggerapp.models.Digit;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.DigitView;

/**
 * This class initializes all the relevant instances of Digit.
 * @author XIXUAN WANG
 */
public class DigitInitializer implements Initializable {
	private MyStage background;
	
	/** This represents the digit's x position*/
	private int digit_position = 100;
	
	public DigitInitializer(MyStage background) {
		this.background = background;
	}
	
	/**
	 * This initializes a digit "0" in the game as the base number.
	 */
	public void initialize() {
		Digit digit = new Digit(0, 30, digit_position, 28);
		DigitView digitView = new DigitView(background);
		DigitController digitController = new DigitController(digit, digitView);
		digitController.updateView();
	}

}
