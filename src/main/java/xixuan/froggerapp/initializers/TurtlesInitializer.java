package main.java.xixuan.froggerapp.initializers;

import main.java.xixuan.froggerapp.controllers.TurtleController;
import main.java.xixuan.froggerapp.models.Frog;
import main.java.xixuan.froggerapp.models.Turtle;
import main.java.xixuan.froggerapp.settings.MyStage;
import main.java.xixuan.froggerapp.views.TurtleView;

/**
 * This class initializes all the relevant instances of Crocodile.
 * @author XIXUAN WANG
 */
public class TurtlesInitializer implements Initializable {
	private MyStage background;
	private Turtle[] turtleModels = new Turtle[3];
	private TurtleController[] turtleControllers = new TurtleController[3];
	private TurtleView[] turtleViews = new TurtleView[3];
		
	public TurtlesInitializer(MyStage background) {
		this.background = background;
	}
	
	/**
	 * This initializes three turtles in the game.
	 */
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
	
	/**
	 * This sets relevant parameters for the normal game level.<br> 
	 * Specifically, this adjusts the speed of two turtles and removes one.
	 */
	public void normal_settings() {
		Frog.turtleIntersectSpeed = -1.6;
		turtleControllers[0].removeView();
		turtleControllers[1].setTurtleSpeed(Frog.turtleIntersectSpeed);
		turtleControllers[2].setTurtleSpeed(Frog.turtleIntersectSpeed);
	}
	
	/**
	 * This sets relevant parameters for the hard game level.<br> 
	 * Specifically, this adjusts the speed of two turtles and removes one.
	 */
	public void hard_settings() {
		Frog.turtleIntersectSpeed = -3.2;
		turtleControllers[0].removeView();
		turtleControllers[1].setTurtleSpeed(Frog.turtleIntersectSpeed);
		turtleControllers[2].setTurtleSpeed(Frog.turtleIntersectSpeed);
	}
	
	/**
	 * This sets relevant parameters for the extra game level.<br> 
	 * Specifically, this removes all the turtles in the game.
	 */
	public void extra_settings() {
		Frog.turtleIntersectSpeed = 0;
		for (int i = 0; i <= 2; ++i) {
			turtleControllers[i].removeView();
		}	
	}
}
