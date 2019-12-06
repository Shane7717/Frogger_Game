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
	public void act(long now) {}
	
	//Set the image of the end in the game
	public void setEnd() {
		setImage(new Image("file:resources/images/ends/FrogEnd.png", 70, 70, true, true));
		this.activated = true;
	}
	
	//Check if this end has contained a frog already
	public boolean isActivated() {
		return activated;
	}

	//Set the image of the end
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}
	
	//Set the size of the end
	public void setSize(int size) {
		this.size = size;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}
	
	//Set the x position of the end
	public void setXpos(int xpos) {
		this.xpos = xpos;
		setX(this.xpos);
	}

	//Set the y position of the end
	public void setYpos(int ypos) {
		this.ypos = ypos;
		setY(this.ypos);
	}
}
