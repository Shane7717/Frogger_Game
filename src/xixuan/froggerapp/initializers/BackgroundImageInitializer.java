package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.BackgroundImageController;
import xixuan.froggerapp.models.BackgroundImage;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.BackgroundImageView;

public class BackgroundImageInitializer implements Initializable {
	private MyStage background;
	
	public BackgroundImageInitializer(MyStage background) {
		this.background = background;
	}
	
	@Override
	public void initialize() {
		
		BackgroundImage bgImage = new BackgroundImage("file:resources/images/background/arcade.png");
		BackgroundImageView bgImageView = new BackgroundImageView(background);
		BackgroundImageController bgImageController = new BackgroundImageController(bgImage, bgImageView);
		bgImageController.updateView();	
		
	}
}
