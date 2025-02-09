package com.java;

import java.util.Stack;

public class ParenthesisCheck {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else {
                if (!stack.isEmpty()) {
                    char topChar = stack.peek();
                    if ((topChar == '(' && currentChar == ')') ||
                            (topChar == '[' && currentChar == ']') ||
                            (topChar == '{' && currentChar == '}')) {
                        stack.pop();
                    } else {
                        stack.push(currentChar);
                        break;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}