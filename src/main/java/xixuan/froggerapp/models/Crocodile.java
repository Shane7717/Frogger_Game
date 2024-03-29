package main.java.xixuan.froggerapp.models;

import javafx.scene.image.Image;

/**
 * This class is used to instantiate crocodiles.
 * @author XIXUAN WANG
 */
public class Crocodile extends Actor {
	/** The first state of animation of this moving crocodile.*/
	private Image crocodile1;
	
	/** The second state of animation of this moving crocodile.*/
	private Image crocodile2;
	
	/** The third state(crazy state) of animation of this moving crocodile.*/
	private Image crocodile3;
	
	private double speed;
	private int size;
	
	/** The x position of this crocodile in the game. */
	private int xpos;
	
	/** The y position of this crocodile in the game. */
	private int ypos;
	
	/** If the crocodile becomes red(crazy), this value will be set true.<br><br>
	 *  Therefore, the frog that player controls will die immediately.*/
	private boolean crazyDeath = false;
	 
	//Constructor
	public Crocodile(int size, int xpos, int ypos, double speed) {
		setSize(size);
		setXpos(xpos);
		setYpos(ypos);
		setSpeed(speed);			
		crocodile1 = new Image("file:src/main/resources/images/crocodiles/closeCrocodile.png", this.size, this.size, true, true);
		crocodile2 = new Image("file:src/main/resources/images/crocodiles/openCrocodile.png", this.size, this.size, true, true);
		crocodile3 = new Image("file:src/main/resources/images/crocodiles/deathCrocodile.png", this.size, this.size, true, true);
		setImage(crocodile1);
	}
	
	/**
	 * This implements the animation of crocodiles from crocodile1 to crocodile3
	 * @param now 		the timestamp of the current frame given in nanoseconds.
	 */
	@Override
	public void act(long now) {
		
		if (now/900000000  % 3 == 0) {
			setImage(crocodile1);
			this.crazyDeath = false; 
		}
		else if (now/900000000 % 3 == 1) {
			setImage(crocodile2);	
			this.crazyDeath = false;
		}
		else if (now/900000000 % 3 == 2) {
			setImage(crocodile3);
			this.crazyDeath = true;
		}
		move(speed, 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
	}
	
	/**
	 * This checks whether or not the crocodile turns red and gets crazy.<br>
	 * @return <strong>true</strong> if the crocodile becomes red and crazy. <br>
	 *		   <strong>false</strong> if the crocodile is not red and not crazy.
	 */
	public boolean isCrazyDeath() {
		return this.crazyDeath;
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
