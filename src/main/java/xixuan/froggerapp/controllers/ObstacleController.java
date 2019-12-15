package main.java.xixuan.froggerapp.controllers;

import main.java.xixuan.froggerapp.models.Obstacle;
import main.java.xixuan.froggerapp.views.ObstacleView;

/**
 * This class controls an object of the class Obstacle.<br>
 * This controls the speed, size, image, x position, y position and view of an obstacle.
 * @author XIXUAN WANG
 * @see main.java.xixuan.froggerapp.views.ObstacleView
 * @see main.java.xixuan.froggerapp.models.Obstacle
 */
public class ObstacleController {

	private Obstacle model;
	private ObstacleView view;
	
	public ObstacleController(Obstacle model, ObstacleView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setObstacleSpeed(double speed) {
		model.setSpeed(speed);
	}
		
	public void setObstacleSize(int size) {
		model.setSize(size);
	}
	
	public void setImageLink(String imageLink) {
		model.setImageLink(imageLink);
	}
		
	public void setObstacleXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	public void setObstacleYpos(int ypos) {
		model.setYpos(ypos);
	}
	
	/**
	 * This uses obstacle's 'view' object to display the obstacle in the game. 
	 */
	public void updateView() {
		view.viewObstacle(model);
	}
	
	/**
	 * This uses obstacle's 'view' object to remove the obstacle in the game.
	 */
	public void removeView() {
		view.removeObstacle(model);
	}
}
