package xixuan.froggerapp.models;

import javafx.scene.image.Image;

public class Obstacle extends Actor {
	private double speed;
	private int size;
	private String imageLink;
	private int xpos;
	private int ypos;
		
	public Obstacle(String imageLink, int size, int xpos, int ypos, double speed) {
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
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	//Set the size of the obstacle
	public void setSize(int size) {
		this.size = size;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}

	//Set the image of the obstacle
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}

	//Set the x position of the obstacle
	public void setXpos(int xpos) {
		this.xpos = xpos;
		setX(this.xpos);
	}

	//Set the y position of the obstacle
	public void setYpos(int ypos) {
		this.ypos = ypos;
		setY(this.ypos);
	}	
}
