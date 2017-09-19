public class PassByValue_Primitive {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.print("First example illustrates pass by value with primitives.\n" +
                         "a local copy of the instance variable is sent to the calling method.\n" +
                         "The local value is incremented but the change dies when the method is exited.\n" +
                         "The instance variable is unchanged.");
        System.out.print("\n\n\n\n");
        System.out.println("Before increment the value of x = " + x);

        increment(x);
        x = incrementOut(x);

        System.out.println("After increment the value of x = " + x);
        System.out.println("\n\n\nIn order to update the instance variable x we must return\n" +
                "the output of the method to the caller and catch the returned " +
                "value.\nThis is done by changing the method modifiers to include an " +
                "int in the output\nie static int increment(int p){return p+1}; updating the value " +
                "of x before\nthe println statement ie x=increment(x); See the output below\n\n\n");
        System.out.println("Before increment the value of x = " + x);
        //x = incrementOut(x);
        System.out.println("After increment the value of x = " + x);
    }


    static void increment(int p) {
        p = p + 1;
        System.out.println("The local value of p = " + p);
    }

    static int incrementOut(int p) {
        //System.out.println("The local value of p = " + p);
        p=p + 1;
        System.out.println("The local value of p = " + p);
        return p;
    }



}
