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
	
	public int getDigitSize() {
		return model.getSize();
	}

	public void setDigitSize(int size) {
		model.setSize(size);
	}

	public int getDigitXpos() {
		return model.getXpos();
	}

	public void setDigitXpos(int xpos) {
		model.setXpos(xpos);
	}

	public int getDigitYpos() {
		return model.getYpos();
	}

	public void setYpos(int ypos) {
		model.setYpos(ypos);	
	}

	public int getDigit() {
		return model.getDigit();
	}

	public void setDigit(int digit) {
		model.setDigit(digit);		
	}	
	
	public void updateView() {
		view.viewDigit(model);
	}
}
