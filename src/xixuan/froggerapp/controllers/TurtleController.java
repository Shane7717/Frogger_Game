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
	
	//Set the speed of the turtle
	public void setTurtleSpeed(double speed) {
		model.setSpeed(speed);
	}
	
	//Set the size of the turtle
	public void setTurtleSize(int size) {
		model.setSize(size);
	}
			
	//Set the x position of the turtle
	public void setTurtleXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	//Set the y position of the turtle
	public void setTurtleYpos(int ypos) {
		model.setYpos(ypos);
	}
	
	//Show this turtle in the game
	public void updateView() {
		view.viewTurtle(model);
	}
}
