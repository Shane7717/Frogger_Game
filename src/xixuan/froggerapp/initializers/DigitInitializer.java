package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.DigitController;
import xixuan.froggerapp.models.Digit;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.DigitView;

public class DigitInitializer implements Initializable {
	private MyStage background;
	private int base_position = 300;
	
	public DigitInitializer(MyStage background) {
		this.background = background;
	}
	
	@Override
	public void initialize() {
		Digit digit = new Digit(0, 30, base_position, 25);
		DigitView digitView = new DigitView(background);
		DigitController digitController = new DigitController(digit, digitView);
		digitController.updateView();
	}

}
