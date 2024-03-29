package main.java.xixuan.froggerapp.controllers;

import main.java.xixuan.froggerapp.models.BackgroundImage;
import main.java.xixuan.froggerapp.views.BackgroundImageView;

/**
 * This class controls an object of the class BackgroundImage. <br>
 * This controls the image link, image width, image height and view of the background image.
 * @author XIXUAN WANG
 * @see main.java.xixuan.froggerapp.views.BackgroundImageView
 * @see main.java.xixuan.froggerapp.models.BackgroundImage
 */
public class BackgroundImageController {
	
	private BackgroundImage model;	
	private BackgroundImageView view;
	

	public BackgroundImageController(BackgroundImage model, BackgroundImageView view) {
		this.model = model;
		this.view = view;
	}
	
	/**
	 * This sets the image of the background object.
	 * @param imageLink 	the new image link that can be reset for the background object
	 */
	public void setImageLink(String imageLink) {
		model.setImageLink(imageLink);
	}

	/** 
	 * This uses the object 'view' to display the background object(model) in the game. 
	 */
	public void updateView() {
		view.viewBackgroundImage(model);
	}
}
