package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Obstacle;
import xixuan.froggerapp.settings.MyStage;

public class ObstacleView {
	MyStage background; 
	
	public ObstacleView(MyStage background) {
		this.background = background;
	}
	
	//Display the obstacle on the screen
	public void viewObstacle(Obstacle model) {
		background.add(model);
	}
}
