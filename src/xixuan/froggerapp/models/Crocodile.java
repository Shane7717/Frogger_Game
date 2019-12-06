package xixuan.froggerapp.models;

import javafx.scene.image.Image;

public class Crocodile extends Actor{
	private Image crocodile1;
	private Image crocodile2;
	private Image crocodile3;
	private double speed;
	private int size;
	private int xpos;
	private int ypos;
	private boolean crazyDeath = false;
	 
	public Crocodile(int size, int xpos, int ypos, double speed) {
		setSize(size);
		setXpos(xpos);
		setYpos(ypos);
		setSpeed(speed);			
		crocodile1 = new Image("file:resources/images/crocodiles/closeCrocodile.png", this.size, this.size, true, true);
		crocodile2 = new Image("file:resources/images/crocodiles/openCrocodile.png", this.size, this.size, true, true);
		crocodile3 = new Image("file:resources/images/crocodiles/deathCrocodile.png", this.size, this.size, true, true);
		setImage(crocodile1);
	}
	
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
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
	}
	
	public boolean getLeft() {
		return this.speed < 0;
	}
	
	
	public boolean isCrazyDeath() {
		return this.crazyDeath;
	}
	
	//Set the speed of the crocodile
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	//Set the size of the crocodile
	public void setSize(int size) {
		this.size = size;
	}
	
	//Set the x position of the crocodile
	public void setXpos(int xpos) {
		this.xpos = xpos;
		setX(this.xpos);
	}

	//Set the y position of the crocodile
	public void setYpos(int ypos) {
		this.ypos = ypos;
		setY(this.ypos);
	}	
}
