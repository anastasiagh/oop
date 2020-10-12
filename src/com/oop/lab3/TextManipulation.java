package com.oop.lab3;

public class TextManipulation {
    String text;

    public TextManipulation(String text) {
        this.text = text;
    }

    public void NrOfSentences(String text) {
        String delimiters = "[.?!]";
        String[] sentences = text.split(delimiters);
        System.out.println("Number of sentences is: " + sentences.length);
    }

    public void NrOfWords(String text) {
        String[] words = text.split("\\s+");
        System.out.println("Number of words is: " + words.length);
    }

    public void NrOfLetters(String text) {
        int letters = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                letters++;
            }
        }
        System.out.println("Number of letters is: " + letters);
    }

    public void NrOfVowCons(String text) {
        int vowels = 0;
        int consonants = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        System.out.println("Number of vowels is: " + vowels);
        System.out.println("Number of consonants is: " + consonants);
    }

    public void longest(String text) {
        String[] words = text.split("\\s+");
        String lWord = " ";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= lWord.length()) {
                lWord = words[i];
            }
        }
        System.out.println("Longest word is: " + lWord);
    }
}
