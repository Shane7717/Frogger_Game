package xixuan.froggerapp.views;

import xixuan.froggerapp.models.BackgroundImage;
import xixuan.froggerapp.settings.MyStage;

/**
 * This class displays the background object(model) in the game.
 * @author XIXUAN WANG
 */
public class BackgroundImageView {
	MyStage background;

	public BackgroundImageView(MyStage background) {
		this.background = background;
	}
	
	/**
	 * This adds the background object into the game.
	 * @param model an instance of BackgroundImage
	 */
	public void viewBackgroundImage(BackgroundImage model) {
		background.add(model);
	}
}
