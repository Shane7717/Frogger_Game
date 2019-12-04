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
	//Used to move the log
	public void act(long now) {
		move(this.speed, 0);
		if (getX() > 600 && this.speed > 0)
			setX(-180);
		if (getX() < -300 && this.speed < 0)
			setX(700);
	}
	
	public boolean getLeft() {
		return this.speed < 0;
	}
	
	//Set the speed of the log
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	//Return the speed of the log
	public double getSpeed() {
		return this.speed;
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

	//Return the image link of the log
	public String getImageLink() {
		return this.imageLink;
	}

	//Set the image link of the log
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
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
