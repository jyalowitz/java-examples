import java.util.InputMismatchException;
import java.util.Scanner;


public class ExHandler {

    /*Exception handling example A calculator that will accept any input and either complete a calculation or
identify the incorrect inputs and allow the user to try again without crashing
 */


    public static double answer;

    public static void main(String[] args) {
        String operator = "string";
        //int num1 = 0;
        //int num2 = 0;
        boolean flag = false;/*I was setting a flag to help control flow of while loop after exception
                                but instead of asking user to try again flow just continued */
        //what happens if the answer does not fit within a primitive?

        Scanner input = new Scanner(System.in);


        System.out.print("Enter first number ");

        try {
            int num1 = 0;
            int num2 = 0;
            num1 = input.nextInt();//I am intentionally giving input char hoping it will ask for input again but no
           answer=num1+num1;
        } catch (InputMismatchException i) {

            System.out.println("exception" + i);
            System.out.print(" an error has occurred but its ok we caught it");
            // Don't do anything else in here: we will loop back to the beginning again and get new input! but it doesnt
        }


        System.out.print("\nEnter operator: ");///now end test

        /*



        try {
            num1 = input.nextInt();
        } catch (InputMismatchException i) {
            System.out.println("exception" + i);
            System.out.print(" please try again");
        } finally {
            System.out.print("\nEnter operator: ");

            try {
                operator = input.next();
            } catch (InputMismatchException i) {
                System.out.println("exception" + i);
                System.out.print(" please try again");
            } finally {

                System.out.print("\nEnter second number ");
            }

            try {
                num2 = input.nextInt();
            } catch (InputMismatchException i) {
                System.out.println("exception" + i);
                System.out.print(" please try again");
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
            answer = Math.pow(num1, num2);
        }

        System.out.print("\n\nFirst number: " + num1);
        System.out.print("\nOperator: " + operator);

        System.out.print("\nSecond number: " + num2);


        System.out.print("\nAnswer: " + answer);

*/
    }


}
