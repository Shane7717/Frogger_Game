package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.TurtleController;
import xixuan.froggerapp.models.Turtle;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.TurtleView;

public class TurtlesInitializer implements Initializable {
	private MyStage background;
	
	public TurtlesInitializer(MyStage background) {
		this.background = background;
	}

	public void initialize() { 
		
		Turtle turtle1model = new Turtle(130, 500, 376, -1);
		TurtleView turtle1view = new TurtleView(background);
		TurtleController turtle1controller = new TurtleController(turtle1model, turtle1view);
		turtle1controller.updateView();
		
		Turtle turtle2model = new Turtle(130, 300, 376, -1);
		TurtleView turtle2view = new TurtleView(background);
		TurtleController turtle2controller = new TurtleController(turtle2model, turtle2view);
		turtle2controller.updateView();
		
	}
}
