package xixuan.froggerapp.views;

import xixuan.froggerapp.models.WetTurtle;
import xixuan.froggerapp.settings.MyStage;

public class WetTurtleView {
	MyStage background; 
	
	public WetTurtleView(MyStage background) {
		this.background = background;
	}
	
	//Display the wet turtle in the game
	public void viewWetTurtle(WetTurtle model) {
		background.add(model);
	}
	
	//Remove the wet turtle in the game
	public void removeWetTurtle(WetTurtle model) {
		background.remove(model);
	}
		
}