package xixuan.froggerapp.models;

import java.io.File;
import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import xixuan.froggerapp.views.GameView;

public class Frog extends Actor {
	private Image imgW1; 
	private Image imgA1; 
	private Image imgS1; 
	private Image imgD1; 
	private Image imgW2;
	private Image imgA2;
	private Image imgS2;
	private Image imgD2;
	private int points = 0;
	private int endOccupy = 0;
	private long now;
	private int checkSignal = 1;
	public static double logRightIntersectSpeed = 0;
	public static double logLeftIntersectSpeed = 0;
	public static double turtleIntersectSpeed = 0;
	public static double crocodileLeftIntersectSpeed = 0;
	private boolean disableKey = false;
	private int lifeNum = -1;
	MediaPlayer frogSoundEffect;
	
	//Used to check if the button is continuously pressed without releasing
	private boolean second = false;
	private boolean noMove = false;
	private double movement = 13.3333333*2;
	private double movementX = 10.666666*2;
	private int imgSize = 40;
	private boolean carDeath = false;
	private boolean waterDeath = false;
	boolean stop = false;
	private boolean changeScore = false;
	private int frogD = 0;
	//The y position which is the limit position used to start counting points
	private double countPosition = 800;
	ArrayList<End> inter = new ArrayList<End>();
	
	//Constructor
	public Frog(String imageLink) {
		setImage(new Image(imageLink, imgSize, imgSize, true, true));
		setFrogPosition();
		setPressingImages();
	}
	
	@Override
	public void act(long now) {
		this.now = now;
		resetPosition();
		carDeathCheck();
		waterDeathCheck();
		intersectionCheck();	
	}
	
	//Check the conditions for resetting frog's position
	public void resetPosition() {
		if (getY()<0 || getY()>734) 
			setFrogPosition();
		if (getX()<0) 
			move(movement*2, 0);
		if (getX()>600) 
			move(-movement*2, 0);
	}
	
	//Check game stop condition
	public boolean getStop() {
		return (endOccupy==5 || lifeNum==0);
	}
	
	//Return the points of the player
	public int getPoints() {
		return points;
	}
	
	//Check if the score has been changed
	public boolean changeScore() {
		if (changeScore) {
			changeScore = false;
			return true;
		}
		return false;
	}
	
	//Set images when pressing keys W, A, S, or D
	public void setPressingImages() {
		imgW1 = new Image("file:resources/images/frogs/froggerUp.png", imgSize, imgSize, true, true);
		imgA1 = new Image("file:resources/images/frogs/froggerLeft.png", imgSize, imgSize, true, true);
		imgS1 = new Image("file:resources/images/frogs/froggerDown.png", imgSize, imgSize, true, true);
		imgD1 = new Image("file:resources/images/frogs/froggerRight.png", imgSize, imgSize, true, true);
		imgW2 = new Image("file:resources/images/frogs/froggerUpJump.png", imgSize, imgSize, true, true);
		imgA2 = new Image("file:resources/images/frogs/froggerLeftJump.png", imgSize, imgSize, true, true);
		imgS2 = new Image("file:resources/images/frogs/froggerDownJump.png", imgSize, imgSize, true, true);
		imgD2 = new Image("file:resources/images/frogs/froggerRightJump.png", imgSize, imgSize, true, true);
	}
	
	//Set the default position of the frog
	public void setFrogPosition() {
		setX(300);
		setY(679.8+movement);
	}
	
	//Monitor the keyboard input from players
	public void keyboardMonitor() {
		setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event){
				if (noMove) {
					;
				}
				else {
				if (second && (!disableKey) ) {
					if (event.getCode() == KeyCode.W) {	 
		                move(0, -movement);
		                //pressWtimes++;
		                changeScore = false;
		                setImage(imgW1);
		                second = false;
		            }
		            else if (event.getCode() == KeyCode.A) {	            	
		            	 move(-movementX, 0);
		            	 //pressAtimes++;
		            	 setImage(imgA1);
		            	 second = false;
		            }
		            else if (event.getCode() == KeyCode.S) {	            	
		            	 move(0, movement);
		            	 //pressStimes++;
		            	 setImage(imgS1);
		            	 second = false;
		            }
		            else if (event.getCode() == KeyCode.D) {	            	
		            	 move(movementX, 0);
		            	 //pressDtimes++;
		            	 setImage(imgD1);
		            	 second = false;
		            }
				}
				else if (event.getCode() == KeyCode.W && (!disableKey)) {	
					playSoundEffect();	  
	                move(0, -movement);
	                //pressWtimes++;
	                setImage(imgW2);
	                second = true;	
	            }
	            else if (event.getCode() == KeyCode.A && (!disableKey)) {
	            	playSoundEffect();	        	            	
	            	move(-movementX, 0);
	            	//pressAtimes++;
	            	setImage(imgA2);
	            	second = true;
	            }
	            else if (event.getCode() == KeyCode.S && (!disableKey)) {	
	            	playSoundEffect();	            		           
	            	move(0, movement);
	            	//pressStimes++;
	            	setImage(imgS2);
	            	second = true;
	            }
	            else if (event.getCode() == KeyCode.D && (!disableKey)) {
	            	playSoundEffect();    
	            	move(movementX, 0);
	            	//pressDtimes++;
	            	setImage(imgD2);
	            	second = true;
	            }
	        }
			}
		});	
		
		setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {
				if (noMove) {}
				else {
					if (event.getCode() == KeyCode.W && (!disableKey)) {  
						if (getY() < countPosition) {
							countPosition = getY();
							points+=10;
							changeScore = true;
						}
						//if (pressWtimes % 2 == 1)
						move(0, -movement);
		                //pressWtimes = 0;
		                setImage(imgW1);
		                second = false;		               
		            }
		            else if (event.getCode() == KeyCode.A && (!disableKey)) {
		            	 //if (pressAtimes % 2 == 1)	
		            	 move(-movementX, 0);
		            	 //pressAtimes = 0;
		            	 setImage(imgA1);
		            	 second = false;
		            }
		            else if (event.getCode() == KeyCode.S && (!disableKey)) {	
		            	 //if (pressStimes % 2 == 1)
		            	 move(0, movement);
		            	 //pressStimes = 0;
		            	 setImage(imgS1);
		            	 second = false;
		            }
		            else if (event.getCode() == KeyCode.D && (!disableKey)) {	
		            	 //if (pressDtimes % 2 == 1)
		            	 move(movementX, 0);
		            	//pressDtimes = 0;
		            	 setImage(imgD1);
		            	 second = false;
		            }
				}
			}
		});
	}
	
	//Check if the frog is dead due to car crash
	public void carDeathCheck() {
		if (carDeath) {
			noMove = true;
			if ((now)% 11 ==0) 
				frogD++;
			if (frogD >= 1 && frogD <= 3)
				setImage(new Image("file:resources/images/deaths/cardeath"+frogD+".png", imgSize, imgSize, true, true));
			if (frogD == 4) {
				lifeNum--;
				if (lifeNum >= 0)
					((GameView.symbols)[lifeNum]).setXpos(1000);
				setFrogPosition();
				carDeath = false;
				frogD = 0;
				setImage(new Image("file:resources/images/frogs/froggerUp.png", imgSize, imgSize, true, true));
				noMove = false;
				if (points>50) {
					points-=50;
					changeScore = true;
				}
			}
		}
	}
	
	//Check if the frog is dead due to water 
	public void waterDeathCheck() {
		if (checkSignal == 1) {
			if (waterDeath) {
				noMove = true;
				if ((now)% 11 ==0) 
					frogD++;
				if (frogD >= 1 && frogD <= 4) 
					setImage(new Image("file:resources/images/deaths/waterdeath"+frogD+".png", imgSize,imgSize , true, true));
				if (frogD == 5) {
					lifeNum--;
					if (lifeNum >= 0)
						((GameView.symbols)[lifeNum]).setXpos(1000);
					setFrogPosition();
					waterDeath = false;
					frogD = 0;
					setImage(new Image("file:resources/images/frogs/froggerUp.png", imgSize, imgSize, true, true));
					noMove = false;
					if (points>50) {
						points-=50;
						changeScore = true;
					}
				}
			}	
		}
	}
	
	public void intersectionCheck() {
		
		if (getIntersectingObjects(Obstacle.class).size() >= 1) 
			carDeath = true;	
		if (getIntersectingObjects(Lizard.class).size() >= 1) 
			carDeath = true;	
		
		//Intersect with logs
		if (getIntersectingObjects(Log.class).size() >= 1 && !noMove) {
			if(getIntersectingObjects(Log.class).get(0).getLeft())
				move(logLeftIntersectSpeed, 0);
			else
				move(logRightIntersectSpeed, 0);
		}
		
		//Intersect with crocodiles
		else if (getIntersectingObjects(Crocodile.class).size() >= 1 && !noMove) {
			if (getIntersectingObjects(Crocodile.class).get(0).isCrazyDeath()) 
				waterDeath = true;
			else {			
				move(crocodileLeftIntersectSpeed, 0);
			}
		} 
		
		else if (getIntersectingObjects(Turtle.class).size() >= 1 && !noMove) 
			move(turtleIntersectSpeed,0);
		
		//Intersect with wet turtles
		else if (getIntersectingObjects(WetTurtle.class).size() >= 1) {
			if (getIntersectingObjects(WetTurtle.class).get(0).isSunk()) 
				waterDeath = true;
			else 
				move(turtleIntersectSpeed,0);
		}
		else if (getIntersectingObjects(End.class).size() >= 1) {
			inter = (ArrayList<End>) getIntersectingObjects(End.class);
			if (getIntersectingObjects(End.class).get(0).isActivated()) {
			//If the frog has already been in the hole
				move(0, movement*2);
				changeScore = false;
			} else {
				points+=50;
				changeScore = true;
				countPosition=800;
				getIntersectingObjects(End.class).get(0).setEnd();
				endOccupy++;
				setFrogPosition();
			}
		}
		else if (getY()<413){
			waterDeath = true;
			//setX(300);
			//setY(679.8+movement);
		}
	}
	
	public void setSignalValue(int value) {
		this.checkSignal = value;
	}
	
	public void setDisableKey(boolean value) {
		this.disableKey = value;
	}
	
	public boolean getDisableKey() {
		return this.disableKey;
	}
	
	public void setLiftNum(int value) {
		this.lifeNum = value;
	}
	
	public int getLiftNum() {
		return this.lifeNum;
	}
	
	public void playSoundEffect() {
		String musicFile2 = "resources/music/SoundEffect.wav";   
		Media sound = new Media(new File(musicFile2).toURI().toString());
		frogSoundEffect = new MediaPlayer(sound);
		frogSoundEffect.setCycleCount(1);	
		frogSoundEffect.play();
		sound = null;
		frogSoundEffect = null;
	}	
}
