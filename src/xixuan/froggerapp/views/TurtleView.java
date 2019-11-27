package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Turtle;
import xixuan.froggerapp.models.WetTurtle;
import xixuan.froggerapp.settings.MyStage;

public class TurtleView {
	MyStage background; 

	public TurtleView(MyStage background) {
		this.background = background;
	}
	
	public void viewTurtles() {
		background.add(new Turtle(500, 376, -1, 130, 130));
		background.add(new Turtle(300, 376, -1, 130, 130));
		background.add(new WetTurtle(700, 376, -1, 130, 130));
		background.add(new WetTurtle(600, 217, -1, 130, 130));
		background.add(new WetTurtle(400, 217, -1, 130, 130));
		background.add(new WetTurtle(200, 217, -1, 130, 130));
	}
}
