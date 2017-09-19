public class Qcb90 {
    private int a=2;
    private int b=2;
    private int [] c={2};
    private int d=2;

    public void f(){
        int a=0;
        b=0;
        int[]c=new int [] {0};
        d=0;
        g(a,b,c,d);
        System.out.println(a+ ""+b+""+c[0]+""+d+""+this.c[0] );
        


    }

    public void g(int a,int b, int[]c, int d){
        a=1;
        b=1;
        c[0]=1;
//        d=1;
//        System.out.println(a+b+d+c[0]);

    }

}
