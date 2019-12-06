package xixuan.froggerapp.models;

import javafx.scene.image.Image;

public class BackgroundImage extends Actor {
	
	private String imageLink;
	private int imageWidth = 600;
	private int imageHeight = 800;
		
	public BackgroundImage(String imageLink) {
		setImageLink(imageLink);
		setImage(new Image(this.imageLink, this.imageWidth, this.imageHeight, true, true));
	}

	//Set the background image
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
		setImage(new Image(this.imageLink, this.imageWidth, this.imageHeight, true, true));
	}

	//Set the width of the background image
	public void setImageWidth(int imageWidth) {
		this.imageWidth = imageWidth;
		setImage(new Image(this.imageLink, this.imageWidth, this.imageHeight, true, true));
	}

	//Set the height of the background image
	public void setImageHeight(int imageHeight) {
		this.imageHeight = imageHeight;
		setImage(new Image(this.imageLink, this.imageWidth, this.imageHeight, true, true));
	}
	
	@Override
	public void act(long now) {}
}
