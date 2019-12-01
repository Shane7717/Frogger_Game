package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Frog;
import xixuan.froggerapp.settings.MyStage;

public class FrogView {
	MyStage background;

	public FrogView(MyStage background) {
		this.background = background;
	}
	
	//Display the frog that player manipulates.
	public void viewFrog(Frog model) {
		background.add(model);
	}
}
