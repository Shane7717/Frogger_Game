package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.Frog;
import xixuan.froggerapp.views.FrogView;

/**
 * This class controls an object of the class Frog.<br>
 * This controls the score changing state, game stop condition, keyboard monitoring, <br>
 * the number of lives, and view of the frog in the game.
 * @author XIXUAN WANG
 * @see xixuan.froggerapp.views.FrogView
 * @see xixuan.froggerapp.models.Frog
 */
public class FrogController {
	private Frog model;
	private FrogView view;
	
	public FrogController(Frog model, FrogView view) {
		this.model = model;
		this.view = view;
	}
	
	/**
	 * This checks whether or not the scores of a player has changed.
	 * @return if the scores change, return true.
	 */
	public boolean checkChangeScore() {
		return model.changeScore();
	}
	
	public int getPlayerPoints() {
		return model.getPoints();
	}
	
	/**
	 * This checks whether or not the game needs to be stopped. 
	 * @return if the game satisfies the stop conditions, return true
	 */
	public boolean checkGetStop() {
		return model.getStop();
	}
	
	/**
	 *  Display the frog in the game
	 */
	public void updateView() {
		view.viewFrog(model);
	}
	
	/**
	 * Enables the game to use keyboard monitoring.<br>
	 * The frog can move up, down, left or right if the player presses keys "W", "S", "A", or "D".
	 */
	public void keyboardMonitor() {
		model.keyboardMonitor();
	}
	
	/**
	 * This sets the signal value of whether or not checking the water death of the frog.
	 * @param value equals 1 if the game checks the water death of the frog, otherwise it is 0.
	 */
	public void setSignalValue(int value) {
		model.setSignalValue(value);
	}
	
	/**
	 * This sets the signal of whether or not disabling the keyboard monitoring. <br>
	 * The game disables keyboard monitoring if and only if the player pauses the game.
	 * @param value equals true if we disable keyboard monitoring
	 */
	public void setDisableKey(boolean value) {
		model.setDisableKey(value);
	}
	
	/**
 	* This get the state of keyboard monitoring.
 	* @return a boolean value of <strong>true</strong> if keyboard monitoring is disabled
 	*/
	public boolean getDisableKey() { 
		return model.getDisableKey();
	}
	
	/**
	 * This sets the number of lives for the frog.
	 * @param value number of lives 
	 */
	public void setLifeNum(int value) {
		model.setLiftNum(value);
	}
	
	/**
	 * This gets the number of lives left when the game is finished.
	 * @return the number of lives of the frog
	 */
	public int getLifeNum() {
		return model.getLiftNum();
	}
}
