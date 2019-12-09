package main.java.xixuan.froggerapp.models;

import javafx.scene.image.ImageView;
import main.java.xixuan.froggerapp.settings.World;

import java.util.ArrayList;

/**
 * This abstract class is the parent class of all model classes.
 * @author XIXUAN WANG
 */
public abstract class Actor extends ImageView{

    /**
     * This moves an object to a specific location.
     * @param dx the increment of x position
     * @param dy the increment of y position
     */
    //Move an object to a specific location
	public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
		

    public World getWorld() {
        return (World) getParent();
    }

    /**
     * This gets the intersecting objects in arraylist.
     * @param <A> the generic type
     * @param cls the class
     * @return the intersecting objects in the form of arraylist.
     */
    public <A extends Actor> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls){
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
            }
        }
        return someArray;
    }
    
    /**
     * This gets one of the intersecting objects.
     * @param <A> the generic type
     * @param cls the class
     * @return one of the intersecting objects.
     */
    public <A extends Actor> A getOneIntersectingObject(java.lang.Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
                break;
            }
        }
        return someArray.get(0);
    }
    
    /**
     * This makes it possible for different kinds of objects to act differently.
     * @param now the current time that is increasing when game begins.
     */
    public abstract void act(long now);
}
