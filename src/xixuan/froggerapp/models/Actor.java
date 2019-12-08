package xixuan.froggerapp.models;

import javafx.scene.image.ImageView;
import xixuan.froggerapp.settings.World;

import java.util.ArrayList;

public abstract class Actor extends ImageView{

    //Move an object to a specific location
	public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
		
    public World getWorld() {
        return (World) getParent();
    }

    public <A extends Actor> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls){
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
            }
        }
        return someArray;
    }
    
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
    
    //Different objects that extend Actor act differently
    public abstract void act(long now);
}
