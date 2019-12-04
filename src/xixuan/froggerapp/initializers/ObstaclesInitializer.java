package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.ObstacleController;
import xixuan.froggerapp.models.Obstacle;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.ObstacleView;

public class ObstaclesInitializer implements Initializable {
	
	private MyStage background;
	ObstacleController obstacle1controller; 
	ObstacleController obstacle2controller; 
	ObstacleController obstacle3controller; 
	ObstacleController obstacle4controller; 
	ObstacleController obstacle5controller; 
	ObstacleController obstacle6controller; 
	ObstacleController obstacle7controller; 
	ObstacleController obstacle8controller; 
	ObstacleController obstacle9controller; 
	ObstacleController obstacle10controller;
	ObstacleController obstacle11controller; 
	
	public ObstaclesInitializer(MyStage background) {
		this.background = background;
	}

	public void initialize() { 
		double rightSpeed = 0.8;
		double leftSpeed = 0.8;
		
		Obstacle obstacle1model = new Obstacle( "file:resources/images/obstacles/"+"car1"+"Right.png", 50, 0, 653, rightSpeed); 
		ObstacleView obstacle1view = new ObstacleView(background);
		obstacle1controller = new ObstacleController(obstacle1model, obstacle1view);
		obstacle1controller.updateView();
		
		Obstacle obstacle2model = new Obstacle( "file:resources/images/obstacles/"+"truck1"+"Right.png", 120, 300, 653, rightSpeed); 
		ObstacleView obstacle2view = new ObstacleView(background);
		obstacle2controller = new ObstacleController(obstacle2model, obstacle2view);
		obstacle2controller.updateView();
		
		Obstacle obstacle3model = new Obstacle( "file:resources/images/obstacles/"+"car2"+"Right.png", 50, 600, 653, rightSpeed);
		ObstacleView obstacle3view = new ObstacleView(background);
		obstacle3controller = new ObstacleController(obstacle3model, obstacle3view);
		obstacle3controller.updateView();
		
		Obstacle obstacle4model = new Obstacle( "file:resources/images/obstacles/"+ "car1Left.png", 50, 100, 593, leftSpeed);
		ObstacleView obstacle4view = new ObstacleView(background);
		obstacle4controller = new ObstacleController(obstacle4model, obstacle4view);
		obstacle4controller.updateView();
		
		Obstacle obstacle5model = new Obstacle( "file:resources/images/obstacles/"+"car2Left.png", 50, 250, 597, leftSpeed);
		ObstacleView obstacle5view = new ObstacleView(background);
		obstacle5controller = new ObstacleController(obstacle5model, obstacle5view);
		obstacle5controller.updateView();
		
		Obstacle obstacle6model = new Obstacle( "file:resources/images/obstacles/"+"car1Left.png", 50, 400, 593, leftSpeed);
		ObstacleView obstacle6view = new ObstacleView(background);
		obstacle6controller = new ObstacleController(obstacle6model, obstacle6view);
		obstacle6controller.updateView();
		
		Obstacle obstacle7model = new Obstacle( "file:resources/images/obstacles/"+"car2Left.png", 50, 550, 597, leftSpeed);
		ObstacleView obstacle7view = new ObstacleView(background);
		obstacle7controller = new ObstacleController(obstacle7model, obstacle7view);
		obstacle7controller.updateView();
		
		Obstacle obstacle8model = new Obstacle( "file:resources/images/obstacles/"+"truck2Right.png", 200, 0, 540, rightSpeed);
		ObstacleView obstacle8view = new ObstacleView(background);
		obstacle8controller = new ObstacleController(obstacle8model, obstacle8view);
		obstacle8controller.updateView();
		
		Obstacle obstacle9model = new Obstacle( "file:resources/images/obstacles/"+ "truck2Right.png", 200, 500, 540, rightSpeed);
		ObstacleView obstacle9view = new ObstacleView(background);
		obstacle9controller = new ObstacleController(obstacle9model, obstacle9view);
		obstacle9controller.updateView();
		
		Obstacle obstacle11model = new Obstacle( "file:resources/images/obstacles/"+ "car2Right.png", 50, 330, 540, rightSpeed);
		ObstacleView obstacle11view = new ObstacleView(background);
		obstacle11controller = new ObstacleController(obstacle11model, obstacle11view);
		obstacle11controller.updateView();
		
		Obstacle obstacle10model = new Obstacle( "file:resources/images/obstacles/"+"racingCar.png", 50, 500, 486, -2.5);
		ObstacleView obstacle10view = new ObstacleView(background);
		obstacle10controller = new ObstacleController(obstacle10model, obstacle10view);
		obstacle10controller.updateView();
		
	}
	
	public void normal_settings() {
		obstacle1controller.setObstacleSpeed(1.4);
		obstacle2controller.setObstacleSpeed(1.4);
		obstacle3controller.setObstacleSpeed(1.4);
		obstacle4controller.setObstacleSpeed(-1.4);
		obstacle5controller.setObstacleSpeed(-1.4);
		obstacle6controller.setObstacleSpeed(-1.4);
		obstacle7controller.setObstacleSpeed(-1.4);
		obstacle8controller.setObstacleSpeed(1.4);
		obstacle9controller.setObstacleSpeed(1.4);
		obstacle11controller.setObstacleSpeed(1.4);
		obstacle10controller.setObstacleSpeed(-5);	
	}
	
	public void hard_settings() {
		obstacle1controller.setObstacleSpeed(2.8);
		obstacle2controller.setObstacleSpeed(2.8);
		obstacle3controller.setObstacleSpeed(2.8);
		obstacle4controller.setObstacleSpeed(-2.8);
		obstacle5controller.setObstacleSpeed(-2.8);
		obstacle6controller.setObstacleSpeed(-2.8);
		obstacle7controller.setObstacleSpeed(-2.8);
		obstacle8controller.setObstacleSpeed(2.8);
		obstacle9controller.setObstacleSpeed(2.8);
		obstacle11controller.setObstacleSpeed(2.8);
		obstacle10controller.setObstacleSpeed(-10);	
	}
	
	public void nightmare_settings() {
		obstacle1controller.setObstacleSpeed(3.5);
		obstacle2controller.setObstacleSpeed(3.5);
		obstacle3controller.setObstacleSpeed(3.5);
		obstacle4controller.setObstacleSpeed(-3.5);
		obstacle5controller.setObstacleSpeed(-3.5);
		obstacle6controller.setObstacleSpeed(-3.5);
		obstacle7controller.setObstacleSpeed(-3.5);
		obstacle8controller.setObstacleSpeed(3.5);
		obstacle9controller.setObstacleSpeed(3.5);
		obstacle11controller.setObstacleSpeed(3.5);
		obstacle10controller.setObstacleSpeed(-15);	
	}
}
