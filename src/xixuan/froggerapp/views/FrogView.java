package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Frog;
import xixuan.froggerapp.settings.MyStage;

public class FrogView {
	MyStage background;
	Frog mainFrog;

	public FrogView(MyStage background, Frog mainFrog) {
		this.background = background;
		this.mainFrog = mainFrog;
	}
	
	//Display the frog that player manipulates.
	public void viewFrog() {
		background.add(mainFrog);
	}
}
