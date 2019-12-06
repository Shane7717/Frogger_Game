package xixuan.froggerapp.models;

import javafx.scene.image.Image;

public class Lizard extends Actor{
	private Image lizard1;
	private Image lizard2;
	private Image lizard3;
	private Image lizard4;
	private double speed;
	private int size;
	private int xpos;
	private int ypos;
	 
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
	
	//Set the speed of the lizard
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	//Set the size of the lizard
	public void setSize(int size) {
		this.size = size;
	}
	
	//Set the x position of the lizard
	public void setXpos(int xpos) {
		this.xpos = xpos;
		setX(this.xpos);
	}

	//Set the y position of the lizard
	public void setYpos(int ypos) {
		this.ypos = ypos;
		setY(this.ypos);
	}	
}
