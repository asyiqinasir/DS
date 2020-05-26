/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst1;

import java.util.Scanner;

/**
 *
 * @author AdminSC
 */
public class Sentence {

    // private int length, numberofvowels, numberofwords;
    private String ayat;
    private int lengthofsentence, numberofvowels, numberofwords;

    public Sentence(String ayat) {
        this.ayat = ayat;
    }

    public int getNumberofvowels() {
        int count = 0;
        for(int i = 0; i <= ayat.length() ; i++) {
            char c = ayat.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        
    }
        return count;
    }

    public int getNumberofwords() {
        String[] str = ayat.split(" ");
        return str.length;
    }

    @Override
    public String toString() {
        return "The sentence is:" + ayat + "\nThe length of the sentence : "
                + ayat.length() + "\nThe number of vowels : " + getNumberofwords()
                + "\nThe number of words : " + getNumberofwords();

    }
}
