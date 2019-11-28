package xixuan.froggerapp.models;

import javafx.scene.image.Image;

public class Obstacle extends Actor {
	private int speed;
	private int size;
	private String imageLink;
	private int xpos;
	private int ypos;
		
	public Obstacle(String imageLink, int size, int xpos, int ypos, int speed) {
		setImageLink(imageLink);
		setSize(size);
		setXpos(xpos);
		setYpos(ypos);
		setSpeed(speed);			 
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}
	
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -50 && speed<0)
			setX(600);
	}

	//Set the speed of the obstacle
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//Return the speed of the obstacle
	public double getSpeed() {
		return this.speed;
	}

	//Return the size of the obstacle
	public int getSize() {
		return this.size;
	}

	//Set the size of the obstacle
	public void setSize(int size) {
		this.size = size;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}

	//Return the image link of the obstacle
	public String getImageLink() {
		return this.imageLink;
	}

	//Set the image link of the obstacle
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}

	//Return the x position of the obstacle
	public int getXpos() {
		return this.xpos;
	}

	//Set the x position of the obstacle
	public void setXpos(int xpos) {
		this.xpos = xpos;
		setX(xpos);
	}

	//Return the y position of the obstacle
	public int getYpos() {
		return this.ypos;
	}

	//Set the y position of the obstacle
	public void setYpos(int ypos) {
		this.ypos = ypos;
		setY(ypos);
	}	
}
