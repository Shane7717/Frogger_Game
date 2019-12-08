package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Crocodile;
import xixuan.froggerapp.settings.MyStage;

/**
 * This class displays or removes a crocodile in the game.
 * @author XIXUAN WANG
 */
public class CrocodileView {
	MyStage background; 
	
	public CrocodileView(MyStage background) {
		this.background = background;
	}
	
	/**
	 * This adds the crocodile into the game. 
	 * @param model an instance of Crocodile
	 */
	public void viewCrocodile(Crocodile model) {
		background.add(model);
	}
	
	/**
	 * This removes the crocodile currently in the game.
	 * @param model an instance of Crocodile
	 */
	public void removeCrocodile(Crocodile model) {
		background.remove(model);
	}
} 