public class ObjectReferenceMockExam {
    public static void main(String args[]) {
        StringBuilder builder = new StringBuilder("Wonderful");
        changeStr(builder);
        System.out.println(builder.toString());
    }
    public static void changeStr(StringBuilder builder){
        builder.append(" World");
        StringBuilder builder2 = new StringBuilder("Amazing World");
        builder = builder2;
    }
}
