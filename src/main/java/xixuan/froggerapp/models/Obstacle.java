package main.java.xixuan.froggerapp.models;

import javafx.scene.image.Image;

/**
 * This class is used to instantiate obstacles.
 * @author XIXUAN WANG
 */
public class Obstacle extends Actor {
	private double speed;
	private int size;
	private String imageLink;
	
	/** The x position of this obstacle in the game. */
	private int xpos;
	
	/** The y position of this obstacle in the game. */
	private int ypos;
		
	public Obstacle(String imageLink, int size, int xpos, int ypos, double speed) {
		setImageLink(imageLink);
		setSize(size);
		setXpos(xpos);
		setYpos(ypos);
		setSpeed(speed);			 
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}
	
	/**
	 * This implements the animation of obstacles which are moving throughout the game.
	 * @param now 		the timestamp of the current frame given in nanoseconds.
	 */
	@Override
	public void act(long now) {
		move(speed, 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -50 && speed<0)
			setX(600);
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setSize(int size) {
		this.size = size;
		setImage(new Image(this.imageLink, this.size, this.size, true, true));
	}

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
