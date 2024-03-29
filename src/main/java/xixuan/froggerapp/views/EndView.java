package main.java.xixuan.froggerapp.views;

import main.java.xixuan.froggerapp.models.End;
import main.java.xixuan.froggerapp.settings.MyStage;

/**
 * This class displays an end in the game.
 * @author XIXUAN WANG
 */
public class EndView {
	MyStage background; 
	
	public EndView(MyStage background) {
		this.background = background;
	}
	
	/**
	 * This adds the end into the game.
	 * @param model an instance of End
	 */
	public void viewEnd(End model) {
		background.add(model);
	}
}