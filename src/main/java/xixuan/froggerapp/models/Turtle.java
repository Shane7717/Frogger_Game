package main.java.xixuan.froggerapp.models;

import javafx.scene.image.Image;

/**
 * This class is used to instantiate turtles.
 * @author XIXUAN WANG
 */
public class Turtle extends Actor {
	/** The first state of animation of this moving turtle.*/
	private Image turtle1;
	
	/** The second state of animation of this moving turtle.*/
	private Image turtle2;
	
	/** The third state of animation of this moving turtle.*/
	private Image turtle3;
	
	private double speed;
	private int size;
	
	/** The x position of this turtle in the game. */
	private int xpos;
	
	/** The y position of this turtle in the game. */
	private int ypos;
	 
	public Turtle(int size, int xpos, int ypos, double speed) {
		setSize(size);
		setXpos(xpos);
		setYpos(ypos);
		setSpeed(speed);			
		turtle1 = new Image("file:src/main/resources/images/turtles/TurtleAnimation1.png", this.size, this.size, true, true);
		turtle2 = new Image("file:src/main/resources/images/turtles/TurtleAnimation2.png", this.size, this.size, true, true);
		turtle3 = new Image("file:src/main/resources/images/turtles/TurtleAnimation3.png", this.size, this.size, true, true);
		setImage(turtle2);
	}
	
	/**
	 * This implements the animation of turtles from turtle1 to turtle3
	 * @param now 		the timestamp of the current frame given in nanoseconds.
	 */
	@Override
	public void act(long now) {

		if (now/900000000  % 3 ==0) {
			setImage(turtle2);			
		}
		else if (now/900000000 % 3 == 1) {
			setImage(turtle1);		
		}
		else if (now/900000000 %3 == 2) {
			setImage(turtle3);
		}			
		move(speed, 0);		
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
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
