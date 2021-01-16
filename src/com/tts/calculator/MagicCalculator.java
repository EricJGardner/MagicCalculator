package com.tts.calculator;

public class MagicCalculator extends SimpleCalculator {

    //square root method
    public double squareRoot(double num3){
        return(Math.sqrt(num3));
    }

    //sin method
    public double sin(double num3){
        return(Math.sin(num3));
    }

    //cosine
    public double cosine(double num3){
        return(Math.cos(num3));
    }

    //tangent
    public double tangent(double num3){
        return(Math.tan(num3));
    }

    //factorial
    public double factorial(int num3){
        int fact = 1;
        for(int i = num3; i>0; i++){
            fact *= i;
        }
        return fact;
    }

}
