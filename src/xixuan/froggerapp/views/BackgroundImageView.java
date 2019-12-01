package xixuan.froggerapp.views;

import xixuan.froggerapp.models.BackgroundImage;
import xixuan.froggerapp.settings.MyStage;

public class BackgroundImageView {
	MyStage background;

	public BackgroundImageView(MyStage background) {
		this.background = background;
	}
	
	//Display the frog that player manipulates.
	public void viewBackgroundImage(BackgroundImage model) {
		background.add(model);
	}
}
