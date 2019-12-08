package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Frog;
import xixuan.froggerapp.settings.MyStage;

/**
 * This class displays the frog(main character) in the game
 * @author XIXUAN WANG
 */
public class FrogView {
	MyStage background;

	public FrogView(MyStage background) {
		this.background = background;
	}
	
	/**
	 * Display the frog that player controls in the game.
	 * @param model an instance of Frog
	 */
	public void viewFrog(Frog model) {
		background.add(model);
	}
}
