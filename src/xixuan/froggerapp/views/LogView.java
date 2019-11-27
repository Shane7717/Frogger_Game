package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Log;
import xixuan.froggerapp.settings.MyStage;

public class LogView {
	MyStage background; 
	String path = "file:resources/images/logs/";

	public LogView(MyStage background) {
		this.background = background;
	}
	
	public void viewLogs() {
		background.add(new Log(path + "log3.png", 152, 0, 175, 0.75));
		background.add(new Log(path + "log3.png", 152, 220, 175, 0.75));
		background.add(new Log(path + "log3.png", 152, 440, 175, 0.75));
		background.add(new Log(path + "logs.png", 310, 0, 280, -2));
		background.add(new Log(path + "logs.png", 310, 400, 280, -2));	
		background.add(new Log(path + "log3.png", 152, 50, 329, 0.75));
		background.add(new Log(path + "log3.png", 152, 270, 329, 0.75));
		background.add(new Log(path + "log3.png", 152, 490, 329, 0.75));
	}
}
