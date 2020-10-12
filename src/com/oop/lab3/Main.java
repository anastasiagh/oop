package com.oop.lab3;

public class Main {

    public static void main(String[] args) {

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        TextManipulation texts = new TextManipulation(text);

        //task 1
        texts.NrOfSentences(texts.text);
        texts.NrOfWords(texts.text);

        //task 2
        texts.NrOfLetters(texts.text);
        texts.NrOfVowCons(texts.text);

        //task 3
        texts.longest(texts.text);
    }
}
