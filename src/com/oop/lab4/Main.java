package com.oop.lab4;

import static com.oop.lab4.Reader.readFromFile;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("One expression: ");
        readFromFile("one_expression.txt");
        System.out.println("Three expressions: ");
        readFromFile("three_expressions.txt");
        }
    }

