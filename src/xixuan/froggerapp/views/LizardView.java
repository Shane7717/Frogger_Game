package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Lizard;
import xixuan.froggerapp.settings.MyStage;

public class LizardView {
	MyStage background; 
	
	public LizardView(MyStage background) {
		this.background = background;
	}
	
	//Display the lizard on the screen
	public void viewLizard(Lizard model) {
		background.add(model);
	}
}