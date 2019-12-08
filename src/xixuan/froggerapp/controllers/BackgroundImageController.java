package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.BackgroundImage;
import xixuan.froggerapp.views.BackgroundImageView;

public class BackgroundImageController {
	
	private BackgroundImage model;
	private BackgroundImageView view;
	
	public BackgroundImageController(BackgroundImage model, BackgroundImageView view) {
		this.model = model;
		this.view = view;
	}
	
	//Set the background image
	public void setImageLink(String imageLink) {
		model.setImageLink(imageLink);
	}

	//Set the width of the background image
	public void setImageWidth(int imageWidth) {
		model.setImageWidth(imageWidth);
	}

	//Set the height of the background image
	public void setImageHeight(int imageHeight) {
		model.setImageHeight(imageHeight);
	}

	//Display this background image in the game
	public void updateView() {
		view.viewBackgroundImage(model);
	}
}
