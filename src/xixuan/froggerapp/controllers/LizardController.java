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

	public void updateView() {
		view.viewLizard(model);
	}
}
