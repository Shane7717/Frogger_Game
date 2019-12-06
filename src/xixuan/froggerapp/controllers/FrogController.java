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
	
	public void setSignalValue(int value) {
		model.setSignalValue(value);
	}
	
	public void setDisableKey(boolean value) {
		model.setDisableKey(value);
	}
	
	public boolean getDisableKey() { 
		return model.getDisableKey();
	}
	
	public void setLifeNum(int value) {
		model.setLiftNum(value);
	}
	
	public int getLifeNum() {
		return model.getLiftNum();
	}
}