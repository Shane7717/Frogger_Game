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
		Frog.logRightIntersectSpeed = 0.9;
		Frog.logLeftIntersectSpeed = -1.3;
		Log log1model = new Log("file:resources/images/logs/"+"logRight.png", 130, 0, 180, Frog.logRightIntersectSpeed); 
		LogView log1view = new LogView(background);
		log1controller = new LogController(log1model, log1view);
		log1controller.updateView();
		
		Log log2model = new Log("file:resources/images/logs/"+"logRight.png", 130, 220, 180, Frog.logRightIntersectSpeed); 
		LogView log2view = new LogView(background);
		log2controller = new LogController(log2model, log2view);
		log2controller.updateView();
		
		Log log3model = new Log("file:resources/images/logs/"+"logRight.png", 130, 440, 180, Frog.logRightIntersectSpeed); 
		LogView log3view = new LogView(background);
		log3controller = new LogController(log3model, log3view);
		log3controller.updateView();
		
		Log log4model = new Log("file:resources/images/logs/"+"logLongLeft.png", 200, 0, 285, Frog.logLeftIntersectSpeed); 
		LogView log4view = new LogView(background);
		log4controller = new LogController(log4model, log4view);
		log4controller.updateView();
		
		Log log5model = new Log("file:resources/images/logs/"+"logLeft.png", 130, 600, 285, Frog.logLeftIntersectSpeed); 
		LogView log5view = new LogView(background);
		log5controller = new LogController(log5model, log5view);
		log5controller.updateView();
		
		Log log6model = new Log("file:resources/images/logs/"+"logRight.png", 130, 120, 335, Frog.logRightIntersectSpeed ); 
		LogView log6view = new LogView(background);
		log6controller = new LogController(log6model, log6view);
		log6controller.updateView();
				
		Log log7model = new Log("file:resources/images/logs/"+"logRight.png", 130, 340, 335, Frog.logRightIntersectSpeed ); 
		LogView log7view = new LogView(background);
		log7controller = new LogController(log7model, log7view);
		log7controller.updateView();
		
		Log log8model = new Log("file:resources/images/logs/"+"logLongRight.png", 200, 580, 335, Frog.logRightIntersectSpeed ); 
		LogView log8view = new LogView(background);
		log8controller = new LogController(log8model, log8view);
		log8controller.updateView();
	}
				
	public void normal_settings() {
		Frog.logRightIntersectSpeed = 1.4;
		log1controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log2controller.setLogSpeed(0);
		log2controller.setLogXpos(1000);
		log3controller.setLogSpeed(Frog.logRightIntersectSpeed);
		Frog.logLeftIntersectSpeed = -2.8;
		log4controller.setLogSpeed(Frog.logLeftIntersectSpeed);
		log5controller.setLogSpeed(Frog.logLeftIntersectSpeed);
		log6controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log7controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log8controller.setLogSpeed(Frog.logRightIntersectSpeed);
	}
	
	public void hard_settings() {
		Frog.logRightIntersectSpeed = 6.0;
		log1controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log2controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log2controller.setLogXpos(420);
		log3controller.setLogSpeed(0);
		log3controller.setLogXpos(1000);
		Frog.logLeftIntersectSpeed = -4.8;
		log4controller.setLogSpeed(Frog.logLeftIntersectSpeed);
		log5controller.setLogSpeed(Frog.logLeftIntersectSpeed);
		log6controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log7controller.setLogSpeed(0);
		log7controller.setLogXpos(1000);
		log8controller.setLogSpeed(Frog.logRightIntersectSpeed);
	}
	
	public void nightmare_settings() {
		int size = 60;
		Frog.logRightIntersectSpeed = 9.0;
		Frog.logLeftIntersectSpeed = -11.0;
		log1controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log1controller.setImageLink("file:resources/images/logs/"+"shortlogRight.png");
		log1controller.setLogSize(size);
		log2controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log2controller.setImageLink("file:resources/images/logs/"+"shortlogRight.png");
		log2controller.setLogSize(size);
		log3controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log3controller.setImageLink("file:resources/images/logs/"+"shortlogRight.png");
		log3controller.setLogSize(size);		
		log4controller.setLogSpeed(Frog.logLeftIntersectSpeed);
		log4controller.setImageLink("file:resources/images/logs/"+"shortlogLeft.png");
		log4controller.setLogSize(size);	
		log5controller.setLogSpeed(Frog.logLeftIntersectSpeed);
		log5controller.setImageLink("file:resources/images/logs/"+"shortlogLeft.png");
		log5controller.setLogSize(size);	
		log6controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log6controller.setImageLink("file:resources/images/logs/"+"shortlogRight.png");
		log6controller.setLogSize(size);	
		log7controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log7controller.setImageLink("file:resources/images/logs/"+"shortlogRight.png");
		log7controller.setLogSize(size);	
		log8controller.setLogSpeed(Frog.logRightIntersectSpeed);
		log8controller.setImageLink("file:resources/images/logs/"+"shortlogRight.png");
		log8controller.setLogSize(size);
	
	}
	
	
}
