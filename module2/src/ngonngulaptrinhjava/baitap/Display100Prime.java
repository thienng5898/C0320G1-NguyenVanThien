package ngonngulaptrinhjava.baitap;

public class Display100Prime {
    public static void main(String[] args) {


        System.out.println("So Nguyen to nho hon 100 la: ");

        for (int i = 2; i < 100; i++) {
            int k = 2;
            boolean check = true;
            while (k <= Math.sqrt(i)) {
                if (i % k == 0) {
                    check = false;
                    break;
                }
                k++;
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}

