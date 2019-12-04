package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Crocodile;
import xixuan.froggerapp.settings.MyStage;

public class CrocodileView {
	MyStage background; 
	
	public CrocodileView(MyStage background) {
		this.background = background;
	}
	
	//Display the crocodile on the screen
	public void viewCrocodile(Crocodile model) {
		background.add(model);
	}
}