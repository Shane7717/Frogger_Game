package xixuan.froggerapp.models;

import javafx.scene.image.Image;

public class WetTurtle extends Actor{
	private Image turtle1;
	private Image turtle2;
	private Image turtle3;
	private Image turtle4;
	private double speed;
	private int size;
	private int xpos;
	private int ypos;
	private boolean sunk = false;
	
	public WetTurtle(int size, int xpos, int ypos, double speed) {
		setSize(size);
		setXpos(xpos);
		setYpos(ypos);
		setSpeed(speed);	
		
		turtle1 = new Image("file:resources/images/turtles/TurtleAnimation1.png", this.size, this.size, true, true);
		turtle2 = new Image("file:resources/images/turtles/TurtleAnimation2Wet.png", this.size, this.size, true, true);
		turtle3 = new Image("file:resources/images/turtles/TurtleAnimation3Wet.png", this.size, this.size, true, true);
		turtle4 = new Image("file:resources/images/turtles/TurtleAnimation4Wet.png", this.size, this.size, true, true);
		
		setImage(turtle2);
	}
	
	@Override
	public void act(long now) {		
		if (now/900000000  % 4 ==0) {
			setImage(turtle2);
			sunk = false;
			
		}
		else if (now/900000000 % 4 == 1) {
			setImage(turtle1);
			sunk = false;
		}
		else if (now/900000000 %4 == 2) {
			setImage(turtle3);
			sunk = false;
		} else if (now/900000000 %4 == 3) {
			setImage(turtle4);
			sunk = true;
		}			
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
	}

	public boolean isSunk() {
		return sunk;
	}
	
	//Set the speed of the wet turtle
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	//Set the size of the wet turtle
	public void setSize(int size) {
		this.size = size;
	}
	
	//Set the x position of the wet turtle
	public void setXpos(int xpos) {
		this.xpos = xpos;
		setX(this.xpos);
	}

	//Set the y position of the wet turtle
	public void setYpos(int ypos) {
		this.ypos = ypos;
		setY(this.ypos);
	}	
}
