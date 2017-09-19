/*Exception handling example A calculator that will accept any input and either complete a calculation or
identify the incorrect inputs and allow the user to try again without crashing
 */

import java.util.*;
import java.lang.*;

public class Calculator {
    public static int answer;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String operator = " ";
        int num1 = 0;
        int num2 = 0;


        try {
            System.out.println("Enter first number ");
            num1 = input.nextInt();

            System.out.println("\nEnter operator: ");
            operator = input.next();
            System.out.println("\nEnter second number ");
            num2 = input.nextInt();

        } catch (ArithmeticException e) {
            System.out.println("you can't do that");

        } catch (InputMismatchException im) {
            System.out.println("you can't do that2");

        }



        if (operator.equals("+")) {
            answer = num1 + num2;
        } else if (operator.equals("-")) {
            answer = num1 - num2;
        } else if (operator.equals("*")) {
            answer = num1 * num2;
        } else if (operator.equals("/")) {
            answer = num1 / num2;
        } else if (operator.equals("%")) {
            answer = num1 % num2;
        } else if (operator.equals("^")) {
            answer = num1 * num1;
        }

        System.out.print("\n\nFirst number: " + num1);
        System.out.print("\nOperator: " + operator);
        System.out.print("\nSecond number: " + num2);
        System.out.print("\nAnswer: " + answer);

    }
}

