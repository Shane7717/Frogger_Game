package xixuan.froggerapp.views;

import xixuan.froggerapp.models.Obstacle;
import xixuan.froggerapp.settings.MyStage;

public class ObstacleView {
	MyStage background; 
	String path = "file:resources/images/obstacles/";

	public ObstacleView(MyStage background) {
		this.background = background;
	}
	
	public void viewObstacles() {
		background.add(new Obstacle(path + "truck1"+"Right.png", 0, 649, 1, 120, 120));
		background.add(new Obstacle(path + "truck1"+"Right.png", 300, 649, 1, 120, 120));
		background.add(new Obstacle(path + "truck1"+"Right.png", 600, 649, 1, 120, 120));
		background.add(new Obstacle(path + "car1Left.png", 100, 597, -1, 50, 50));
		background.add(new Obstacle(path + "car1Left.png", 250, 597, -1, 50, 50));
		background.add(new Obstacle(path + "car1Left.png", 400, 597, -1, 50, 50));
		background.add(new Obstacle(path + "car1Left.png", 550, 597, -1, 50, 50));
		background.add(new Obstacle(path + "truck2Right.png", 0, 540, 1, 200, 200));
		background.add(new Obstacle(path + "truck2Right.png", 500, 540, 1, 200, 200));
		background.add(new Obstacle(path + "car1Left.png", 500, 490, -5, 50, 50));
	}
}
