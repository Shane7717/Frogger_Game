package xixuan.froggerapp.models;

import javafx.scene.image.Image;

/**
 * This class is used to instantiate digits.
 * @author XIXUAN WANG
 */
public class Digit extends Actor{
	private int size;
	private int xpos;
	private int ypos;
	private int digit;
	
	//Constructor
	public Digit(int digit, int size, int xpos, int ypos) {
		setDigit(digit);
		setSize(size);
		setX(xpos);
		setY(ypos);	
		setImage(new Image("file:resources/images/numbers/"+digit+".png", size, size, true, true));
	}
	
	@Override
	public void act(long now) {}

	//Set the size of the digit
	public void setSize(int size) {
		this.size = size;
		setImage(new Image("file:resources/images/numbers/"+digit+".png", size, size, true, true));
	}

	//Set the x position of the digit
	public void setXpos(int xpos) {
		this.xpos = xpos;
		setX(this.xpos);
	}

	//Set the y position of the digit
	public void setYpos(int ypos) {
		this.ypos = ypos;
		setX(this.ypos);
	}
	
	/**
	 * This sets a specific integer number that the object represents.
	 * @param digit the integer number that needs to be displayed in the game.
	 */
	public void setDigit(int digit) {
		this.digit = digit;
		setImage(new Image("file:resources/images/numbers/"+digit+".png", size, size, true, true));
	}	
}
