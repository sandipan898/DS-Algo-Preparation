package CoreJava.collections;

import java.util.Arrays;
import java.util.Stack;

public class StackPrac {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 5, 4, 7, 2, 6, 3, 8, 2, 10};
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));

        // 1. Add Elements in Stack
        // addElement(stack, 2, 9);
        // addElement(stack, 9);

        // 2. Calculate weight of parenthesis
        // getWeight("(()(()))"); 

        // 3. Check if paranthesis sequence is valid
        // checkValidParanthesis("(()(()))()()");

        // 4. Check If it is Possible to Convert Binary String into Unary String
        checkPossibility("1001001");
    }

    public static void addElement(Stack<Integer> stack, int index, int value) {
        stack.add(index, value);
        System.out.println(stack);
    }

    public static void addElement(Stack<Integer> stack, int value) {
        stack.push(value);
        System.out.println(stack);
    }

    // public static int getWeight(String expression, int beg, int end) {
    //     char[] expChr = expression.toCharArray();
    //     if(expChr[end-1] == ')') {
    //         return 2*getWeight(expression, beg, end-1);
    //     } else {

    //     }
    // }

    public static void checkValidParanthesis(String expression) {
        Stack<Character> stack = new Stack<>();
        boolean isValidSeq = true;
        for(char c : expression.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else if(stack.size() > 0) {
                stack.pop();
            } else {
                isValidSeq = false;
            }
        }
        if (stack.size() > 0) isValidSeq = false;
        System.out.println("The Paranthesis sequence is " + (isValidSeq ? "Valid" : "Invalid"));
    }

    public static void checkPossibility(String binary) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : binary.toCharArray()) {
            if(stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        System.out.println("Possibility: " + (stack.isEmpty() ? "Yes" : "No"));
    }
}
