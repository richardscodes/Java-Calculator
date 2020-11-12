package com.richardscodes.calculator;

import java.util.Scanner;

public class TempConversion extends Calculator {

    private Scanner scanner = new Scanner(System.in);

    public TempConversion() {
        this.setName("Celsius to Fahrenheit");
        this.setListOption((byte)2);
    }

    @Override
    public void solveEquation() {
        int answer = 0;
        System.out.println("\n\nEnter temperature in celsius:");
        int temp = scanner.nextInt();

        answer = ((temp / 5) * 9) + 32;

        displayAnswer(answer);
    }
}
