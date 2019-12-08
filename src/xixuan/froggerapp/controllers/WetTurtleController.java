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
	
	//Set the speed of the wet turtle
	public void setWetTurtleSpeed(double speed) {
		model.setSpeed(speed);
	}
		
	//Set the size of the wet turtle
	public void setWetTurtleSize(int size) {
		model.setSize(size);
	}
	
	//Set the x position of the wet turtle
	public void setWetTurtleXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	//Set the y position of the wet turtle
	public void setWetTurtleYpos(int ypos) {
		model.setYpos(ypos);
	}
		
	//Display this wet turtle in the game
	public void updateView() {
		view.viewWetTurtle(model);
	}
	
	//Remove this wet turtle in the game
	public void removeView() {
		view.removeWetTurtle(model);
	}
}
