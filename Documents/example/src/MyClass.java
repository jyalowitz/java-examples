/*Q28 What would be the result of compiling and running the following program?
Select the one correct answer.
(a) The program will fail to compile, since the static method main() cannot have a call to the non-static method func().
(b) The program will fail to compile, since the non-static method func() cannot access the static variable ref.
(c) The program will fail to compile, since the argument args passed to the static method main() cannot be passed to the
non-static method func().
(d) The program will compile, but will throw an exception when run.
(e) The program will compile and run successfully.
answer is Q28 (e)
An object reference is needed to access non-static members. Static methods do not have the implicit object reference this,
and must always supply an explicit object reference when referring to non-static members. The static method main() legally
refers to the non-static method func(), using the reference variable ref. Static members are accessible from both static
and non-static methods, using their simple names. No NullPointerException is thrown, as ref refers to an instance of MyClass.

 */





public class MyClass {

    static MyClass ref;

    String[] arguments;


    public static void main(String[] args) {
        ref = new MyClass();
        ref.func(args);
        }

    public void func(String[] args) {
        ref.arguments = args;}



}
