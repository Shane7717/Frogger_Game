package xixuan.froggerapp.views;

import xixuan.froggerapp.models.WetTurtle;
import xixuan.froggerapp.settings.MyStage;

public class WetTurtleView {
	MyStage background; 
	
	public WetTurtleView(MyStage background) {
		this.background = background;
	}
	
	//Display the log on the screen
	public void viewWetTurtle(WetTurtle model) {
		background.add(model);
	}
}