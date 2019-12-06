package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.Crocodile;
import xixuan.froggerapp.views.CrocodileView;

public class CrocodileController {

	private Crocodile model;
	private CrocodileView view;
	
	public CrocodileController(Crocodile model, CrocodileView view) {
		this.model = model;
		this.view = view;
	}
	
	//Set the speed of the crocodile
	public void setCrocodileSpeed(double speed) {
		model.setSpeed(speed);
	}
	
	//Set the size of the crocodile
	public void setCrocodileSize(int size) {
		model.setSize(size);
	}
	
	//Set the x position of the crocodile
	public void setCrocodileXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	//Set the y position of the crocodile
	public void setCrocodileYpos(int ypos) {
		model.setYpos(ypos);
	}

	//Display thie crocodile in the game
	public void updateView() {
		view.viewCrocodile(model);
	}
}
