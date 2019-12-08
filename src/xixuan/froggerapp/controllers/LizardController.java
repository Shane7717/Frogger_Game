package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.Lizard;
import xixuan.froggerapp.views.LizardView;

public class LizardController {

	private Lizard model;
	private LizardView view;
	
	public LizardController(Lizard model, LizardView view) {
		this.model = model;
		this.view = view;
	}
	
	//Set the speed of the lizard
	public void setLizardSpeed(double speed) {
		model.setSpeed(speed);
	}
	
	//Set the size of the lizard
	public void setLizardSize(int size) {
		model.setSize(size);
	}
	
	//Set the x position of the lizard
	public void setLizardXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	//Set the y position of the lizard
	public void setLizardYpos(int ypos) {
		model.setYpos(ypos);
	}

	//Display thie lizard in the game
	public void updateView() {
		view.viewLizard(model);
	}
	
	//Remove this lizard in the game
	public void removeView() {
		view.removeLizard(model);
	}
}
