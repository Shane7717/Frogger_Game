package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Log;
import xixuan.froggerapp.settings.MyStage;

public class LogView {
	MyStage background; 
	
	public LogView(MyStage background) {
		this.background = background;
	}
	
	//Display the log on the screen
	public void viewLog(Log model) {
		background.add(model);
	}
}