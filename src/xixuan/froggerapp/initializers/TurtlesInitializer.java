package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.TurtleController;
import xixuan.froggerapp.models.Frog;
import xixuan.froggerapp.models.Turtle;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.TurtleView;

public class TurtlesInitializer implements Initializable {
	private MyStage background;
	private Turtle[] turtleModels = new Turtle[3];
	private TurtleController[] turtleControllers = new TurtleController[3];
	private TurtleView[] turtleViews = new TurtleView[3];
		
	public TurtlesInitializer(MyStage background) {
		this.background = background;
	}

	public void initialize() { 
		Frog.turtleIntersectSpeed = -0.8;
		turtleModels[0]= new Turtle(130, 500, 376, Frog.turtleIntersectSpeed);
		turtleViews[0] = new TurtleView(background);
		turtleControllers[0] = new TurtleController(turtleModels[0], turtleViews[0]);
		turtleControllers[0].updateView();
			
		turtleModels[1]= new Turtle(130, 300, 376, Frog.turtleIntersectSpeed);
		turtleViews[1] = new TurtleView(background);
		turtleControllers[1] = new TurtleController(turtleModels[1], turtleViews[1]);
		turtleControllers[1].updateView();
				
		turtleModels[2]= new Turtle(130, 400, 222, Frog.turtleIntersectSpeed);
		turtleViews[2] = new TurtleView(background);
		turtleControllers[2] = new TurtleController(turtleModels[2], turtleViews[2]);
		turtleControllers[2].updateView();
		
	}
	
	//Settings for normal game level
	public void normal_settings() {
		Frog.turtleIntersectSpeed = -1.6;
		turtleControllers[0].removeView();
		turtleControllers[1].setTurtleSpeed(Frog.turtleIntersectSpeed);
		turtleControllers[2].setTurtleSpeed(Frog.turtleIntersectSpeed);
	}
	
	//Settings for hard game level
	public void hard_settings() {
		Frog.turtleIntersectSpeed = -3.2;
		turtleControllers[0].removeView();
		turtleControllers[1].setTurtleSpeed(Frog.turtleIntersectSpeed);
		turtleControllers[2].setTurtleSpeed(Frog.turtleIntersectSpeed);
	}
	
	//Settings for extra game level
	public void extra_settings() {
		Frog.turtleIntersectSpeed = 0;
		for (int i = 0; i <= 2; ++i) {
			turtleControllers[i].removeView();
		}	
	}
}
