package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.TurtleController;
import xixuan.froggerapp.models.Frog;
import xixuan.froggerapp.models.Turtle;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.TurtleView;


public class TurtlesInitializer implements Initializable {
	private MyStage background;
	TurtleController turtle1controller;
	TurtleController turtle2controller;
	TurtleController turtle3controller;
	
	public TurtlesInitializer(MyStage background) {
		this.background = background;
	}

	public void initialize() { 
		
		Turtle turtle1model = new Turtle(130, 500, 376, -1);
		TurtleView turtle1view = new TurtleView(background);
		turtle1controller = new TurtleController(turtle1model, turtle1view);
		turtle1controller.updateView();
		
		Turtle turtle2model = new Turtle(130, 300, 376, -1);
		TurtleView turtle2view = new TurtleView(background);
		turtle2controller = new TurtleController(turtle2model, turtle2view);
		turtle2controller.updateView();
		
		Turtle Turtle3model = new Turtle(130, 400, 222, -1);
		TurtleView Turtle3view = new TurtleView(background);
		turtle3controller = new TurtleController(Turtle3model, Turtle3view);
		turtle3controller.updateView();
		
	}
	
	public void normal_settings() {
		Frog.turtleIntersectSpeed = -1.4;
		turtle1controller.setTurtleSpeed(Frog.turtleIntersectSpeed);
		turtle2controller.setTurtleSpeed(Frog.turtleIntersectSpeed);
		turtle3controller.setTurtleSpeed(Frog.turtleIntersectSpeed);
	}
}
