package main.java.xixuan.froggerapp.controllers;

import main.java.xixuan.froggerapp.models.Log;
import main.java.xixuan.froggerapp.views.LogView;

/**
 * This class controls an object of the class Log.<br>
 * This controls the speed, size, image, x position, y position and view of a lizard.
 * @author XIXUAN WANG
 * @see main.java.xixuan.froggerapp.views.LogView
 * @see main.java.xixuan.froggerapp.models.Log
 */
public class LogController {

	private Log model;
	private LogView view;
	
	public LogController(Log model, LogView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setLogSpeed(double speed) {
		model.setSpeed(speed);
	}
	
	public void setLogSize(int size) {
		model.setSize(size);
	}
	
	public void setImageLink(String imageLink) {
		model.setImageLink(imageLink);
	}
	
	public void setLogXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	public void setLogYpos(int ypos) {
		model.setYpos(ypos);
	}
	
	/**
	 * This uses log's 'view' object to display the log in the game. 
	 */
	public void updateView() {
		view.viewLog(model);
	}
	
	/**
	 * This uses log's 'view' object to remove the log in the game. 
	 */
	public void removeView() {
		view.removeLog(model);
	}
}
