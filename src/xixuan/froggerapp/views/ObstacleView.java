package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Obstacle;
import xixuan.froggerapp.settings.MyStage;

/**
 * This class displays or removes an obstacle in the game.
 * @author XIXUAN WANG
 */
public class ObstacleView {
	MyStage background; 
	
	public ObstacleView(MyStage background) {
		this.background = background;
	}
	
	/**
	 * This adds the obstacle into the game. 
	 * @param model an instance of Obstacle
	 */
	public void viewObstacle(Obstacle model) {
		background.add(model);
	}
	
	/**
	 * This removes the obstacle currently in the game.
	 * @param model an instance of Obstacle
	 */
	public void removeObstacle(Obstacle model) {
		background.remove(model);
	}
}
