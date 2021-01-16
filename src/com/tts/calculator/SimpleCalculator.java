package com.tts.calculator;
import java.util.Scanner;


public class SimpleCalculator {
    //instantiate Scanner
//    Scanner read = new Scanner(System.in);

//    //define variables
//    public double num1 = 0.0;
//    public double num2 = 0.0;
//    public int oper = 0;


    //addition method
    public static double add(double num1, double num2){
        return (num1 + num2);
    }

    //subtraction method
    public static double subtract(double num1, double num2) {
        return (num1 - num2);
    }

    //multiplication method
    public static double multiply(double num1, double num2) {
        return (num1 * num2);
    }

    //division method
    public static double divide(double num1, double num2) {
        return (num1 / num2);
    }

    //square method
    public static double square(double num1) {
        return (num1 * num1);
    }

    //method to get user input


}
