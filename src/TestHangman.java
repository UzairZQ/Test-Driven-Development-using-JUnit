/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.junit.Test;

/**
 *
 * @author uzair99
 */
 public class TestHangman {

    @Test
    public void test_countAlphabetinAWord() {
        String word = "pizza";
        char alphabet = 'a';

        Hangman hangman = new Hangman();

        int count = hangman.countAlphabetinAWord(word, alphabet);

        assertEquals(1, count);

    }

    
    @Test 
    public void test_lengthOfFetchedWordRandom() {
        Hangman hangman = new Hangman();
        Random random = new Random();
        hangman.loadWords();
        int requestedLength = random.nextInt(6) + 5; // Random length between 5 and 10
        String word = hangman.fetchWord(requestedLength);
        assertTrue(requestedLength == word.length());
    
    }

    @Test 
    public void test_uniquessofFetchedWord() {
        Hangman hangman = new Hangman();
hangman.loadWords();
        Random random = new Random();
        int requestedLength = 0;
        Set<String> usedWordSet = new HashSet<>();
        int round = 0;
        String word;
        while (round < 100) {
            requestedLength = random.nextInt(6) + 5; // Random length between 5 and 10
            word = hangman.fetchWord(requestedLength);
            round++;

            assertTrue(usedWordSet.add(word));
        }
    }


    @Test 
    public void test_fetchClueBeforeAnyGuess() {
        Hangman hangman = new Hangman();
       String clue = hangman.fetchClue("pizza");
       assertEquals("-----", clue);

    }

    @Test
    public void test_FetchClueAfterCorrectGuess(){
        Hangman hangman = new Hangman();
        String clue = hangman.fetchClue("pizza");
        String newClue = hangman.fetchClue("pizza", clue, 'a');
        assertEquals("----a", newClue);

    }

    @Test
    public void test_FetchClueAfterInCorrectGuess(){
        Hangman hangman = new Hangman();
        String clue = hangman.fetchClue("pizza");
        String newClue = hangman.fetchClue("pizza", clue, 'b');
        assertEquals("-----", newClue);
    }

}