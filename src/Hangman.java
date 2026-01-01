
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Hangman {

    Set<String> usedWordsSet = new HashSet<>();
    List<String> wordList = new ArrayList<>();

    

    public int countAlphabetinAWord(String word, char alphabet) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == alphabet) {
                count++;
            }
        }
        return count;
      
    }

    
    public String fetchWord(int requestedLength) {
       for (String result: wordList) {
           if (result.length() != requestedLength) continue;
           else if (usedWordsSet.add(result)) 
               return result;
        
       }
         return null;
    }


public void loadWords() {
    try(BufferedReader br = new BufferedReader(new FileReader("WordSource.txt"))) {
        String word;
        while((word = br.readLine()) != null) {
            wordList.add(word);
        }
    }
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    catch (IOException e) {
        e.printStackTrace();
    }


}


public String fetchClue(String word) {
    StringBuilder clueBuilder = new StringBuilder();
    for (int i = 0; i < word.length(); i++) {
        clueBuilder.append("-");
    }
    return clueBuilder.toString();
   
}

public String fetchClue(String word, String clue, char guess) {

        if(guess >= 'A' && guess <= 'Z') 
            guess += 32; // Convert to lowercase

        if(guess < 'a' || guess > 'z') 
            throw new IllegalArgumentException("Invalid guess: must be a letter");        
    StringBuilder newClueBuilder = new StringBuilder();
    for (int i = 0; i < word.length(); i++) {

        if(guess == word.charAt(i) && guess != clue.charAt(i)) {
            newClueBuilder.append(guess);
        } 
        else
        newClueBuilder.append("-");
    }
    return newClueBuilder.toString();
   
}


public int addWords(int x, int y) {

    x=5;
    y=10;
   
    return x + y;  
 }
}