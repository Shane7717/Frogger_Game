package main.java.xixuan.froggerapp.views;

import main.java.xixuan.froggerapp.models.Lizard;
import main.java.xixuan.froggerapp.settings.MyStage;

/**
 * This class displays or removes a lizard in the game
 * @author XIXUAN WANG
 */
public class LizardView {
	MyStage background; 
	
	public LizardView(MyStage background) {
		this.background = background;
	}
		
	/**
	 * This adds the lizard into the game. 
	 * @param model an instance of Lizard
	 */
	public void viewLizard(Lizard model) {
		background.add(model);
	}
	
	/**
	 * This removes the lizard currently in the game.
	 * @param model an instance of Lizard
	 */
	public void removeLizard(Lizard model) {
		background.remove(model);
	}
}