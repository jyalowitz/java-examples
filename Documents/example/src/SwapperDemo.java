
public class SwapperDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        Swapper s = new Swapper(40, 50);
        System.out.println(x+"  "+y);
        System.out.println("new object created " + x + y);
        Swapper.swap(x,y);//(10,20);


           }
}


