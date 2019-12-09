package main.java.xixuan.froggerapp.initializers;

import main.java.xixuan.froggerapp.controllers.BackgroundImageController;
import main.java.xixuan.froggerapp.models.BackgroundImage;
import main.java.xixuan.froggerapp.settings.MyStage;
import main.java.xixuan.froggerapp.views.BackgroundImageView;

/**
 * This class initializes all the relevant instances of BackgroundImage.
 * @author XIXUAN WANG
 */
public class BackgroundImageInitializer implements Initializable {
	
	private MyStage background;
	BackgroundImageController bgImageController;
	

	public BackgroundImageInitializer(MyStage background) {
		this.background = background;
	}
	
	/**
	 * This initializes a background image instance in the game
	 */
	public void initialize() {	
		BackgroundImage bgImage = new BackgroundImage("file:resources/images/background/arcade.png");
		BackgroundImageView bgImageView = new BackgroundImageView(background);
		bgImageController = new BackgroundImageController(bgImage, bgImageView);
		bgImageController.updateView();	
		
	}
	
	/**
	 * This sets relevant parameters for the extra game level.<br>
	 * Specifically, this changes a background image of the instance.
	 */
	public void extra_settings() {
		bgImageController.setImageLink("file:resources/images/background/arcade2.png");
	}
}
