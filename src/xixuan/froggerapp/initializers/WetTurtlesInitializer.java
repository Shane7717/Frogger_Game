package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.WetTurtleController;
import xixuan.froggerapp.models.Frog;
import xixuan.froggerapp.models.WetTurtle;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.WetTurtleView;

public class WetTurtlesInitializer implements Initializable {
	
	private MyStage background;
	private WetTurtle[] wetTurtleModels = new WetTurtle[3];
	private WetTurtleController[] wetTurtleControllers = new WetTurtleController[3];
	private WetTurtleView[] wetTurtleViews = new WetTurtleView[3];
		
	public WetTurtlesInitializer(MyStage background) {
		this.background = background;
	}
	
	public void initialize() { 
		Frog.turtleIntersectSpeed = -0.8;
		wetTurtleModels[0] = new WetTurtle(130, 700, 376, Frog.turtleIntersectSpeed);
		wetTurtleViews[0] = new WetTurtleView(background);
		wetTurtleControllers[0] = new WetTurtleController(wetTurtleModels[0], wetTurtleViews[0]);
		wetTurtleControllers[0].updateView();
	
		wetTurtleModels[1] = new WetTurtle(130, 600, 222, Frog.turtleIntersectSpeed);
		wetTurtleViews[1] = new WetTurtleView(background);
		wetTurtleControllers[1] = new WetTurtleController(wetTurtleModels[1], wetTurtleViews[1]);
		wetTurtleControllers[1].updateView();
				
		wetTurtleModels[2] = new WetTurtle(130, 200, 222, Frog.turtleIntersectSpeed);
		wetTurtleViews[2] = new WetTurtleView(background);
		wetTurtleControllers[2] = new WetTurtleController(wetTurtleModels[2], wetTurtleViews[2]);
		wetTurtleControllers[2].updateView();	
	}
	
	//Settings for normal game level
	public void normal_settings() {
		Frog.turtleIntersectSpeed = -1.6;
		wetTurtleControllers[0].setWetTurtleSpeed(Frog.turtleIntersectSpeed);
		wetTurtleControllers[1].removeView();
		wetTurtleControllers[2].setWetTurtleSpeed(Frog.turtleIntersectSpeed);
	}
	
	//Settings for hard game level
	public void hard_settings() {
		Frog.turtleIntersectSpeed = -3.2;
		wetTurtleControllers[0].setWetTurtleSpeed(Frog.turtleIntersectSpeed);
		wetTurtleControllers[1].removeView();
		wetTurtleControllers[2].setWetTurtleSpeed(Frog.turtleIntersectSpeed);
	}
	
	//Settings for extra game level
	public void extra_settings() {
		Frog.turtleIntersectSpeed = 0;
		for (int i = 0; i <=2; ++i) {
			wetTurtleControllers[i].removeView();
		}
	}
}
