package com.richardscodes.calculator;

import com.richardscodes.interfaces.CanCalculate;

import java.util.Scanner;


public class Calculator implements CanCalculate {
    private String name;
    private byte listOption;

    public Calculator() {

    }

    @Override
    public void solveEquation() {}

    @Override
    public void displayAnswer(int a){
        System.out.println("\nThe answer is: " + a + "\n");
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public byte getListOption() {
        return listOption;
    }

    public void setListOption(byte listOption) {
        this.listOption = listOption;
    }
}
