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
	
	public void setCrocodileSpeed(double speed) {
		model.setSpeed(speed);
	}
	
	public void setCrocodileSize(int size) {
		model.setSize(size);
	}
	
	public void setCrocodileXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	public void setCrocodileYpos(int ypos) {
		model.setYpos(ypos);
	}

	public void updateView() {
		view.viewCrocodile(model);
	}
}
