package main.java.xixuan.froggerapp.controllers;

import main.java.xixuan.froggerapp.models.Lizard;
import main.java.xixuan.froggerapp.views.LizardView;

/**
 * This class controls an object of the class Lizard.<br>
 * This controls the speed, size, x position, y position and view of a lizard.
 * @author XIXUAN WANG
 * @see main.java.xixuan.froggerapp.views.LizardView
 * @see main.java.xixuan.froggerapp.models.Lizard
 */
public class LizardController {

	private Lizard model;
	private LizardView view;
	
	public LizardController(Lizard model, LizardView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setLizardSpeed(double speed) {
		model.setSpeed(speed);
	}
	
	public void setLizardSize(int size) {
		model.setSize(size);
	}
	
	public void setLizardXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	public void setLizardYpos(int ypos) {
		model.setYpos(ypos);
	}

	/**
	 * This uses lizard's 'view' object to display the lizard in the game. 
	 */
	public void updateView() {
		view.viewLizard(model);
	}
	
	/**
	 * This uses lizard's 'view' object to remove the lizard in the game. 
	 */
	public void removeView() {
		view.removeLizard(model);
	}
}
