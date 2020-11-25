package com.oop.lab4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void readFromFile(String path) throws IOException{
        BufferedReader reader=new BufferedReader(new FileReader(path));
        while (true){
            String str=reader.readLine();
            if(str==null) break;
            System.out.println(str);
            System.out.println(ExpressionValidator.checkExpression(str));
        }
    }
}
