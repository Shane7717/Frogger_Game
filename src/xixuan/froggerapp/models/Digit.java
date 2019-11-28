package xixuan.froggerapp.models;

import javafx.scene.image.Image;

public class Digit extends Actor{
	private int size;
	private int xpos;
	private int ypos;
	private int digit;
	
	public Digit(int digit, int size, int xpos, int ypos) {
		setDigit(digit);
		setSize(size);
		setX(xpos);
		setY(ypos);	
		setImage(new Image("file:resources/images/numbers/"+digit+".png", size, size, true, true));
	}
	
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
		setImage(new Image("file:resources/images/numbers/"+digit+".png", size, size, true, true));
	}

	public int getXpos() {
		return xpos;
	}

	public void setXpos(int xpos) {
		this.xpos = xpos;
		setX(xpos);
	}

	public int getYpos() {
		return ypos;
	}

	public void setYpos(int ypos) {
		this.ypos = ypos;
		setX(ypos);
	}

	public int getDigit() {
		return digit;
	}

	public void setDigit(int digit) {
		this.digit = digit;
		setImage(new Image("file:resources/images/numbers/"+digit+".png", size, size, true, true));
	}	
}
