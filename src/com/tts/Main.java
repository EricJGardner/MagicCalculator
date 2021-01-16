package com.tts;
import java.util.Scanner;
import static com.tts.calculator.MagicCalculator.*;
import static com.tts.calculator.SimpleCalculator.*;
//imports must be static as well as the methods within the sub-classes, .* covers all static method in class

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //define variables
        double num1 = 0.0;
        double num2 = 0.0;
        double num3 = 0.0;
        int operation = 0;

// no  need to instantiate Classes with static imports and methods
//        SimpleCalculator simpCalc = new SimpleCalculator();
//        MagicCalculator magicCalc = new MagicCalculator();

//        Scanner input = new Scanner(System.in);
        //print user operations options
        do {
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
            if (operation >= 1 && operation <= 4) {
                System.out.println("Enter the first number for calculation: ");
                num1 = input.nextDouble();
                System.out.println("Enter the second number for calculation: ");
                num2 = input.nextDouble();
            } else if (operation >= 5 && operation <= 13) {
                System.out.println("Enter the number for calculation: ");
                num3 = input.nextFloat();
            } else if (operation == 14) {
                System.out.println("Goodbye");
            } else {
                System.out.println("Please did enter a number between 1 and 14");
            }

            switch (operation) {
                case 1:
                    double result = add(num1, num2);
                    System.out.println(result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println(result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println(result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    System.out.println(result);
                    break;
                case 5:
                    result = square(num3);
                    System.out.println(result);
                    break;
                case 6:
                    result = squareRoot(num3);
                    System.out.println(result);
                    break;
                case 7:
                    result = sin(num3);
                    System.out.println(result);
                    break;
                case 8:
                    result = cosine(num3);
                    System.out.println(result);
                    break;
                case 9:
                    result = tangent(num3);
                    System.out.println(result);
                    break;
                case 10:
                    double ans = factorial((int)num3);
                    System.out.println(ans);
                    break;
                case 11:
                    result = log(num3);
                    System.out.println(result);
                    break;
                case 12:
                    result = ln(num3);
                    System.out.println(result);
                    break;
                case 13:
                    result = cubeRoot(num3);
                    System.out.println(result);
                    break;
                case 14:
                    System.out.println("Thanks for pushing my buttons, see ya!");
                    break;
                default:
                    System.out.println("Invalid entry, please try again");
            }
            pressEnter();
        }while (operation != 14);


    }//end main
    private static void pressEnter(){
        System.out.println("Press any key + enter to make another calculation");
        input.next();
    }

}
