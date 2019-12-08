package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.End;
import xixuan.froggerapp.views.EndView;

/**
 * This class controls an object of the class End.<br>
 * This controls the size, image link, x position, y position, and view of an End object.
 * @author XIXUAN WANG
 * @see xixuan.froggerapp.views.EndView
 * @see xixuan.froggerapp.models.End
 */
public class EndController {

	private End model;
	private EndView view;
	
	public EndController(End model, EndView view) {
		this.model = model;
		this.view = view;
	}
		
	public void setEndSize(int size) {
		model.setSize(size);
	}

	public void setImageLink(String imageLink) {
		model.setImageLink(imageLink);
	}
	
	public void setEndXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	public void setEndYpos(int ypos) {
		model.setYpos(ypos);
	}
		
	/**
	 * This uses ends's 'view' object to display the end in the game.
	 */
	public void updateView() {
		view.viewEnd(model);
	}
}
