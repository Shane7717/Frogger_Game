package main.java.xixuan.froggerapp.views;

import main.java.xixuan.froggerapp.models.Turtle;
import main.java.xixuan.froggerapp.settings.MyStage;

/**
 * This class displays or removes a turtle in the game
 * @author XIXUAN WANG
 */
public class TurtleView {
	MyStage background; 
	
	public TurtleView(MyStage background) {
		this.background = background;
	}
	
	/**
	 * This adds the turtle into the game. 
	 * @param model an instance of Turtle
	 */
	public void viewTurtle(Turtle model) {
		background.add(model);
	}
	
	/**
	 * This removes the turtle currently in the game.
	 * @param model an instance of Turtle
	 */
	public void removeTurtle(Turtle model) {
		background.remove(model);
	}
}