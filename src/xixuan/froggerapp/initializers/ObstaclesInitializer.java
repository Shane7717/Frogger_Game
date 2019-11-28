package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.ObstacleController;
import xixuan.froggerapp.models.Obstacle;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.ObstacleView;

public class ObstaclesInitializer implements Initializable {
	MyStage background;
	
	public ObstaclesInitializer(MyStage background) {
		this.background = background;
	}

	public void initialize() { 
		
		Obstacle obstacle1model = new Obstacle( "file:resources/images/obstacles/"+"truck1"+"Right.png", 120, 0, 649, 1); 
		ObstacleView obstacle1view = new ObstacleView(background);
		ObstacleController obstacle1controller = new ObstacleController(obstacle1model, obstacle1view);
		obstacle1controller.updateView();
		
		Obstacle obstacle2model = new Obstacle( "file:resources/images/obstacles/"+"truck1"+"Right.png", 120, 300, 649, 1); 
		ObstacleView obstacle2view = new ObstacleView(background);
		ObstacleController obstacle2controller = new ObstacleController(obstacle2model, obstacle2view);
		obstacle2controller.updateView();
		
		Obstacle obstacle3model = new Obstacle( "file:resources/images/obstacles/"+"truck1"+"Right.png", 120, 600, 649, 1);
		ObstacleView obstacle3view = new ObstacleView(background);
		ObstacleController obstacle3controller = new ObstacleController(obstacle3model, obstacle3view);
		obstacle3controller.updateView();
		
		Obstacle obstacle4model = new Obstacle( "file:resources/images/obstacles/"+ "car1Left.png", 50, 100, 597, -1);
		ObstacleView obstacle4view = new ObstacleView(background);
		ObstacleController obstacle4controller = new ObstacleController(obstacle4model, obstacle4view);
		obstacle4controller.updateView();
		
		Obstacle obstacle5model = new Obstacle( "file:resources/images/obstacles/"+"car1Left.png", 50, 250, 597, -1);
		ObstacleView obstacle5view = new ObstacleView(background);
		ObstacleController obstacle5controller = new ObstacleController(obstacle5model, obstacle5view);
		obstacle5controller.updateView();
		
		Obstacle obstacle6model = new Obstacle( "file:resources/images/obstacles/"+"car1Left.png", 50, 400, 597, -1);
		ObstacleView obstacle6view = new ObstacleView(background);
		ObstacleController obstacle6controller = new ObstacleController(obstacle6model, obstacle6view);
		obstacle6controller.updateView();
		
		Obstacle obstacle7model = new Obstacle( "file:resources/images/obstacles/"+"car1Left.png", 50, 550, 597, -1);
		ObstacleView obstacle7view = new ObstacleView(background);
		ObstacleController obstacle7controller = new ObstacleController(obstacle7model, obstacle7view);
		obstacle7controller.updateView();
		
		Obstacle obstacle8model = new Obstacle( "file:resources/images/obstacles/"+"truck2Right.png", 200, 0, 540, 1);
		ObstacleView obstacle8view = new ObstacleView(background);
		ObstacleController obstacle8controller = new ObstacleController(obstacle8model, obstacle8view);
		obstacle8controller.updateView();
		
		Obstacle obstacle9model = new Obstacle( "file:resources/images/obstacles/"+ "truck2Right.png", 200, 500, 540, 1);
		ObstacleView obstacle9view = new ObstacleView(background);
		ObstacleController obstacle9controller = new ObstacleController(obstacle9model, obstacle9view);
		obstacle9controller.updateView();
		
		Obstacle obstacle10model = new Obstacle( "file:resources/images/obstacles/"+"car1Left.png", 50, 500, 490, -5);
		ObstacleView obstacle10view = new ObstacleView(background);
		ObstacleController obstacle10controller = new ObstacleController(obstacle10model, obstacle10view);
		obstacle10controller.updateView();
		
	}
}
