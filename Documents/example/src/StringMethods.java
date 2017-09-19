/*Q43 What will be the result of attempting to compile and run the following program?*/


public class StringMethods {

    public static void main(String[] args) {
//        String str = new String("eeny");
//        str.concat(" meeny");
//        System.out.println(str);
        StringBuilder strBuilder = new StringBuilder(" miny");
        System.out.println(strBuilder);
//        strBuilder.append(" mo");
        strBuilder.append(" mo");
//        System.out.println(str + strBuilder);
//        System.out.println(str.concat(" meeny ") + strBuilder);
        System.out.println(strBuilder);

    }
}
