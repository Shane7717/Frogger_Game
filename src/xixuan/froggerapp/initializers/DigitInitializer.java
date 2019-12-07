package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.DigitController;
import xixuan.froggerapp.models.Digit;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.DigitView;

public class DigitInitializer implements Initializable {
	private MyStage background;
	private int digit_position = 100;
	
	public DigitInitializer(MyStage background) {
		this.background = background;
	}
	
	public void initialize() {
		Digit digit = new Digit(0, 30, digit_position, 28);
		DigitView digitView = new DigitView(background);
		DigitController digitController = new DigitController(digit, digitView);
		digitController.updateView();
	}

}
