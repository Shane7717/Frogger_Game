package xixuan.froggerapp.models;

import javafx.scene.image.Image;

public class Log extends Actor {

	private double speed;
	private int size;
	private String imageLink;
	private int xpos;
	private int ypos;
	
	public Log(String imageLink, int size, int xpos, int ypos, double speed) {
		setImageLink(imageLink);
		setSize(size);
		setXpos(xpos);
		setYpos(ypos);
		setSpeed(speed);	
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}
	
	@Override
	public void act(long now) {
		move(this.speed, 0);
		if (getX() > 600 && this.speed > 0)
			setX(-180);
		if (getX() < -300 && this.speed < 0)
			setX(700);
	}
	
	//Check if the log is moving left
	public boolean getLeft() {
		return this.speed < 0;
	}
	
	//Set the speed of the log
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	//Set the size of the log
	public void setSize(int size) {
		this.size = size;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}

	//Set the image of the log
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}

	//Set the x position of the log
	public void setXpos(int xpos) {
		this.xpos = xpos;
		setX(this.xpos);
	}

	//Set the y position of the log
	public void setYpos(int ypos) {
		this.ypos = ypos;
		setY(this.ypos);
	}
	
}
