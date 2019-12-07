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
	
	//If scores changed, return true
	public boolean checkChangeScore() {
		return model.changeScore();
	}
	
	//Get the player/frog's scores
	public int getPlayerPoints() {
		return model.getPoints();
	}
	
	//If the game satisfies stop conditions, return true
	public boolean checkGetStop() {
		return model.getStop();
	}
	
	//Display this frog in the game
	public void updateView() {
		view.viewFrog(model);
	}
	
	//Enable keyboard detection
	public void keyboardMonitor() {
		model.keyboardMonitor();
	}
	
	//Set the value of checking water death
	public void setSignalValue(int value) {
		model.setSignalValue(value);
	}
	
	//Disable keyboard detection
	public void setDisableKey(boolean value) {
		model.setDisableKey(value);
	}
	
	//Get the state of keyboard detection
	public boolean getDisableKey() { 
		return model.getDisableKey();
	}
	
	//Set the number of lives for the frog
	public void setLifeNum(int value) {
		model.setLiftNum(value);
	}
	
	//Get the number of lives of the frog
	public int getLifeNum() {
		return model.getLiftNum();
	}
}
