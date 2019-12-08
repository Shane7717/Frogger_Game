package xixuan.froggerapp.views;

import xixuan.froggerapp.models.WetTurtle;
import xixuan.froggerapp.settings.MyStage;

/**
 * This class displays or removes a wet turtle in the game
 * @author XIXUAN WANG
 */
public class WetTurtleView {
	MyStage background; 
	
	public WetTurtleView(MyStage background) {
		this.background = background;
	}
	
	/**
	 * This adds the wet turtle into the game. 
	 * @param model an instance of WetTurtle
	 */
	public void viewWetTurtle(WetTurtle model) {
		background.add(model);
	}
	
	/**
	 * This removes the wet turtle currently in the game.
	 * @param model an instance of WetTurtle
	 */
	public void removeWetTurtle(WetTurtle model) {
		background.remove(model);
	}	
}