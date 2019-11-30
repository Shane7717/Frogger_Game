package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.Turtle;
import xixuan.froggerapp.views.TurtleView;

public class TurtleController {

	private Turtle model;
	private TurtleView view;
	
	public TurtleController(Turtle model, TurtleView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setTurtleSpeed(double speed) {
		model.setSpeed(speed);
	}
	
	public double getTurtleSpeed() {
		return model.getSpeed();
	}
	
	public void setTurtleSize(int size) {
		model.setSize(size);
	}
	
	public int getTurtleSize() {
		return model.getSize();
	}
			
	public void setTurtleXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	public int getTurtleXpos() {
		return model.getXpos();
	}

	public void setTurtleYpos(int ypos) {
		model.setYpos(ypos);
	}
	
	public int getTurtleYpos() {
		return model.getYpos();
	}
	
	public void updateView() {
		view.viewTurtle(model);
	}
}
