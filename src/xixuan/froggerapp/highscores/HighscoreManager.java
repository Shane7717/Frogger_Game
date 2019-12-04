package xixuan.froggerapp.highscores;

import java.util.*;
import java.io.*;

public class HighscoreManager {

	//An arraylist of the type "score" we will use to work with the scores inside the class
	private ArrayList<Score> scores;
	
	public HighscoreManager() {
		//initialising the scores-arraylist
        this.scores = new ArrayList<Score>();
	}
	
	//The name of the file where the highscores will be saved
	private static final String HIGHSCORE_FILE = "resources/highscores/scores.dat"; 
	
	//Initialising an in and outputStream for working with the file
    ObjectOutputStream outputStream = null;
    ObjectInputStream inputStream = null;
   
    //This is a function that will return an arraylist with the scores in it
    public ArrayList<Score> getScores() {
        loadScoreFile();
        sort();
        return scores;
    }
    
    private void sort() {
        ScoreComparator comparator = new ScoreComparator();
        Collections.sort(scores, comparator);	
        //This allows you to sort the arraylist "scores" with help of "comparator".
    }
    
    public void addScore(String name, int score) {
        loadScoreFile();
        scores.add(new Score(name, score));
        updateScoreFile();
    }
    
    public void loadScoreFile() {
        try {
            inputStream = new ObjectInputStream(new FileInputStream(HIGHSCORE_FILE));
            scores = (ArrayList<Score>) inputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("[load]FNF Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("[load]IO Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("[load]CNF Error: " + e.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("[load]IO Error: " + e.getMessage());
            }
        }
    }
    
    public void updateScoreFile() {
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(HIGHSCORE_FILE));
            outputStream.writeObject(scores);
        } catch (FileNotFoundException e) {
            System.out.println("[Update] FNF Error: " + e.getMessage() + ",the program will try and make a new file");
        } catch (IOException e) {
            System.out.println("[Update] IO Error: " + e.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("[Update] Error: " + e.getMessage());
            }
        }
    }
    
    public String[] getHighscoreString() {
    	//The function will only have the top 10 players 
    	String[] highscores  = new String[2];
    	highscores[0] = "";
    	highscores[1] = "";
    	
        int max = 10;

        ArrayList<Score> scores;
        scores = getScores();

        int i = 0;
        int x = scores.size();
        if (x > max) {
            x = max;
        }
        while (i < x) {
            highscores[0] += (i + 1) + ".\t"+scores.get(i).getName()+"\n"; 
            highscores[1] += scores.get(i).getScore() + "\n";
            i++;
        }
        return highscores;
    }    
}
