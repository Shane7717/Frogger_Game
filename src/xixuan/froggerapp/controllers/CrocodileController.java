package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.Crocodile;
import xixuan.froggerapp.views.CrocodileView;

/**
 * This class controls an object of the class Crocodile.<br>
 * This controls the speed, size, x position, y position and view of a crocodile.
 * @author XIXUAN WANG
 * @see xixuan.froggerapp.views.CrocodileView
 * @see xixuan.froggerapp.models.Crocodile
 */
public class CrocodileController {

	private Crocodile model;
	private CrocodileView view;
	
	public CrocodileController(Crocodile model, CrocodileView view) {
		this.model = model;
		this.view = view;
	}
	
	
	public void setCrocodileSpeed(double speed) {
		model.setSpeed(speed);
	}
	
	public void setCrocodileSize(int size) {
		model.setSize(size);
	}
	
	public void setCrocodileXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	public void setCrocodileYpos(int ypos) {
		model.setYpos(ypos);
	}

	/**
	 * This uses crocodiles's 'view' object to display the crocodile in the game. 
	 */
	public void updateView() {
		view.viewCrocodile(model);
	}
	
	/**
	 * This uses crocodile's 'view' object to remove the crocodile in the game.
	 */
	public void removeView() {
		view.removeCrocodile(model);
	}
}
