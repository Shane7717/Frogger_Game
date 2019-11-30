package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.LogController;
import xixuan.froggerapp.models.Frog;
import xixuan.froggerapp.models.Log;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.LogView;

public class LogsInitializer implements Initializable {
	private MyStage background;
	private LogController log1controller;
	private LogController log2controller;
	private LogController log3controller;
	private LogController log4controller;
	private LogController log5controller;
	private LogController log6controller;
	private LogController log7controller;
	private LogController log8controller;
	
	public LogsInitializer(MyStage background) {
		this.background = background;
	}

	public void initialize() { 
		Log log1model = new Log("file:resources/images/logs/"+"log3.png", 152, 0, 175, 0.75); 
		LogView log1view = new LogView(background);
		log1controller = new LogController(log1model, log1view);
		log1controller.updateView();
		
		Log log2model = new Log("file:resources/images/logs/"+"log3.png", 152, 220, 175, 0.75); 
		LogView log2view = new LogView(background);
		log2controller = new LogController(log2model, log2view);
		log2controller.updateView();
		
		Log log3model = new Log("file:resources/images/logs/"+"log3.png", 152, 440, 175, 0.75); 
		LogView log3view = new LogView(background);
		log3controller = new LogController(log3model, log3view);
		log3controller.updateView();
		
		Log log4model = new Log("file:resources/images/logs/"+"logs.png", 310, 0, 280, -2.0); 
		LogView log4view = new LogView(background);
		log4controller = new LogController(log4model, log4view);
		log4controller.updateView();
		
		Log log5model = new Log("file:resources/images/logs/"+"logs.png", 310, 400, 280, -2.0); 
		LogView log5view = new LogView(background);
		log5controller = new LogController(log5model, log5view);
		log5controller.updateView();
		
		Log log6model = new Log("file:resources/images/logs/"+"log3.png", 152, 50, 329, 0.75); 
		LogView log6view = new LogView(background);
		log6controller = new LogController(log6model, log6view);
		log6controller.updateView();
				
		Log log7model = new Log("file:resources/images/logs/"+"log3.png", 152, 270, 329, 0.75); 
		LogView log7view = new LogView(background);
		log7controller = new LogController(log7model, log7view);
		log7controller.updateView();
		
		Log log8model = new Log("file:resources/images/logs/"+"log3.png", 152, 490, 329, 0.75); 
		LogView log8view = new LogView(background);
		log8controller = new LogController(log8model, log8view);
		log8controller.updateView();
	}
	
	public void normal_settings() {
		Frog.logRightIntersectSpeed = 1.2;
		log1controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log2controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log3controller.setLogSpeed(Frog.logRightIntersectSpeed);
		Frog.logLeftIntersectSpeed = -2.4;
		log4controller.setLogSpeed(Frog.logLeftIntersectSpeed);
		log5controller.setLogSpeed(Frog.logLeftIntersectSpeed);
		log6controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log7controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log8controller.setLogSpeed(Frog.logRightIntersectSpeed);
	}
	
	
}
