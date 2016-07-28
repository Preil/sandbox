package com.preil.sandbox.CollectionLearning.Deques;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Ilya 21.07.2016.
 */
public class Calculator {

    public int evaluate(String input) {
        final Deque<String> stack = new ArrayDeque<>();
        final String[] tokens = input.split(" "); // Here we convert input string data into array of elements splitted by " "
        for (String token : tokens) { // putting all tokens to stack
            stack.add(token);
        }
        while (stack.size() > 1) { // taking first 3 elements
            final int left = Integer.parseInt(stack.pop());
            final String operator = stack.pop();
            final int right = Integer.parseInt(stack.pop());

            int result = 0;
            switch (operator) { // determining the operator
                case "+":
                    result = left + right;
                    break;
                case "-":
                    result = left-right;
                    break;
            }

            stack.push(String.valueOf(result)); // returning the result to stack

        }


        return Integer.parseInt(stack.pop()); // returning the end result of the calculations
    }
}
