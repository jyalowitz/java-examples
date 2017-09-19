public class PersonDemo {

    public static void main(String[] args ){

        Person person1 = new Person("Josh", 48);
        Person person2 = new Person("Neil", 42);
     //   Person person2; /*initialized but not set yet  currently 'null'*/

        System.out.println("Before swap and from main " +person1);
        System.out.println("Before swap and from main " +person2);
        person2 = person1;
     //System.out.println(" "+person1+ person2);//why is this ok with "" in front ***
        person2.changeDetails("Dylan", 23);

        System.out.println("\nNow both of the person references are the same"+ person1 + person2);
        System.out.println(person1);
        System.out.println(person2);


    }

}
