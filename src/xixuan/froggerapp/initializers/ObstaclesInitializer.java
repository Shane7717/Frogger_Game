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
	ObstacleController obstacle12controller; 
	ObstacleController obstacle13controller; 
	ObstacleController obstacle14controller; 
	ObstacleController obstacle15controller; 
	ObstacleController obstacle16controller; 
	ObstacleController obstacle17controller; 
	ObstacleController obstacle18controller; 
	ObstacleController obstacle19controller; 
	ObstacleController obstacle20controller; 
	
	public ObstaclesInitializer(MyStage background) {
		this.background = background;
	}

	public void initialize() { 
		double rightSpeed = 0.8;
		double leftSpeed = -0.8;
		
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
		
		Obstacle obstacle12model = new Obstacle( "file:resources/images/obstacles/"+"racingCar2.png", 50, 1000, 540, 0);
		ObstacleView obstacle12view = new ObstacleView(background);
		obstacle12controller = new ObstacleController(obstacle12model, obstacle12view);
		obstacle12controller.updateView();
		
		Obstacle obstacle13model = new Obstacle( "file:resources/images/obstacles/"+"racingCar.png", 50, 1000, 597, 0);
		ObstacleView obstacle13view = new ObstacleView(background);
		obstacle13controller = new ObstacleController(obstacle13model, obstacle13view);
		obstacle13controller.updateView();
		
		Obstacle obstacle14model = new Obstacle( "file:resources/images/obstacles/"+"racingCar2.png", 50, 1000, 653, 0);
		ObstacleView obstacle14view = new ObstacleView(background);
		obstacle14controller = new ObstacleController(obstacle14model, obstacle14view);
		obstacle14controller.updateView();
		
		Obstacle obstacle15model = new Obstacle( "file:resources/images/obstacles/"+"racingCar2.png", 50, 1000, 432, 0);
		ObstacleView obstacle15view = new ObstacleView(background);
		obstacle15controller = new ObstacleController(obstacle15model, obstacle15view);
		obstacle15controller.updateView();
		
		Obstacle obstacle16model = new Obstacle( "file:resources/images/obstacles/"+"racingCar.png", 50, 1000, 378, 0);
		ObstacleView obstacle16view = new ObstacleView(background);
		obstacle16controller = new ObstacleController(obstacle16model, obstacle16view);
		obstacle16controller.updateView();
		
		Obstacle obstacle17model = new Obstacle( "file:resources/images/obstacles/"+"racingCar2.png", 50, 1000, 327, 0);
		ObstacleView obstacle17view = new ObstacleView(background);
		obstacle17controller = new ObstacleController(obstacle17model, obstacle17view);
		obstacle17controller.updateView();
		
		Obstacle obstacle18model = new Obstacle( "file:resources/images/obstacles/"+"racingCar.png", 50, 1000, 276, 0);
		ObstacleView obstacle18view = new ObstacleView(background);
		obstacle18controller = new ObstacleController(obstacle18model, obstacle18view);
		obstacle18controller.updateView();
		
		Obstacle obstacle19model = new Obstacle( "file:resources/images/obstacles/"+"racingCar2.png", 50, 1000, 222, 0);
		ObstacleView obstacle19view = new ObstacleView(background);
		obstacle19controller = new ObstacleController(obstacle19model, obstacle19view);
		obstacle19controller.updateView();
		
		Obstacle obstacle20model = new Obstacle( "file:resources/images/obstacles/"+"racingCar.png", 50, 1000, 164, 0);
		ObstacleView obstacle20view = new ObstacleView(background);
		obstacle20controller = new ObstacleController(obstacle20model, obstacle20view);
		obstacle20controller.updateView();
		
	}
	
	public void normal_settings() {
		double rightSpeed = 1.6;
		double leftSpeed = -1.6;
		
		obstacle1controller.setObstacleSpeed(rightSpeed);
		obstacle2controller.setObstacleSpeed(rightSpeed);
		obstacle3controller.setObstacleSpeed(rightSpeed);
		obstacle4controller.setObstacleSpeed(leftSpeed);
		obstacle5controller.setObstacleSpeed(leftSpeed);
		obstacle6controller.setObstacleSpeed(leftSpeed);
		obstacle7controller.setObstacleSpeed(leftSpeed);
		obstacle8controller.setObstacleSpeed(rightSpeed);
		obstacle9controller.setObstacleSpeed(rightSpeed);
		obstacle11controller.setObstacleSpeed(rightSpeed);
		obstacle10controller.setObstacleSpeed(-7);
		
	}
	
	public void hard_settings() {
		double rightSpeed = 3.0;
		double leftSpeed = -3.0;
		obstacle1controller.setObstacleSpeed(rightSpeed);
		obstacle2controller.setObstacleSpeed(rightSpeed);
		obstacle3controller.setObstacleSpeed(rightSpeed);
		obstacle4controller.setObstacleSpeed(leftSpeed);
		obstacle5controller.setObstacleSpeed(leftSpeed);
		obstacle6controller.setObstacleSpeed(leftSpeed);
		obstacle7controller.setObstacleSpeed(leftSpeed);
		obstacle8controller.setObstacleSpeed(rightSpeed);
		obstacle9controller.setObstacleSpeed(rightSpeed);
		obstacle11controller.setObstacleSpeed(rightSpeed);
		obstacle10controller.setObstacleSpeed(-11);
	
	}
	
	public void extra_settings() {
		obstacle1controller.setObstacleXpos(1000);
		obstacle1controller.setObstacleSpeed(0);
		obstacle2controller.setObstacleXpos(1000);
		obstacle2controller.setObstacleSpeed(0);
		obstacle3controller.setObstacleXpos(1000);
		obstacle3controller.setObstacleSpeed(0);
		obstacle4controller.setObstacleXpos(1000);
		obstacle4controller.setObstacleSpeed(0);
		obstacle5controller.setObstacleXpos(1000);
		obstacle5controller.setObstacleSpeed(0);
		obstacle6controller.setObstacleXpos(1000);
		obstacle6controller.setObstacleSpeed(0);
		obstacle7controller.setObstacleXpos(1000);
		obstacle7controller.setObstacleSpeed(0);
		obstacle8controller.setObstacleXpos(1000);
		obstacle8controller.setObstacleSpeed(0);
		obstacle9controller.setObstacleXpos(1000);
		obstacle9controller.setObstacleSpeed(0);
		obstacle11controller.setObstacleSpeed(0);
		obstacle11controller.setObstacleXpos(1000);
		
		obstacle10controller.setObstacleSpeed(-7);	
		obstacle12controller.setObstacleSpeed(10);	
		obstacle13controller.setObstacleSpeed(-6);	
		obstacle14controller.setObstacleSpeed(9);
		obstacle15controller.setObstacleSpeed(7);
		obstacle16controller.setObstacleSpeed(-10);
		obstacle17controller.setObstacleSpeed(6);
		obstacle18controller.setObstacleSpeed(-8);
		obstacle19controller.setObstacleSpeed(7);
		obstacle20controller.setObstacleSpeed(-9);
	}
}
