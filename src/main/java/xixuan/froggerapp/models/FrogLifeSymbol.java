package main.java.xixuan.froggerapp.models;

import javafx.scene.image.Image;

/**
 * This class is used to instantiate frog's life symbols.
 * @author XIXUAN WANG
 */
public class FrogLifeSymbol extends Actor {

	private int size;
	private String imageLink;
	
	/** The x position of this life symbol in the game. */
	private int xpos;
	
	/** The y position of this life symbol in the game. */
	private int ypos;
	
	//Constructor
	public FrogLifeSymbol(String imageLink, int size, int xpos, int ypos) {
		setImageLink(imageLink);
		setSize(size);
		setXpos(xpos);
		setYpos(ypos);
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}
	
	@Override
	public void act(long now) {}
	
	public void setSize(int size) {
		this.size = size;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}
	
	/**
	 * This sets the image/appearance of the frog's life symbol on the screen.
	 * @param imageLink the image that is set for the frog's life symbol
	 */
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}

	public void setXpos(int xpos) {
		this.xpos = xpos;
		setX(this.xpos);
	}

	public void setYpos(int ypos) {
		this.ypos = ypos;
		setY(this.ypos);
	}
}
