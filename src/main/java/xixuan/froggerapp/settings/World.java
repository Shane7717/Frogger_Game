package main.java.xixuan.froggerapp.settings;

import java.util.ArrayList;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import main.java.xixuan.froggerapp.models.Actor;


/**
 * This abstract class defines fundamental attributes/settings of the whole Frogger game. 
 * @author XIXUAN WANG
 */
public abstract class World extends Pane {
    
    private AnimationTimer timer;
    
    /** Instantiates a new world. */
    public World() {   	
    	sceneProperty().addListener(new ChangeListener<Scene>() {

			@Override
			public void changed(ObservableValue<? extends Scene> observable, Scene oldValue, Scene newValue) {
				if (newValue != null) {
					newValue.setOnKeyReleased(new EventHandler<KeyEvent>() {

						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyReleased() != null) 
								getOnKeyReleased().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyReleased() != null) {
									anActor.getOnKeyReleased().handle(event);
								}
							}
						}
						
					});
					
					newValue.setOnKeyPressed(new EventHandler<KeyEvent>() {

						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyPressed() != null) 
								getOnKeyPressed().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyPressed() != null) {
									anActor.getOnKeyPressed().handle(event);
								}
							}
						}						
					});
				}				
			}   		
		});
    }

    /**
     * This creates the timer that is the pulse of this game.
     */
    public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                act(now);
                List<Actor> actors = getObjects(Actor.class);              
                for (Actor anActor: actors) {
                	anActor.act(now);
                }
            }
        };
    }

    /**
     * This starts the timer.
     */
    public void start() {
    	createTimer();
        timer.start();
    }

    /**
     * This stops the timer.
     */
    public void stop() {
        timer.stop();
    }
    
    /**
     * This adds an actor (model) to the game world.
     * @param actor 	the model/instance of a specific class that inherits "Actor"
     */
    public void add(Actor actor) {
        getChildren().add(actor);
    }

    /**
     * This removes an actor(model) out of the game world.
     * @param actor 	the model/instance of a specific class that inherits "Actor"
     */
    public void remove(Actor actor) {
        getChildren().remove(actor);
    }

    @SuppressWarnings("unchecked")
	public <A extends Actor> List<A> getObjects(Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        for (Node n: getChildren()) {
            if (cls.isInstance(n)) {
                someArray.add((A)n);
            }
        }
        return someArray;
    }

    /**
     * This makes it possible for different kinds of objects to act differently.
     * @param now the timestamp of the current frame given in nanoseconds.
     */
    public abstract void act(long now);
}
