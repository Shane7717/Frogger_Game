package main.java.xixuan.froggerapp.controllers;

import main.java.xixuan.froggerapp.models.Turtle;
import main.java.xixuan.froggerapp.views.TurtleView;

/**
 * This class controls an object of the class Turtle.<br>
 * This controls the speed, size, x position, y position and view of a turtle.
 * @author XIXUAN WANG
 * @see main.java.xixuan.froggerapp.views.TurtleView
 * @see main.java.xixuan.froggerapp.models.Turtle
 */
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
	
	public void setTurtleSize(int size) {
		model.setSize(size);
	}
			
	public void setTurtleXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	public void setTurtleYpos(int ypos) {
		model.setYpos(ypos);
	}
	
	/**
	 * This uses turtle's 'view' object to display the turtle in the game. 
	 */
	public void updateView() {
		view.viewTurtle(model);
	}
	
	/**
	 * This uses turtle's 'view' object to remove the turtle in the game. 
	 */
	public void removeView() {
		view.removeTurtle(model);
	}
}
