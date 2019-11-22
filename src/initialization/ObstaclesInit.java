package initialization;

import p4_group_8_repo.MyStage;
import p4_group_8_repo.Obstacle;

public class ObstaclesInit extends Init {
	MyStage background; 

	public ObstaclesInit(MyStage background) {
		this.background = background;
	}
	
	public void initialize() {
		background.add(new Obstacle("file:resources/truck1"+"Right.png", 0, 649, 1, 120, 120));
		background.add(new Obstacle("file:resources/truck1"+"Right.png", 300, 649, 1, 120, 120));
		background.add(new Obstacle("file:resources/truck1"+"Right.png", 600, 649, 1, 120, 120));
		background.add(new Obstacle("file:resources/car1Left.png", 100, 597, -1, 50, 50));
		background.add(new Obstacle("file:resources/car1Left.png", 250, 597, -1, 50, 50));
		background.add(new Obstacle("file:resources/car1Left.png", 400, 597, -1, 50, 50));
		background.add(new Obstacle("file:resources/car1Left.png", 550, 597, -1, 50, 50));
		background.add(new Obstacle("file:resources/truck2Right.png", 0, 540, 1, 200, 200));
		background.add(new Obstacle("file:resources/truck2Right.png", 500, 540, 1, 200, 200));
		background.add(new Obstacle("file:resources/car1Left.png", 500, 490, -5, 50, 50));
	}
}
