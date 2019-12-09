package main.java.xixuan.froggerapp.models;

import javafx.scene.image.Image;

/**
 * This class is used to instantiate lizards.
 * @author XIXUAN WANG
 */
public class Lizard extends Actor{
	private Image lizard1;
	private Image lizard2;
	private Image lizard3;
	private Image lizard4;
	private double speed;
	private int size;
	private int xpos;
	private int ypos;
	 
	//Constructor
	public Lizard(int size, int xpos, int ypos, double speed) {
		setSize(size);
		setXpos(xpos);
		setYpos(ypos);
		setSpeed(speed);			
		lizard1 = new Image("file:resources/images/lizards/lizard1.png", this.size, this.size, true, true);
		lizard2 = new Image("file:resources/images/lizards/lizard2.png", this.size, this.size, true, true);
		lizard3 = new Image("file:resources/images/lizards/lizard3.png", this.size, this.size, true, true);
		lizard4 = new Image("file:resources/images/lizards/lizard4.png", this.size, this.size, true, true);
		setImage(lizard1);
	}
	
	/**
	 * This implements the animation of lizards from lizard1 to lizard4
	 * @param now 		this is the real time that is increasing since game starts
	 */
	@Override
	public void act(long now) {
		if (now/400000000  % 4 == 0) {
			setImage(lizard1);			
		}
		else if(now/400000000  % 4 == 1) {
			setImage(lizard2);
		}
		else if (now/400000000  % 4 == 2){
			setImage(lizard3);
		} else {
			setImage(lizard4);
		}		
		move(speed, 0);		
		if (getX() > 600 && this.speed > 0)
			setX(-180);
		if (getX() < -300 && this.speed < 0)
			setX(700);
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setSize(int size) {
		this.size = size;
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
