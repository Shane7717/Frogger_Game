package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Digit;
import xixuan.froggerapp.settings.MyStage;

public class DigitView {
	MyStage background;

	public DigitView(MyStage background) {
		this.background = background;
	}
	
	//Display the frog that player manipulates.
	public void viewDigit(Digit model) {
		background.add(model);
	}
}
