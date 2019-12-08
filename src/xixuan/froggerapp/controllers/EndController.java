package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.End;
import xixuan.froggerapp.views.EndView;


public class EndController {

	private End model;
	private EndView view;
	
	public EndController(End model, EndView view) {
		this.model = model;
		this.view = view;
	}
		
	//Set the size of the end
	public void setEndSize(int size) {
		model.setSize(size);
	}
	
	//Set the image of the end
	public void setImageLink(String imageLink) {
		model.setImageLink(imageLink);
	}
	
	//Set the x position of the end
	public void setEndXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	//Set the y position of the end
	public void setEndYpos(int ypos) {
		model.setYpos(ypos);
	}
		
	//Display thie end in the game
	public void updateView() {
		view.viewEnd(model);
	}
}
