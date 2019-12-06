package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.ObstacleController;
import xixuan.froggerapp.models.Obstacle;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.ObstacleView;

public class ObstaclesInitializer implements Initializable {
	
	private MyStage background;
	private Obstacle[] obstacleModels = new Obstacle[20];
	private ObstacleController[] obstacleControllers = new ObstacleController[20];
	private ObstacleView[] obstacleViews = new ObstacleView[20];
	
	public ObstaclesInitializer(MyStage background) {
		this.background = background;
	}

	public void initialize() { 
		double rightSpeed = 0.8;
		double leftSpeed = -0.8;
		
		obstacleModels[0] = new Obstacle( "file:resources/images/obstacles/"+"car1"+"Right.png", 50, 0, 653, rightSpeed); 
		obstacleViews[0] = new ObstacleView(background);
		obstacleControllers[0] = new ObstacleController(obstacleModels[0], obstacleViews[0]);
		obstacleControllers[0].updateView();
		
		obstacleModels[1] = new Obstacle( "file:resources/images/obstacles/"+"truck1"+"Right.png", 120, 300, 653, rightSpeed); 
		obstacleViews[1] = new ObstacleView(background);
		obstacleControllers[1] = new ObstacleController(obstacleModels[1], obstacleViews[1]);
		obstacleControllers[1].updateView();
		
		obstacleModels[2] = new Obstacle( "file:resources/images/obstacles/"+"car2"+"Right.png", 50, 600, 653, rightSpeed); 
		obstacleViews[2] = new ObstacleView(background);
		obstacleControllers[2] = new ObstacleController(obstacleModels[2], obstacleViews[2]);
		obstacleControllers[2].updateView();
		
		obstacleModels[3] = new Obstacle( "file:resources/images/obstacles/"+"car1Left.png", 50, 100, 593, leftSpeed); 
		obstacleViews[3] = new ObstacleView(background);
		obstacleControllers[3] = new ObstacleController(obstacleModels[3], obstacleViews[3]);
		obstacleControllers[3].updateView();
		
		obstacleModels[4] = new Obstacle( "file:resources/images/obstacles/"+"car2Left.png", 50, 250, 597, leftSpeed); 
		obstacleViews[4] = new ObstacleView(background);
		obstacleControllers[4] = new ObstacleController(obstacleModels[4], obstacleViews[4]);
		obstacleControllers[4].updateView();
	
		obstacleModels[5] = new Obstacle( "file:resources/images/obstacles/"+"car1Left.png", 50, 400, 593, leftSpeed); 
		obstacleViews[5] = new ObstacleView(background);
		obstacleControllers[5] = new ObstacleController(obstacleModels[5], obstacleViews[5]);
		obstacleControllers[5].updateView();
		
		obstacleModels[6] = new Obstacle( "file:resources/images/obstacles/"+"car2Left.png", 50, 550, 597, leftSpeed); 
		obstacleViews[6] = new ObstacleView(background);
		obstacleControllers[6] = new ObstacleController(obstacleModels[6], obstacleViews[6]);
		obstacleControllers[6].updateView();
		
		obstacleModels[7] = new Obstacle( "file:resources/images/obstacles/"+"truck2"+"Right.png", 200, 0, 540, rightSpeed); 
		obstacleViews[7] = new ObstacleView(background);
		obstacleControllers[7] = new ObstacleController(obstacleModels[7], obstacleViews[7]);
		obstacleControllers[7].updateView();
		
		obstacleModels[8] = new Obstacle( "file:resources/images/obstacles/"+"truck2"+"Right.png", 200, 500, 540, rightSpeed); 
		obstacleViews[8] = new ObstacleView(background);
		obstacleControllers[8] = new ObstacleController(obstacleModels[8], obstacleViews[8]);
		obstacleControllers[8].updateView();
		
		obstacleModels[9] = new Obstacle( "file:resources/images/obstacles/"+"racingCar.png", 50, 500, 486, -2.5); 
		obstacleViews[9] = new ObstacleView(background);
		obstacleControllers[9] = new ObstacleController(obstacleModels[9], obstacleViews[9]);
		obstacleControllers[9].updateView();
		
		obstacleModels[10] = new Obstacle( "file:resources/images/obstacles/"+"car2Right.png", 50, 330, 540, rightSpeed); 
		obstacleViews[10] = new ObstacleView(background);
		obstacleControllers[10] = new ObstacleController(obstacleModels[10], obstacleViews[10]);
		obstacleControllers[10].updateView();
		
		obstacleModels[11] = new Obstacle( "file:resources/images/obstacles/"+"racingCar2.png", 50, 1000, 540, 0); 
		obstacleViews[11] = new ObstacleView(background);
		obstacleControllers[11] = new ObstacleController(obstacleModels[11], obstacleViews[11]);
		obstacleControllers[11].updateView();
		
		obstacleModels[12] = new Obstacle( "file:resources/images/obstacles/"+"racingCar.png", 50, 1000, 597, 0); 
		obstacleViews[12] = new ObstacleView(background);
		obstacleControllers[12] = new ObstacleController(obstacleModels[12], obstacleViews[12]);
		obstacleControllers[12].updateView();
		
		obstacleModels[13] = new Obstacle( "file:resources/images/obstacles/"+"racingCar2.png", 50, 1000, 653, 0); 
		obstacleViews[13] = new ObstacleView(background);
		obstacleControllers[13] = new ObstacleController(obstacleModels[13], obstacleViews[13]);
		obstacleControllers[13].updateView();
		
		obstacleModels[14] = new Obstacle( "file:resources/images/obstacles/"+"racingCar2.png", 50, 1000, 432, 0); 
		obstacleViews[14] = new ObstacleView(background);
		obstacleControllers[14] = new ObstacleController(obstacleModels[14], obstacleViews[14]);
		obstacleControllers[14].updateView();
		
		obstacleModels[15] = new Obstacle( "file:resources/images/obstacles/"+"racingCar.png", 50, 1000, 378, 0); 
		obstacleViews[15] = new ObstacleView(background);
		obstacleControllers[15] = new ObstacleController(obstacleModels[15], obstacleViews[15]);
		obstacleControllers[15].updateView();
		
		obstacleModels[16] = new Obstacle( "file:resources/images/obstacles/"+"racingCar2.png", 50, 1000, 327, 0); 
		obstacleViews[16] = new ObstacleView(background);
		obstacleControllers[16] = new ObstacleController(obstacleModels[16], obstacleViews[16]);
		obstacleControllers[16].updateView();
		
		obstacleModels[17] = new Obstacle( "file:resources/images/obstacles/"+"racingCar.png", 50, 1000, 276, 0); 
		obstacleViews[17] = new ObstacleView(background);
		obstacleControllers[17] = new ObstacleController(obstacleModels[17], obstacleViews[17]);
		obstacleControllers[17].updateView();
		
		obstacleModels[18] = new Obstacle( "file:resources/images/obstacles/"+"racingCar2.png", 50, 1000, 222, 0); 
		obstacleViews[18] = new ObstacleView(background);
		obstacleControllers[18] = new ObstacleController(obstacleModels[18], obstacleViews[18]);
		obstacleControllers[18].updateView();
		
		obstacleModels[19] = new Obstacle( "file:resources/images/obstacles/"+"racingCar.png", 50, 1000, 164, 0); 
		obstacleViews[19] = new ObstacleView(background);
		obstacleControllers[19] = new ObstacleController(obstacleModels[19], obstacleViews[19]);
		obstacleControllers[19].updateView();		
	}
	
	public void normal_settings() {
		double rightSpeed = 1.6;
		double leftSpeed = -1.6;
		
		obstacleControllers[0].setObstacleSpeed(rightSpeed);
		obstacleControllers[1].setObstacleSpeed(rightSpeed);
		obstacleControllers[2].setObstacleSpeed(rightSpeed);
		obstacleControllers[3].setObstacleSpeed(leftSpeed);
		obstacleControllers[4].setObstacleSpeed(leftSpeed);
		obstacleControllers[5].setObstacleSpeed(leftSpeed);
		obstacleControllers[6].setObstacleSpeed(leftSpeed);
		obstacleControllers[7].setObstacleSpeed(rightSpeed);
		obstacleControllers[8].setObstacleSpeed(rightSpeed);
		obstacleControllers[10].setObstacleSpeed(rightSpeed);
		obstacleControllers[9].setObstacleSpeed(-7);
		
	}
	
	public void hard_settings() {
		double rightSpeed = 3.0;
		double leftSpeed = -3.0;
		obstacleControllers[0].setObstacleSpeed(rightSpeed);
		obstacleControllers[1].setObstacleSpeed(rightSpeed);
		obstacleControllers[2].setObstacleSpeed(rightSpeed);
		obstacleControllers[3].setObstacleSpeed(leftSpeed);
		obstacleControllers[4].setObstacleSpeed(leftSpeed);
		obstacleControllers[5].setObstacleSpeed(leftSpeed);
		obstacleControllers[6].setObstacleSpeed(leftSpeed);
		obstacleControllers[7].setObstacleSpeed(rightSpeed);
		obstacleControllers[8].setObstacleSpeed(rightSpeed);
		obstacleControllers[10].setObstacleSpeed(rightSpeed);
		obstacleControllers[9].setObstacleSpeed(-11);
	
	}
	
	public void extra_settings() {
		for (int i = 0; i <= 8; ++i) {
			obstacleControllers[i].removeView();
		}							
		obstacleControllers[10].removeView();		
		obstacleControllers[9].setObstacleSpeed(-7);	
		obstacleControllers[11].setObstacleSpeed(10);	
		obstacleControllers[12].setObstacleSpeed(-6);	
		obstacleControllers[13].setObstacleSpeed(9);
		obstacleControllers[14].setObstacleSpeed(7);
		obstacleControllers[15].setObstacleSpeed(-10);
		obstacleControllers[16].setObstacleSpeed(6);
		obstacleControllers[17].setObstacleSpeed(-8);
		obstacleControllers[18].setObstacleSpeed(7);
		obstacleControllers[19].setObstacleSpeed(-9);
	}
}
