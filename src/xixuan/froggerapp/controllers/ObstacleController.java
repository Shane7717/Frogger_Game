package xixuan.froggerapp.controllers;

import xixuan.froggerapp.models.Obstacle;
import xixuan.froggerapp.views.ObstacleView;

public class ObstacleController {

	private Obstacle model;
	private ObstacleView view;
	
	public ObstacleController(Obstacle model, ObstacleView view) {
		this.model = model;
		this.view = view;
	}
	
	//Set the speed of the obstacle
	public void setObstacleSpeed(double speed) {
		model.setSpeed(speed);
	}
		
	//Set the size of the obstacle
	public void setObstacleSize(int size) {
		model.setSize(size);
	}
	
	//Set the image of the obstacle
	public void setImageLink(String imageLink) {
		model.setImageLink(imageLink);
	}
		
	//Set the x position of the obstacle
	public void setObstacleXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	//Set the y position of the obstacle
	public void setObstacleYpos(int ypos) {
		model.setYpos(ypos);
	}
	
	//Display this obstacle in the game
	public void updateView() {
		view.viewObstacle(model);
	}
}
