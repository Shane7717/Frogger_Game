package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.WetTurtle;
import xixuan.froggerapp.views.WetTurtleView;

/**
 * This class controls an object of the class WetTurtle.<br>
 * This controls the speed, size, x position, y position and view of a wet turtle.
 * @author XIXUAN WANG
 * @see xixuan.froggerapp.views.WetTurtleView
 * @see xixuan.froggerapp.models.WetTurtle
 */
public class WetTurtleController {

	private WetTurtle model;
	private WetTurtleView view;
	
	public WetTurtleController(WetTurtle model, WetTurtleView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setWetTurtleSpeed(double speed) {
		model.setSpeed(speed);
	}
		
	public void setWetTurtleSize(int size) {
		model.setSize(size);
	}
	
	public void setWetTurtleXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	public void setWetTurtleYpos(int ypos) {
		model.setYpos(ypos);
	}
		
	/**
	 * This uses wet turtle's 'view' object to display the wet turtle in the game. 
	 */
	public void updateView() {
		view.viewWetTurtle(model);
	}
	
	/**
	 * This uses wet turtle's 'view' object to remove the wet turtle in the game. 
	 */
	public void removeView() {
		view.removeWetTurtle(model);
	}
}
