package xixuan.froggerapp.initializers;

import xixuan.froggerapp.controllers.LizardController;
import xixuan.froggerapp.models.Lizard;
import xixuan.froggerapp.settings.MyStage;
import xixuan.froggerapp.views.LizardView;

public class LizardsInitializer implements Initializable {
	private MyStage background;
	private LizardController lizard1controller;
	private LizardController lizard2controller;
		
	public LizardsInitializer(MyStage background) {
		this.background = background;
	}
	
	@Override
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
		
	public void hard_settings() {
		lizard1controller.setLizardXpos(300);
		lizard1controller.setLizardSpeed(-4.0);
		lizard2controller.setLizardXpos(120);
		lizard2controller.setLizardSpeed(-4.8);
	}	
	
	public void extra_settings() {
		lizard1controller.removeView();
		lizard2controller.removeView();
	}
}
