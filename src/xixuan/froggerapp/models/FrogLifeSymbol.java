package xixuan.froggerapp.models;

import javafx.scene.image.Image;

public class FrogLifeSymbol extends Actor {

	private int size;
	private String imageLink;
	private int xpos;
	private int ypos;
	
	public FrogLifeSymbol(String imageLink, int size, int xpos, int ypos) {
		setImageLink(imageLink);
		setSize(size);
		setXpos(xpos);
		setYpos(ypos);
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}
	
	@Override
	public void act(long now) {}
	
	//Set the size of the frog life symbol
	public void setSize(int size) {
		this.size = size;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}

	//Set the image of the frog life symbol
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}

	//Set the x position of the frog life symbol
	public void setXpos(int xpos) {
		this.xpos = xpos;
		setX(this.xpos);
	}

	//Set the y position of the frog life symbol
	public void setYpos(int ypos) {
		this.ypos = ypos;
		setY(this.ypos);
	}
	
}
