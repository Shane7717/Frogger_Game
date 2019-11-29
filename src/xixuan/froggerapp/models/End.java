package xixuan.froggerapp.models;

import javafx.scene.image.Image;

public class End extends Actor{
	private boolean activated = false;
	private String imageLink;
	private int size = 60;
	private int xpos;
	private int ypos;
	
	//Constructor
	public End(String imageLink, int xpos, int ypos) {
		setImageLink(imageLink);
		setXpos(xpos);
		setYpos(ypos);
		setImage(new Image(imageLink, this.size, this.size, true, true));
	}
	
	@Override
	public void act(long now) {
		// TODO Auto-generated method st
	}
	
	public void setEnd() {
		setImage(new Image("file:resources/images/ends/FrogEnd.png", 70, 70, true, true));
		this.activated = true;
	}
	
	public boolean isActivated() {
		return activated;
	}
	
	//Return the image link of the log
	public String getImageLink() {
		return this.imageLink;
	}

	//Set the image link of the log
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}
	
	//Return the size of the log
	public int getSize() {
		return this.size;
	}

	//Set the size of the log
	public void setSize(int size) {
		this.size = size;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}
	
	//Return the x position of the log
	public int getXpos() {
		return this.xpos;
	}

	//Set the x position of the log
	public void setXpos(int xpos) {
		this.xpos = xpos;
		setX(xpos);
	}

	//Return the y position of the log
	public int getYpos() {
		return this.ypos;
	}

	//Set the y position of the log
	public void setYpos(int ypos) {
		this.ypos = ypos;
		setY(ypos);
	}
}
