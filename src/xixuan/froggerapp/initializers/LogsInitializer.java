package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.LogController;
import xixuan.froggerapp.models.Log;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.LogView;

public class LogsInitializer implements Initializable {
	private MyStage background;
	
	public LogsInitializer(MyStage background) {
		this.background = background;
	}

	public void initialize() { 
		Log log1model = new Log("file:resources/images/logs/"+"log3.png", 152, 0, 175, 0.75); 
		LogView log1view = new LogView(background);
		LogController log1controller = new LogController(log1model, log1view);
		log1controller.updateView();
		
		Log log2model = new Log("file:resources/images/logs/"+"log3.png", 152, 220, 175, 0.75); 
		LogView log2view = new LogView(background);
		LogController log2controller = new LogController(log2model, log2view);
		log2controller.updateView();
		
		Log log3model = new Log("file:resources/images/logs/"+"log3.png", 152, 440, 175, 0.75); 
		LogView log3view = new LogView(background);
		LogController log3controller = new LogController(log3model, log3view);
		log3controller.updateView();
		
		Log log4model = new Log("file:resources/images/logs/"+"logs.png", 310, 0, 280, -2); 
		LogView log4view = new LogView(background);
		LogController log4controller = new LogController(log4model, log4view);
		log4controller.updateView();
		
		Log log5model = new Log("file:resources/images/logs/"+"logs.png", 310, 400, 280, -2); 
		LogView log5view = new LogView(background);
		LogController log5controller = new LogController(log5model, log5view);
		log5controller.updateView();
		
		Log log6model = new Log("file:resources/images/logs/"+"log3.png", 152, 50, 329, 0.75); 
		LogView log6view = new LogView(background);
		LogController log6controller = new LogController(log6model, log6view);
		log6controller.updateView();
				
		Log log7model = new Log("file:resources/images/logs/"+"log3.png", 152, 270, 329, 0.75); 
		LogView log7view = new LogView(background);
		LogController log7controller = new LogController(log7model, log7view);
		log7controller.updateView();
		
		Log log8model = new Log("file:resources/images/logs/"+"log3.png", 152, 490, 329, 0.75); 
		LogView log8view = new LogView(background);
		LogController log8controller = new LogController(log8model, log8view);
		log8controller.updateView();
	}
}
