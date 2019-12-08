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

/**
 * The previous name of this class is "Animal".
 * This class is used to instantiate frogs.
 * @author XiXUAN WANG
 */
public class Frog extends Actor {
	
	private Image imgW1; 
	private Image imgA1; 
	private Image imgS1; 
	private Image imgD1; 
	
	/** The jumping-style imgage when pressing "W" */
	private Image imgW2;
	
	/** The jumping-style imgage when pressing "A" */
	private Image imgA2;
	
	/** The jumping-style imgage when pressing "S" */
	private Image imgS2;
	
	/** The jumping-style imgage when pressing "D" */
	private Image imgD2;
	
	/** The scores that a player gains */
	private int points = 0;
	
	/** The number of ends that have already contained frogs */
	private int endOccupy = 0;
	
	/** The real time that is increasing after game begins */
	private long now;
	
	/** This will be set to 0 if there's no water death checking for extra level. */
	private int checkSignal = 1;	
	
	/** The right intersection speed with logs */
	public static double logRightIntersectSpeed = 0;
	
	/** The left intersection speed with logs. */
	public static double logLeftIntersectSpeed = 0;
	
	/** The intersection speed with turtles. */
	public static double turtleIntersectSpeed = 0;
	
	/** The left intersection speed with crocodiles. */
	public static double crocodileLeftIntersectSpeed = 0;
	
	/** The disable key that will be set to true when pausing the whole game  */
	private boolean disableKey = false;
	
	/** Number of lives which will be reset for different game levels */
	private int lifeNum = -1;	
	
	/** The frog sound effect when jumping. */
	private MediaPlayer frogSoundEffect;
	
	/** This checks if the button is continuously pressed without releasing. */
	private boolean second = false;
	
	/** This checks whether or not the frog is moving. */
	private boolean noMove = false;
	
	/** The movement of mainly Y axis. */
	private double movement = 13.3333333*2;
	
	/** The movement of X axis. */
	private double movementX = 10.666666*2;
	
	/** The frog image size. */
	private int imgSize = 40;
	
	/** This checks whether or not the frog dies from car crash. */
	private boolean carDeath = false;
	
	/** This checks whether or not the frog dies from water*/
	private boolean waterDeath = false;
	
	/** This checks whether or not the game will stop. */
	boolean stop = false;
	
	/** This checks whether or not the player's score is changed. */
	private boolean changeScore = false;
	
	/** This is used to set different images of animation when the frog dies. */
	private int frogD = 0;
	
	/** The y position which is the frog's previous death position used to count points */
	private double countPosition = 800;
	
	/** This is used for frogs to intersect with ends */
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
		carDeathCheck();		//Check if frog dies from cars
		waterDeathCheck();		//Check if frog dies from water
		enableIntersection();	//Enable frog to intersect with specific objects	
	}
	
	/**
	 *This check the limit conditions for resetting frog's position.
	 */
	public void resetPosition() {
		if (getY()<0 || getY()>734) 
			setFrogPosition();
		if (getX()<0) 
			move(movement*2, 0);
		if (getX()>580) 
			move(-movement*2, 0);
	}
	
	/**
	 * This checks the game stopping conditions.
	 * @return <strong>true</strong> if all the frogs have ented ends or ther's on life for the frog
	 * 	<br>   <strong>false</strong> otherwise
	 */
	public boolean getStop() {
		return (endOccupy==5 || lifeNum==0);
	}
	
	public int getPoints() {
		return this.points;
	}
	
	/**
	 * This checks whether or not the score of player has changed.
	 * @return <strong>true</strong> if the score of player has changed.
	 * <br>    <strong>false</strong> if the score has not changed.
	 */
	public boolean changeScore() {
		if (changeScore) {
			changeScore = false;
			return true;
		}
		return false;
	}
	
	/**
	 * This sets the pressing images when player pressing keys "W", "A", "S" or "D".
	 */
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
	
	/**
	 * This sets the default frog position.
	 */
	public void setFrogPosition() {
		setX(300);
		setY(679.8+movement);
	}
	
	/**
	 * This monitors the keyboard input from players.
	 */
	public void keyboardMonitor() {
		setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event){	
				if (noMove) {}
				else {
					if (second && (!disableKey) ) {
						if (event.getCode() == KeyCode.W) {	 
			                move(0, -movement);		             
			                changeScore = false;
			                setImage(imgW1);
			                second = false;
			            }
			            else if (event.getCode() == KeyCode.A) {	            	
			            	 move(-movementX, 0);		            	
			            	 setImage(imgA1);
			            	 second = false;
			            }
			            else if (event.getCode() == KeyCode.S) {	            	
			            	 move(0, movement);		            	
			            	 setImage(imgS1);
			            	 second = false;
			            }
			            else if (event.getCode() == KeyCode.D) {	            	
			            	 move(movementX, 0);		            	 
			            	 setImage(imgD1);
			            	 second = false;
			            }
					}
					else if (event.getCode() == KeyCode.W && (!disableKey)) {	
						playSoundEffect();	  
		                move(0, -movement);	                
		                setImage(imgW2);
		                second = true;	
		            }
		            else if (event.getCode() == KeyCode.A && (!disableKey)) {
		            	playSoundEffect();	        	            	
		            	move(-movementX, 0);	            	
		            	setImage(imgA2);
		            	second = true;
		            }
		            else if (event.getCode() == KeyCode.S && (!disableKey)) {	
		            	playSoundEffect();	            		           
		            	move(0, movement);	            	
		            	setImage(imgS2);
		            	second = true;
		            }
		            else if (event.getCode() == KeyCode.D && (!disableKey)) {
		            	playSoundEffect();    
		            	move(movementX, 0);	            	
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
						move(0, -movement);	              
		                setImage(imgW1);
		                second = false;		               
		            }
		            else if (event.getCode() == KeyCode.A && (!disableKey)) {	            	 
		            	 move(-movementX, 0);	            	
		            	 setImage(imgA1);
		            	 second = false;
		            }
		            else if (event.getCode() == KeyCode.S && (!disableKey)) {		            	
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
	
	/**
	 * This checks whether or not the frog is dead due to car crash. <br>
	 * If it is, the variable carDeath will be set <strong>true</strong><br>
	 * If it is not, the variable carDeath will be set <strong>false</strong>
	 */
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
	
	/**
	 * This checks whether or not the frog is dead due to water drowning. <br>
	 * If it is, the variable waterDeath will be set <strong>true</strong><br>
	 * If it is not, the variable waterDeath will be set <strong>false</strong>
	 */
	public void waterDeathCheck() {
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
	
	/**
	 * This enables the frog to intersect with all the specified objects.
	 */
	public void enableIntersection() {
		//Intersect with obstacles
		if (getIntersectingObjects(Obstacle.class).size() >= 1) 
			carDeath = true;	
		
		//Intersect with lizards
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
			else 			
				move(crocodileLeftIntersectSpeed, 0);
		} 
		
		//Intersect with wet turtles
		else if (getIntersectingObjects(Turtle.class).size() >= 1 && !noMove) 
			move(turtleIntersectSpeed,0);
		
		//Intersect with wet turtles
		else if (getIntersectingObjects(WetTurtle.class).size() >= 1) {
			if (getIntersectingObjects(WetTurtle.class).get(0).isSunk()) 
				waterDeath = true;
			else 
				move(turtleIntersectSpeed,0);
		}
		
		//Intersect with ends
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
		
		//Intersect with water(will die)
		else if (getY()<413){
			if (checkSignal == 1)
				waterDeath = true;
		}
	}
	
	/**
	 * This sets the signal value of whether or not checking water drowning death.
	 * @param value equals <strong>1</strong> representing checking water death, otherwise equals <strong>0</strong>.
	 */
	public void setSignalValue(int value) {
		this.checkSignal = value;
	}
	
	/**
	 * This sets the disable key signal of whether of not disabling keyboard monitoring.
	 * @param value this will be <strong>true</strong> if keyboard monitoring is disabled for pausing game,
	 * otherwise it will be <strong>false</strong>.
	 */
	public void setDisableKey(boolean value) {
		this.disableKey = value;
	}
	
	public boolean getDisableKey() {
		return this.disableKey;
	}
	
	/**
	 * This sets the number of lives.
	 * @param value an integer number of lives
	 */
	public void setLiftNum(int value) {
		this.lifeNum = value;
	}
	
	public int getLiftNum() {
		return this.lifeNum;
	}
	
	/**
	 * This plays the sound effect when the frog jumps every time.
	 */
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
