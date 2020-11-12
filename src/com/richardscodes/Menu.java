package com.richardscodes;

import com.richardscodes.calculator.BasicMath;
import com.richardscodes.calculator.Calculator;
import com.richardscodes.calculator.TempConversion;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    //private List<Calculator> calculators;
    private int count; // Tracks how many times user has looped through program

    BasicMath basicMath = new BasicMath();
    TempConversion tempConv = new TempConversion();

    public Menu() {
    }

    public void prompt(){
        if(count < 1) {
            System.out.print("Welcome!");
        }
        System.out.println("Please select an option:\n");
        System.out.println(printCalculatorName(basicMath.getListOption(), basicMath.getName()));
        System.out.println(printCalculatorName(tempConv.getListOption(), tempConv.getName()));
        System.out.println("99: Exit");
        String option = scanner.nextLine().toLowerCase();
        handleSwitch(option);
    }

    private void handleSwitch(String option) {
        switch(option) {
            case "1":
                basicMath.solveEquation();
                count++;
                prompt();
                break;

            case "2":
                tempConv.solveEquation();
                count++;
                prompt();
                break;

            case "99", "exit":
                System.out.println("Have a great day!");
                break;

            default:
                System.out.println("Please enter a valid option!\n");
                count++;
                prompt();
                break;
        }
    }

    public String printCalculatorName(byte id, String name) {
        return (id + ": " + name + "\n");
    }
}
