import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class SimpleCalculator_AdvanceJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, tokens);

        while (stack.size() > 1) {
            int first = Integer.valueOf(stack.pop());
            String op = stack.pop();
            int second = Integer.valueOf(stack.pop());

            switch (op) {
                case "+":
                    stack.push(String.valueOf(first + second));
                    break;
                case "-":
                    stack.push(String.valueOf(first - second));
                    break;
            }
        }
        System.out.println(stack.pop());
    }
}


//  Version 2
// package StacksAndQueues;
//
//import java.util.ArrayDeque;
//
//import java.util.Scanner;
//
//public class SimpleCalculator2 {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        ArrayDeque<Integer> numbers = new ArrayDeque<>();
//        String[] tokens = scanner.nextLine().split(" ");
//
//        for (int i = 0; i < tokens.length; i++) {
//            String token = tokens[i];
//            if (Character.isDigit(token.charAt(0))) {
//                numbers.push(Integer.parseInt(token));
//            } else {
//                int rightOperand = Integer.parseInt(tokens[++i]);
//                int leftOperand = numbers.peek();
//                numbers.push(rightOperand);
//
//                int result = token.equals("+")
//                        ? leftOperand + rightOperand
//                        : leftOperand - rightOperand;
//                numbers.push(result);
//            }
//            System.out.println(numbers.peek());
// 
//
//    }
//}