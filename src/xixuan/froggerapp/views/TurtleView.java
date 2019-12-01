package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Turtle;
import xixuan.froggerapp.settings.MyStage;

public class TurtleView {
	MyStage background; 
	
	public TurtleView(MyStage background) {
		this.background = background;
	}
	
	//Display the log on the screen
	public void viewTurtle(Turtle model) {
		background.add(model);
	}
}