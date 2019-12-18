package main.java.xixuan.froggerapp.initializers;

/**
 * This interface makes it possible for all initializer classes to initialize their instances.
 * @author XIXUAN WANT
 */
public interface Initializable {
	
	/**
	 * This initializes models or objects in the game<br><br>
	 * This makes relevant initializer classes be able to initialize their corresponding instances.
	 */
	public void initialize();
}
