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
	
	public void updateView() {
		view.viewLog(model);
	}
}
