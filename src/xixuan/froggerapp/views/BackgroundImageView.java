package xixuan.froggerapp.views;

import xixuan.froggerapp.models.BackgroundImage;
import xixuan.froggerapp.settings.MyStage;

public class BackgroundImageView {
	MyStage background;

	public BackgroundImageView(MyStage background) {
		this.background = background;
	}
	
	//Display the background image in the game
	public void viewBackgroundImage(BackgroundImage model) {
		background.add(model);
	}
}
