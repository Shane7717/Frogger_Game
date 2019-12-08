package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.CrocodileController;
import xixuan.froggerapp.models.Crocodile;
import xixuan.froggerapp.models.Frog;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.CrocodileView;

/**
 * This class initializes all the relevant instances of Crocodile.
 * @author XIXUAN WANG
 */
public class CrocodilesInitializer implements Initializable {
	private MyStage background;
	private CrocodileController crocodile1controller;
	private CrocodileController crocodile2controller;
	
	public CrocodilesInitializer(MyStage background) {
		this.background = background;
	}
	
	/**
	 * This initializes two crocodiles in the game.
	 */
	public void initialize() {
		Crocodile crocodile1model = new Crocodile(130, 1000, 376, 0);
		CrocodileView crocodile1view = new CrocodileView(background);
		crocodile1controller = new CrocodileController(crocodile1model, crocodile1view);
		crocodile1controller.updateView(); 
		
		Crocodile crocodile2model = new Crocodile(130, 1000, 222, 0);
		CrocodileView crocodile2view = new CrocodileView(background);
		crocodile2controller = new CrocodileController(crocodile2model, crocodile2view);
		crocodile2controller.updateView();	
	}
	
	/**
	 * This sets relevant parameters for the normal game level.<br> 
	 * Specifically, this adjusts the speed and x position of the two crocodiles.
	 */
	public void normal_settings() {
		Frog.crocodileLeftIntersectSpeed = -1.6;
		crocodile1controller.setCrocodileXpos(500);
		crocodile1controller.setCrocodileSpeed(Frog.crocodileLeftIntersectSpeed);
		crocodile2controller.setCrocodileXpos(600);
		crocodile2controller.setCrocodileSpeed(Frog.crocodileLeftIntersectSpeed);
	}
	
	/**
	 * This sets relevant parameters for the hard game level.<br> 
	 * Specifically, this adjusts the speed and x position of the two crocodiles.
	 */
	public void hard_settings() {
		Frog.crocodileLeftIntersectSpeed = -3.2;
		crocodile1controller.setCrocodileXpos(500);
		crocodile1controller.setCrocodileSpeed(Frog.crocodileLeftIntersectSpeed);
		crocodile2controller.setCrocodileXpos(600);
		crocodile2controller.setCrocodileSpeed(Frog.crocodileLeftIntersectSpeed);		
	}
	
	/**
	 * This sets relevant parameters for the extra game level.<br> 
	 * Specifically, this removes the two crocodiles in the game.
	 */
	public void extra_settings() {
		Frog.crocodileLeftIntersectSpeed = 0;
		crocodile1controller.removeView();
		crocodile2controller.removeView();
	}
}
