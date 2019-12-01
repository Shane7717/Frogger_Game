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
	
	public String getImageLink() {
		return model.getImageLink();
	}

	public void setImageLink(String imageLink) {
		model.setImageLink(imageLink);
	}

	public int getImageWidth() {
		return model.getImageWidth();
	}

	public void setImageWidth(int imageWidth) {
		model.setImageWidth(imageWidth);
	}

	public int getImageHeight() {
		return model.getImageHeight();
	}

	public void setImageHeight(int imageHeight) {
		model.setImageHeight(imageHeight);
	}

	public void updateView() {
		view.viewBackgroundImage(model);
	}
}
