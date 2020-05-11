package mangVaPhuongThucTrongJava.thuchanh;

import java.util.Scanner;

public class chuyenDoiNhietDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        double f ;
        double c ;
        int choice ;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter choice");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1 :
                    System.out.println("Enter Fahrenheit");
                    f = Float.parseFloat(sc.nextLine());
                    System.out.println("Fahrenheit to Celsius: "+fToc(f));
                    break;
                case 2:
                    System.out.println("Enter Celsius");
                    c = Float.parseFloat(sc.nextLine());
                    System.out.println("Fahrenheit to Celsius: "+cTof(c));
                    break;
            }
        }while (choice !=0) ;
    }
    public  static  double cTof(double c){
        return (9.0 / 5) * c + 32;
    }
    public  static  double fToc(double f){
        return (5.0 / 9) * (f - 32);
    }
}
