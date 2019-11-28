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
	
	public double getLogSpeed() {
		return model.getSpeed();
	}
	
	public void setLogSize(int size) {
		model.setSize(size);
	}
	
	public int getLogSize() {
		return model.getSize();
	}
	
	public void setImageLink(String imageLink) {
		model.setImageLink(imageLink);
	}
	
	public String getImageLink() {
		return model.getImageLink();
	}
	
	public void setLogXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	public int getLogXpos() {
		return model.getXpos();
	}

	public void setLogYpos(int ypos) {
		model.setYpos(ypos);
	}
	
	public int getLogYpos() {
		return model.getYpos();
	}
	
	public void updateView() {
		view.viewLog(model);
	}
}
