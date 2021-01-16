package com.tts;
import com.tts.calculator.MagicCalculator;
import com.tts.calculator.SimpleCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //define variables
        double num1 = 0.0;
        double num2 = 0.0;
        double num3 = 0.0;
        int operation = 0;

        SimpleCalculator simpCalc = new SimpleCalculator();
        MagicCalculator magicCalc = new MagicCalculator();

        Scanner input = new Scanner(System.in);

        //print user operations options
        System.out.println("Please choose from the following operations:");
        System.out.println("""
                1. Add
                2. Subtract
                3. Multiply
                4. Divide
                5. Square
                6. Square Root
                7. Sin
                8. Cosine
                9. Tangent
                10. Factorial
                11. Log
                12. Natural Log
                13. Cube Root
                14. Quit 
                """);
        operation = input.nextInt();
        if(operation >= 1 && operation <= 4){
            System.out.println("Enter the first number for calculation: ");
            num1 = input.nextDouble();
            System.out.println("Enter the second number for calculation: ");
            num2 = input.nextDouble();
        }else if(operation >=5 && operation <= 13){
            System.out.println("Enter the number for calculation: ");
            num3 = input.nextFloat();
        }else if(operation == 14){
            System.out.println("Goodbye");
        }else{
            System.out.println("Please did enter a number between 1 and 14");
        }

        








    }
}
