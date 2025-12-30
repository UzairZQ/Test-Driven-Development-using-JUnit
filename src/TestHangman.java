/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import static org.junit.Assert.*;

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

}