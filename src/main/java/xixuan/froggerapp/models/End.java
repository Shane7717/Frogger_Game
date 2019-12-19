package main.java.xixuan.froggerapp.models;

import javafx.scene.image.Image;

/**
 * This class is used to instantiate ends.
 * @author XIXUAN WANG
 */
public class End extends Actor {
	/** The boolean value that checks whether or not this end has contained a frog already*/
	private boolean activated = false;
	
	private String imageLink;
	private int size = 60;
	
	/** The x position of this end in the game. */
	private int xpos;
	
	/** The y position of this end in the game. */
	private int ypos;
	
	//Constructor
	public End(String imageLink, int xpos, int ypos) {
		setImageLink(imageLink);
		setXpos(xpos);
		setYpos(ypos);
		setImage(new Image(imageLink, this.size, this.size, true, true));
	}
	
	@Override
	public void act(long now) {}
	
	/**
	 * This sets the image after one frog enters one of the empty ends.
	 */
	public void setEnd() {
		setImage(new Image("file:src/main/resources/images/ends/FrogEnd.png", 70, 70, true, true));
		this.activated = true;
	}
	
	/**
	 * This checks whether or not this end has contained a frog already
	 * @return <strong>true</strong> if this end has contained a frog. <br>
	 * 		   <strong>false</strong> if this end is still empty.
	 */
	public boolean isActivated() {
		return activated;
	}

	/**
	 * This sets the image of the empty end
	 * @param imageLink the path of the image
	 */
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}
	
	public void setSize(int size) {
		this.size = size;
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
