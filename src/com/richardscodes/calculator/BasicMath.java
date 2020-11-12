package com.richardscodes.calculator;

import java.util.Scanner;

public class BasicMath extends Calculator {

    private Scanner scanner = new Scanner(System.in);

    public BasicMath() {
        this.setName("Basic Calculator");
        this.setListOption((byte)1);
    }

    @Override
    public void solveEquation() {
        int answer = 0;
        System.out.println("\n\nPlease enter equation:\n");
        String equation = scanner.nextLine();
        String[] parts = equation.split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[2]);
        String operator = parts[1];

        switch(operator) {
            case "+":
                answer = x + y;
                break;

            case "-":
                answer = x - y;
                break;

            case "*":
                answer = x * y;
                break;

            case "/":
                answer = x / y;
                break;

            case "%":
                answer = x % y;
                break;

            default:
                System.out.println("Please enter a valid operator!");
                solveEquation();
                break;
        }

        displayAnswer(answer);
    }
}
