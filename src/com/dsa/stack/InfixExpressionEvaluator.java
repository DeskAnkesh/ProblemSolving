package com.dsa.stack;

import java.util.Stack;

public class InfixExpressionEvaluator {
    public static int evaluateInfix(String expression) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                StringBuilder numBuilder = new StringBuilder();
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    numBuilder.append(expression.charAt(i));
                    i++;
                }
                i--; // Decrement to account for the extra increment in the loop
                operandStack.push(Integer.parseInt(numBuilder.toString()));
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    char operator = operatorStack.pop();
                    int operand2 = operandStack.pop();
                    int operand1 = operandStack.pop();
                    int result = applyOperator(operand1, operand2, operator);
                    operandStack.push(result);
                }
                // Pop the '(' from the operator stack
                operatorStack.pop();
            } else if (isOperator(ch)) {
                while (!operatorStack.isEmpty() && precedence(ch) <= precedence(operatorStack.peek())) {
                    char operator = operatorStack.pop();
                    int operand2 = operandStack.pop();
                    int operand1 = operandStack.pop();
                    int result = applyOperator(operand1, operand2, operator);
                    operandStack.push(result);
                }
                operatorStack.push(ch);
            }
        }

        while (!operatorStack.isEmpty()) {
            char operator = operatorStack.pop();
            int operand2 = operandStack.pop();
            int operand1 = operandStack.pop();
            int result = applyOperator(operand1, operand2, operator);
            operandStack.push(result);
        }

        return operandStack.pop();
    }

    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0; // Default precedence
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int applyOperator(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String infixExpression = "3 + 5 * ( 2 - 6 )";
        int result = evaluateInfix(infixExpression);
        System.out.println("Result of infix expression: " + result);
    }
}
