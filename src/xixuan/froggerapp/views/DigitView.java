package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Digit;
import xixuan.froggerapp.settings.MyStage;

public class DigitView {
	MyStage background;

	public DigitView(MyStage background) {
		this.background = background;
	}
	
	//Display the digit in the game
	public void viewDigit(Digit model) {
		background.add(model);
	}
}
