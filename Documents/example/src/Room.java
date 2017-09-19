/*
The field numOfGuests is static, meaning the field belongs to the class Room and not to any object of the class.
Such a field can be referenced by a reference whose type is the same as the class. The two references r1 and r2
refer to the same static field numOfGuests, which has the value 3. Because of string concatenation, the expression
"Number of guests: " + r1.numOfGuests + r2.numOfGuests evaluates to "Number of guests: 33".
*/

class Room {
    static int numOfGuests;
//}

//public class Hotel {


    public static void main(String[] args) {
        Room r1 = new Room();
        Room r2 = new Room();
        r1.numOfGuests = 2;
        System.out.println(r2.numOfGuests);
        r2.numOfGuests = 3;
        System.out.println("Number of guests: " + r1.numOfGuests + r2.numOfGuests);}
}