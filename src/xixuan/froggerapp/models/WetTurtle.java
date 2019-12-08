package xixuan.froggerapp.models;

import javafx.scene.image.Image;

/**
 * This class is used to instantiate wet turtles.
 * @author XIXUAN WANG
 */
public class WetTurtle extends Actor{
	private Image wetturtle1;
	private Image wetturtle2;
	private Image wetturtle3;
	private Image wetturtle4;
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
		wetturtle1 = new Image("file:resources/images/turtles/TurtleAnimation1.png", this.size, this.size, true, true);
		wetturtle2 = new Image("file:resources/images/turtles/TurtleAnimation2Wet.png", this.size, this.size, true, true);
		wetturtle3 = new Image("file:resources/images/turtles/TurtleAnimation3Wet.png", this.size, this.size, true, true);
		wetturtle4 = new Image("file:resources/images/turtles/TurtleAnimation4Wet.png", this.size, this.size, true, true);		
		setImage(wetturtle2);
	}
	
	/**
	 * This implements the animation of wet turtles from wetturtle1 to wetturtle4
	 * @param now 		this is the real time that is increasing since game starts
	 */
	@Override
	public void act(long now) {		
		if (now/900000000  % 4 ==0) {
			setImage(wetturtle2);
			sunk = false;
			
		}
		else if (now/900000000 % 4 == 1) {
			setImage(wetturtle1);
			sunk = false;
		}
		else if (now/900000000 %4 == 2) {
			setImage(wetturtle3);
			sunk = false;
		} else if (now/900000000 %4 == 3) {
			setImage(wetturtle4);
			sunk = true;
		}			
		move(speed, 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
	}

	/**
	 * This checks whether or not the wet turtle has sunk into the water.
	 * @return <strong>true</strong> if the wet turtle sinks below the water surface.<br>
	 * 		   <strong>false</strong> otherwise.
	 */
	public boolean isSunk() {
		return sunk;
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
