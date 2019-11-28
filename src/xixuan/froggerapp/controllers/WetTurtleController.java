package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.WetTurtle;
import xixuan.froggerapp.views.WetTurtleView;

public class WetTurtleController {

	private WetTurtle model;
	private WetTurtleView view;
	
	public WetTurtleController(WetTurtle model, WetTurtleView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setWetTurtleSpeed(int speed) {
		model.setSpeed(speed);
	}
	
	public double getWetTurtleSpeed() {
		return model.getSpeed();
	}
	
	public void setWetTurtleSize(int size) {
		model.setSize(size);
	}
	
	public int getWetTurtleSize() {
		return model.getSize();
	}
			
	public void setWetTurtleXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	public int getWetTurtleXpos() {
		return model.getXpos();
	}

	public void setWetTurtleYpos(int ypos) {
		model.setYpos(ypos);
	}
	
	public int getWetTurtleYpos() {
		return model.getYpos();
	}
	
	public void updateView() {
		view.viewWetTurtle(model);
	}
}
