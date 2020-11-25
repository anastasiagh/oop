package com.oop.lab4;

import java.util.Stack;

public class ExpressionValidator {

    public static String checkExpression(String expression) {
        if (expression.isEmpty())
            return "Empty";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++)
        {
            char tmp = expression.charAt(i);
            if (tmp == '{' || tmp == '(' || tmp == '[')
            {
                stack.push(tmp);
            }
            else if (tmp == '}' || tmp == ')' || tmp == ']')
            {
                if (stack.isEmpty())
                    return "Not Correct";

                char lastChar = stack.peek();

                if (tmp == '}' && lastChar == '{' || tmp == ')' && lastChar == '(' || tmp == ']' && lastChar == '[')
                    stack.pop();
                else return "Not Correct";
            }
        }
        if(stack.isEmpty()) return "Correct";
        else return "Not Correct";
    }
}
