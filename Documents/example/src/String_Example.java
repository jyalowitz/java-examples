/*Q39 Which of these expressions are legal?

Select the four correct answers.

*/


public class String_Example {
    public static void main(String [] args) {
        System.out.println("co".concat("ol"));
        System.out.println("co" + "ol");
        System.out.println('c' + 'o' + 'o' + 'l');
        //System.out.println("co" + new String('o' + 'l'));
        System.out.println("co" + new String("co"));


    }



}
