


public class Lable {

    public static void main(String[] args) {
        int counter = 0;
        int j = 0;
        l1:
        for (int i = 0; i < 10; i++) {
            l2:

            while  (j++ < 10) {

                if (j > i) break l2;
                if (j == i) {
                    counter++;
                    continue l1;
                }
            }
        }
        System.out.println(counter);
    }
}

