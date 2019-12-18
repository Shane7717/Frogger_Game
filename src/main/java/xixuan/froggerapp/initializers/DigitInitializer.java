package main.java.xixuan.froggerapp.initializers;

import main.java.xixuan.froggerapp.controllers.DigitController;
import main.java.xixuan.froggerapp.models.Digit;
import main.java.xixuan.froggerapp.settings.MyStage;
import main.java.xixuan.froggerapp.views.DigitView;

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
	 * This initializes three digits "0" in the game as the base score number. <br><br>
	 * When the player's score has changed, his changed score will be shown on the screen, replacing these 3 digits.
	 */
	public void initialize() {
		Digit digitUnit = new Digit(0, 30, digit_position, 28);
		DigitView digitUnitView = new DigitView(background);
		DigitController digitUnitController = new DigitController(digitUnit, digitUnitView);
		digitUnitController.updateView();
		
		Digit digitDecade = new Digit(0, 30, digit_position - 30, 28);
		DigitView digitDecadeView = new DigitView(background);
		DigitController digitDecadeController = new DigitController(digitDecade, digitDecadeView);
		digitDecadeController.updateView();
		
		Digit digitHundred = new Digit(0, 30, digit_position - 60, 28);
		DigitView digitHundredView = new DigitView(background);
		DigitController digitHundredController = new DigitController(digitHundred, digitHundredView);
		digitHundredController.updateView();		
	}
}
