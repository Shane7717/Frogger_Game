package xixuan.froggerapp.initialization;

import xixuan.froggerapp.actors.Turtle;
import xixuan.froggerapp.actors.WetTurtle;
import xixuan.froggerapp.settings.MyStage;

public class TurtlesInit extends Init {
	MyStage background; 

	public TurtlesInit(MyStage background) {
		this.background = background;
	}
	
	public void initialize() {
		background.add(new Turtle(500, 376, -1, 130, 130));
		background.add(new Turtle(300, 376, -1, 130, 130));
		background.add(new WetTurtle(700, 376, -1, 130, 130));
		background.add(new WetTurtle(600, 217, -1, 130, 130));
		background.add(new WetTurtle(400, 217, -1, 130, 130));
		background.add(new WetTurtle(200, 217, -1, 130, 130));
	}
}
