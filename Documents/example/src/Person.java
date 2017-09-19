public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Within the constructor and before swap " +name + " " + age);


    }

    public String toString() {
        return "name: " + name + " age: " + age;
    }

    public void changeDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
