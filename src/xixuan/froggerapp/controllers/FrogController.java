package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.Frog;
import xixuan.froggerapp.views.FrogView;

public class FrogController {
	private Frog model;
	private FrogView view;
	
	public FrogController(Frog model, FrogView view) {
		this.model = model;
		this.view = view;
	}
	
	public boolean checkChangeScore() {
		return model.changeScore();
	}
	
	public int getPlayerPoints() {
		return model.getPoints();
	}
	
	public boolean checkGetStop() {
		return model.getStop();
	}

	public void updateView() {
		view.viewFrog(model);
	}
	
	public void keyboardMonitor() {
		model.keyboardMonitor();
	}
}
