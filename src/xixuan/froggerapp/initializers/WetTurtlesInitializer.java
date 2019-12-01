package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.WetTurtleController;
import xixuan.froggerapp.models.Frog;
import xixuan.froggerapp.models.WetTurtle;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.WetTurtleView;

public class WetTurtlesInitializer implements Initializable {
	
	private MyStage background;
	WetTurtleController wetTurtle1controller;
	WetTurtleController wetTurtle2controller;
	WetTurtleController wetTurtle3controller;
	
	
	public WetTurtlesInitializer(MyStage background) {
		this.background = background;
	}

	public void initialize() { 
		Frog.turtleIntersectSpeed = -0.7;
		WetTurtle wetTurtle1model = new WetTurtle(130, 700, 376, Frog.turtleIntersectSpeed);
		WetTurtleView wetTurtle1view = new WetTurtleView(background);
		wetTurtle1controller = new WetTurtleController(wetTurtle1model, wetTurtle1view);
		wetTurtle1controller.updateView();
	
		WetTurtle wetTurtle2model = new WetTurtle(130, 600, 222, Frog.turtleIntersectSpeed);
		WetTurtleView wetTurtle2view = new WetTurtleView(background);
		wetTurtle2controller = new WetTurtleController(wetTurtle2model, wetTurtle2view);
		wetTurtle2controller.updateView();
				
		WetTurtle wetTurtle3model = new WetTurtle(130, 200, 222, Frog.turtleIntersectSpeed);
		WetTurtleView wetTurtle3view = new WetTurtleView(background);
		wetTurtle3controller = new WetTurtleController(wetTurtle3model, wetTurtle3view);
		wetTurtle3controller.updateView();	
	}
	
	public void normal_settings() {
		Frog.turtleIntersectSpeed = -1.4;
		wetTurtle1controller.setWetTurtleSpeed(Frog.turtleIntersectSpeed);
		wetTurtle2controller.setWetTurtleSpeed(Frog.turtleIntersectSpeed);
		wetTurtle3controller.setWetTurtleSpeed(Frog.turtleIntersectSpeed);
	}
	
	public void hard_settings() {
		Frog.turtleIntersectSpeed = -3.2;
		wetTurtle1controller.setWetTurtleSpeed(Frog.turtleIntersectSpeed);
		wetTurtle2controller.setWetTurtleSpeed(Frog.turtleIntersectSpeed);
		wetTurtle3controller.setWetTurtleSpeed(Frog.turtleIntersectSpeed);
	}
	
	public void nightmare_settings() {
		Frog.turtleIntersectSpeed = -6.4;
		wetTurtle1controller.setWetTurtleSpeed(Frog.turtleIntersectSpeed);
		wetTurtle2controller.setWetTurtleSpeed(Frog.turtleIntersectSpeed);
		wetTurtle3controller.setWetTurtleSpeed(Frog.turtleIntersectSpeed);
	}
}
