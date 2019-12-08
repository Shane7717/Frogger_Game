package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.Digit;
import xixuan.froggerapp.views.DigitView;

public class DigitController {

	private Digit model;
	private DigitView view;
	
	public DigitController(Digit model, DigitView view) {
		this.model = model;
		this.view = view;
	}
	
	//Set the size of the digit
	public void setDigitSize(int size) {
		model.setSize(size);
	}

	//Set the x position of the digit
	public void setDigitXpos(int xpos) {
		model.setXpos(xpos);
	}

	//Set the y position of the digit
	public void setYpos(int ypos) {
		model.setYpos(ypos);	
	}

	//Set the image of the digit
	public void setDigit(int digit) {
		model.setDigit(digit);		
	}	
	
	//Display this digit in the game
	public void updateView() {
		view.viewDigit(model);
	}
}
