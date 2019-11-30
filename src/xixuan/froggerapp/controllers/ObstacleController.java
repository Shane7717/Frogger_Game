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
	
	public void setObstacleSpeed(double speed) {
		model.setSpeed(speed);
	}
	
	public double getObstacleSpeed() {
		return model.getSpeed();
	}
	
	public void setObstacleSize(int size) {
		model.setSize(size);
	}
	
	public int getObstacleSize() {
		return model.getSize();
	}
	
	public void setImageLink(String imageLink) {
		model.setImageLink(imageLink);
	}
	
	public String getImageLink() {
		return model.getImageLink();
	}
	
	public void setObstacleXpos(int xpos) {
		model.setXpos(xpos);
	}
	
	public int getObstacleXpos() {
		return model.getXpos();
	}

	public void setObstacleYpos(int ypos) {
		model.setYpos(ypos);
	}
	
	public int getObstacleYpos() {
		return model.getYpos();
	}
	
	public void updateView() {
		view.viewObstacle(model);
	}
}
