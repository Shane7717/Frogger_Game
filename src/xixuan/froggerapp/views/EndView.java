package xixuan.froggerapp.views;

import xixuan.froggerapp.models.End;
import xixuan.froggerapp.settings.MyStage;

public class EndView {
	MyStage background; 
	
	public EndView(MyStage background) {
		this.background = background;
	}
	
	//Display the end on the screen
	public void viewEnd(End model) {
		background.add(model);
	}
}