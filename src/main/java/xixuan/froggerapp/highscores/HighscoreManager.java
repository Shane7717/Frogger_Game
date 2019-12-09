package main.java.xixuan.froggerapp.highscores;

import java.util.*;
import java.io.*;

/**
 * This class manages all the relevant functionalities of highscores
 * @author XIXUAN WANG
 */
public class HighscoreManager {
	
	/** The unique highscore manager instance that uses Singleton Pattern. */
	private static HighscoreManager	uniqueHSManager; 

	/** An arraylist of the type "score" storing players' scores. */
	private ArrayList<Score> scores;
	
	/**
	 * Initialise a scores-arraylist
	 */
	private HighscoreManager() {
        this.scores = new ArrayList<Score>();
	}
	
	/** The name of the file where the highscores will be saved. */
	private static final String HIGHSCORE_FILE = "src/main/resources/highscores/scores.dat"; 
	
    /** The output stream. */
    ObjectOutputStream outputStream = null;
    
    /** The input stream. */
    ObjectInputStream inputStream = null;
   
    /**
     * Scores getter
     * @return high scores arraylist
     */
    public ArrayList<Score> getScores() {
        loadScoreFile();
        sort();
        return scores;
    }
    
    /**
     * Sort the scores with the help of a score comparator
     */
    private void sort() {
        ScoreComparator comparator = ScoreComparator.getInstance();
        Collections.sort(scores, comparator);	
    }
    
    /**
     * Adds the score and the corresponding player name into the scores arraylist.<br>
     * And update the highscores disk file.
     * @param name player's name
     * @param score player's score
     */
    public void addScore(String name, int score) {
        loadScoreFile();
        scores.add(new Score(name, score));
        updateScoreFile();
    }
    
    /**
     * Load the highscores file.
     */
    @SuppressWarnings("unchecked")
	public void loadScoreFile() {
        try {
            inputStream = new ObjectInputStream(new FileInputStream(HIGHSCORE_FILE));
            scores = (ArrayList<Score>) inputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    /**
     * Update the highscores disk file.
     */
    public void updateScoreFile() {
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(HIGHSCORE_FILE));
            outputStream.writeObject(scores);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    /**
     * Gets the highscores names and corresponding scores.<br>
     * Also put them into an String array 
     * @return the highscores string array
     */
    public String[] getHighscoreString() {
    	//The function will only have the top 10 players shown
    	int maxShown = 10;
    	
    	String[] highscores  = new String[2];
    	highscores[0] = "";
    	highscores[1] = "";  	
       
        ArrayList<Score> scores;
        scores = getScores();

        int i = 0;
        int x = scores.size();
        if (x > maxShown) {
            x = maxShown;
        }
        while (i < x) {
            highscores[0] += (i + 1) + ".\t"+scores.get(i).getName()+"\n"; 
            highscores[1] += scores.get(i).getScore() + "\n";
            i++;
        }
        return highscores;
    }    
    
    /**
     * This gets the single instance of HighscoreManager.
     * @return single instance of HighscoreManager
     */
    public static HighscoreManager getInstance() {
    	if (uniqueHSManager == null) {
    		uniqueHSManager = new HighscoreManager();
    	}
    	return uniqueHSManager;
    }
    
}
