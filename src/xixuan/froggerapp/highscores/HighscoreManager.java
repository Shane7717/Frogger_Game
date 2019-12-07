package xixuan.froggerapp.highscores;

import java.util.*;
import java.io.*;

public class HighscoreManager {
	private static HighscoreManager	uniqueHSManager; //Singleton

	//An arraylist of the type "score" storing players' scores
	private ArrayList<Score> scores;
	
	private HighscoreManager() {
		//initialising the scores-arraylist
        this.scores = new ArrayList<Score>();
	}
	
	//The name of the file where the highscores will be saved
	private static final String HIGHSCORE_FILE = "resources/highscores/scores.dat"; 
	
    ObjectOutputStream outputStream = null;
    ObjectInputStream inputStream = null;
   
    //Scores getter
    public ArrayList<Score> getScores() {
        loadScoreFile();
        sort();
        return scores;
    }
    
    //Sort the scores
    private void sort() {
        ScoreComparator comparator = ScoreComparator.getInstance();
        Collections.sort(scores, comparator);	
    }
    
    //Add scores to the specified file
    public void addScore(String name, int score) {
        loadScoreFile();
        scores.add(new Score(name, score));
        updateScoreFile();
    }
    
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
    
    public String[] getHighscoreString() {
    	//The function will only have the top 10 players shown 
    	String[] highscores  = new String[2];
    	highscores[0] = "";
    	highscores[1] = "";  	
        int maxShown = 10;

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
    
    //Used for Singleton design pattern
    public static HighscoreManager getInstance() {
    	if (uniqueHSManager == null) {
    		uniqueHSManager = new HighscoreManager();
    	}
    	return uniqueHSManager;
    }
    
}
