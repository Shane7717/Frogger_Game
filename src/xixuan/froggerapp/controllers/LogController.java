package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.Log;
import xixuan.froggerapp.views.LogView;

public class LogController {

	private Log model;
	private LogView view;
	
	public LogController(Log model, LogView view) {
		this.model = model;
		this.view = view;
	}
	
	//Set the speed of the log
	public void setLogSpeed(double speed) {
		model.setSpeed(speed);
	}
	
	//Set the size of the log
	public void setLogSize(int size) {
		model.setSize(size);
	}
	
	//Set the image of the log
	public void setImageLink(String imageLink) {
		model.setImageLink(imageLink);
	}
	
	//Set the x position of the log
	public void setLogXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	//Set the y position of the log
	public void setLogYpos(int ypos) {
		model.setYpos(ypos);
	}
	
	//Display this log in the game
	public void updateView() {
		view.viewLog(model);
	}
	
	//Remove this log in the game
	public void removeView() {
		view.removeLog(model);
	}
}
