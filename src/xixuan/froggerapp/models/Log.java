package xixuan.froggerapp.models;

import javafx.scene.image.Image;

/**
 * This class is used to instantiate logs.
 * @author XIXUAN WANG
 */
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
	
	/**
	 * This implements the animation of logs which are moving throughout the game.
	 * @param now 		this is the real time that is increasing since game starts
	 */
	@Override
	public void act(long now) {
		move(this.speed, 0);
		if (getX() > 600 && this.speed > 0)
			setX(-180);
		if (getX() < -300 && this.speed < 0)
			setX(700);
	}
	
	/**
	 * This checks whether or not the log is moving left.
	 * @return <strong>true</strong> if the log is moving left
	 * <br>	   <strong>false</strong> if the log is moving right
	 */
	public boolean getLeft() {
		return this.speed < 0;
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
