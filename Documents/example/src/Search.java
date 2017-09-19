/*
Q42 What will the following program print when run?
Select the one correct answer.(a) 2  (b) 4  (c) 5  (d) 7  (e) 9  (f) 11  (g) None of the above.

No.	Method	Description
1	int lastIndexOf(int ch)	returns last index position for the given char value
2	int lastIndexOf(int ch, int fromIndex)	returns last index position for the given char value and from index
3	int lastIndexOf(String substring)	returns last index position for the given substring
4	int lastIndexOf(String substring, int fromIndex)	returns last index position for the given substring and from index
 */




public class Search {
    public static void main(String[] args) {
        //String s = "Contentment!";
        String s = "Continental!";
        int middle = s.length()/2;
        String nt = s.substring(middle-1, middle+1);
//        System.out.println(s.lastIndexOf(nt, middle));
        System.out.println(s.lastIndexOf("e", middle));
    }
}
