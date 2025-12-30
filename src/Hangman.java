
public class Hangman {

    public int countAlphabetinAWord(String word, char alphabet) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == alphabet) {
                count++;
            }
        }
        return count;
      
    }


}
