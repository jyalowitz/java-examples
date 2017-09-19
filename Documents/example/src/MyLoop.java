/*test question 33
Given the following code, which statement is true?
Select the one correct answer.
(a) The program will fail to compile.
(b) The program will print 3, 3 at runtime.
(c) The program will print 4, 3 at runtime, if the break statement is replaced by the continue statement.
(d) The program will fail to compile if the break statement is replaced by the return statement.
(e) The program will fail to compile if the break statement is replaced by an empty statement.
answer...Q33 (c)
As it stands, the program will compile correctly and will print 3, 2 at runtime. If the break statement
is replaced with a continue statement, the loop will perform all four iterations and will print 4, 3.
If the break statement is replaced with a return statement, the whole method will end when i equals 2,
before anything is printed.
If the break statement is simply removed, leaving the empty statement (;), the loop will complete all four
iterations and will print 4, 4.

another example


public class MyLoop {

   public static void main(String args[]) {
      int [] numbers = {10, 20, 30, 40, 50};

      for(int x : numbers ) {
         if( x == 30 ) {
            continue;
         }
         System.out.print( x );
         System.out.print("\n");
      }
   }
}

*/




public class MyLoop {
    public static void main(String[] args) {
        int k = 0;
        int l = 0;
        for (int i = 0; i <= 3; i++) {
            k++;
            if (i == 2){
                //break;
                //continue;
                //return;
            }
            l++;
        }
        System.out.println(k + ", " + l);
    }
}

