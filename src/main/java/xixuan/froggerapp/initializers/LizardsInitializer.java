package main.java.xixuan.froggerapp.initializers;

import main.java.xixuan.froggerapp.controllers.LizardController;
import main.java.xixuan.froggerapp.models.Lizard;
import main.java.xixuan.froggerapp.settings.MyStage;
import main.java.xixuan.froggerapp.views.LizardView;

/**
 * This class initializes all the relevant instances of Lizard.
 * @author XIXUAN WANG
 */
public class LizardsInitializer implements Initializable {
	private MyStage background;
	private LizardController lizard1controller;
	private LizardController lizard2controller;
		
	public LizardsInitializer(MyStage background) {
		this.background = background;
	}
	
	/**
	 * This initializes two lizards in the game.
	 */
	public void initialize() {
		Lizard lizard1model = new Lizard(130, 1000, 435, 0);
		LizardView lizard1view = new LizardView(background);
		lizard1controller = new LizardController(lizard1model, lizard1view);
		lizard1controller.updateView(); 
		
		Lizard lizard2model = new Lizard(130, 1000, 285, 0);
		LizardView lizard2view = new LizardView(background);
		lizard2controller = new LizardController(lizard2model, lizard2view);
		lizard2controller.updateView(); 
				
	}
	
	/**
	 * This sets relevant parameters for the hard game level.<br> 
	 * Specifically, this adjusts the speed and x position of the two lizards.
	 */
	public void hard_settings() {
		lizard1controller.setLizardXpos(300);
		lizard1controller.setLizardSpeed(-4.0);
		lizard2controller.setLizardXpos(120);
		lizard2controller.setLizardSpeed(-4.8);
	}	
	
	/**
	 * This sets relevant parameters for the extra game level.<br> 
	 * Specifically, this removes the two lizards in the game.
	 */
	public void extra_settings() {
		lizard1controller.removeView();
		lizard2controller.removeView();
	}
}
