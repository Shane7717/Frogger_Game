package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.Digit;
import xixuan.froggerapp.views.DigitView;

/**
 * This class controls an object of the class Digit.<br>
 * This controls the size, x position, y position, digit number and view of a Digit object.
 * @author XIXUAN WANG
 * @see xixuan.froggerapp.views.DigitView
 * @see xixuan.froggerapp.models.Digit
 */
public class DigitController {

	private Digit model;
	private DigitView view;
	
	public DigitController(Digit model, DigitView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setDigitSize(int size) {
		model.setSize(size);
	}

	public void setDigitXpos(int xpos) {
		model.setXpos(xpos);
	}

	public void setYpos(int ypos) {
		model.setYpos(ypos);	
	}

	/**
	 * This sets the image of an instance of Digit.
	 * @param digit an integer ranged from 0-9 that wants the instance to represent
	 */
	public void setDigit(int digit) {
		model.setDigit(digit);		
	}	
	
	/**
	 * This uses digit's 'view' object to display the digit in the game.
	 */
	public void updateView() {
		view.viewDigit(model);
	}
}
