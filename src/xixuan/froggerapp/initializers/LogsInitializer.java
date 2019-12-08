package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.LogController;
import xixuan.froggerapp.models.Frog;
import xixuan.froggerapp.models.Log;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.LogView;

/**
 * This class initializes all the relevant instances of Log.
 * @author XIXUAN WANG
 */
public class LogsInitializer implements Initializable {
	private MyStage background;
	private Log[] logModels = new Log[8];
	private LogController[] logControllers = new LogController[8];
	private LogView[] logViews = new LogView[8];
		
	public LogsInitializer(MyStage background) {
		this.background = background;
	}

	/**
	 * This initializes eight logs in the game.
	 */
	public void initialize() { 
		Frog.logRightIntersectSpeed = 0.9;
		Frog.logLeftIntersectSpeed = -1.3;
		
		logModels[0] = new Log("file:resources/images/logs/"+"logRight.png", 130, 0, 180, Frog.logRightIntersectSpeed); 
		logViews[0] = new LogView(background);
		logControllers[0] = new LogController(logModels[0], logViews[0]);
		logControllers[0].updateView();
		
		logModels[1] = new Log("file:resources/images/logs/"+"logRight.png", 130, 220, 180, Frog.logRightIntersectSpeed); 
		logViews[1] = new LogView(background);
		logControllers[1] = new LogController(logModels[1], logViews[1]);
		logControllers[1].updateView();
		
		logModels[2] = new Log("file:resources/images/logs/"+"logRight.png", 130, 440, 180, Frog.logRightIntersectSpeed); 
		logViews[2] = new LogView(background);
		logControllers[2] = new LogController(logModels[2], logViews[2]);
		logControllers[2].updateView();
		
		logModels[3] = new Log("file:resources/images/logs/"+"logLongLeft.png", 200, 0, 285, Frog.logLeftIntersectSpeed); 
		logViews[3] = new LogView(background);
		logControllers[3] = new LogController(logModels[3], logViews[3]);
		logControllers[3].updateView();
		
		logModels[4] = new Log("file:resources/images/logs/"+"logLeft.png", 130, 600, 285, Frog.logLeftIntersectSpeed); 
		logViews[4] = new LogView(background);
		logControllers[4] = new LogController(logModels[4], logViews[4]);
		logControllers[4].updateView();
	
		logModels[5] = new Log("file:resources/images/logs/"+"logRight.png", 130, 120, 335, Frog.logRightIntersectSpeed); 
		logViews[5] = new LogView(background);
		logControllers[5] = new LogController(logModels[5], logViews[5]);
		logControllers[5].updateView();
		
		logModels[6] = new Log("file:resources/images/logs/"+"logRight.png", 130, 340, 335, Frog.logRightIntersectSpeed); 
		logViews[6] = new LogView(background);
		logControllers[6] = new LogController(logModels[6], logViews[6]);
		logControllers[6].updateView();
		
		logModels[7] = new Log("file:resources/images/logs/"+"logLongRight.png", 200, 580, 335, Frog.logRightIntersectSpeed); 
		logViews[7] = new LogView(background);
		logControllers[7] = new LogController(logModels[7], logViews[7]);
		logControllers[7].updateView();
	}
			
	/**
	 * This sets relevant parameters for the normal game level.<br> 
	 * Specifically, this adjusts the speed of the logs and removes one in the game.
	 */	
	public void normal_settings() {
		Frog.logRightIntersectSpeed = 1.4;
		logControllers[0].setLogSpeed(Frog.logRightIntersectSpeed);
		logControllers[1].removeView();
		logControllers[2].setLogSpeed(Frog.logRightIntersectSpeed);
		Frog.logLeftIntersectSpeed = -2.8;
		logControllers[3].setLogSpeed(Frog.logLeftIntersectSpeed);
		logControllers[4].setLogSpeed(Frog.logLeftIntersectSpeed);
		logControllers[5].setLogSpeed(Frog.logRightIntersectSpeed);
		logControllers[6].setLogSpeed(Frog.logRightIntersectSpeed);
		logControllers[7].setLogSpeed(Frog.logRightIntersectSpeed);
	}
	
	/**
	 * This sets relevant parameters for the hard game level.<br> 
	 * Specifically, this adjusts the speed and x position of the logs and removes two.
	 */
	public void hard_settings() {
		Frog.logRightIntersectSpeed = 6.0;
		logControllers[0].setLogSpeed(Frog.logRightIntersectSpeed);
		logControllers[1].setLogSpeed(Frog.logRightIntersectSpeed);
		logControllers[1].setLogXpos(420);
		logControllers[2].removeView();
		Frog.logLeftIntersectSpeed = -4.8;
		logControllers[3].setLogSpeed(Frog.logLeftIntersectSpeed);
		logControllers[4].setLogSpeed(Frog.logLeftIntersectSpeed);
		logControllers[5].setLogSpeed(Frog.logRightIntersectSpeed);
		logControllers[6].removeView();
		logControllers[7].setLogSpeed(Frog.logRightIntersectSpeed);
	}
	
	/**
	 * This sets relevant parameters for the extra game level.<br> 
	 * Specifically, this removes all the logs in the game.
	 */
	public void extra_settings() {
		Frog.logRightIntersectSpeed = 0;
		Frog.logLeftIntersectSpeed = 0;	
		for (int i = 0; i <= 7; ++i) {
			logControllers[i].removeView();
		}
	}
}
