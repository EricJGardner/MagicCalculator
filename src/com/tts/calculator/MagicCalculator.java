package com.tts.calculator;

public class MagicCalculator{

    //square root method
    public static double squareRoot(double num3){
        return(Math.sqrt(num3));
    }

    //sin method
    public static double sin(double num3){
        return(Math.sin(num3));
    }

    //cosine
    public static double cosine(double num3){
        return(Math.cos(num3));
    }

    //tangent method
    public static double tangent(double num3){
        return(Math.tan(num3));
    }

    //factorial method
    public static double factorial(int num3){
        double fact = 1;
        for(int i = num3; i>0; i--){
            fact *= i;
        }
        return fact;
    }

    //log method
    public static double log(double num3){
        return(Math.log(num3));
    }

    //natural log method
    public static double ln(double num3){
        return(Math.log10(num3));
    }

    //cube root method
    public static double cubeRoot(double num3){
        return(Math.cbrt(num3));
    }
}
