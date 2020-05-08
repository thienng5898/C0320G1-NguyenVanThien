package ngonngulaptrinhjava.thuchanh;

import java.util.Scanner;

public class testUCLN {
    public static void main(String[] args) {
    int a,b ;
    Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter a :");
        a = Integer.parseInt(scanner.nextLine()) ;
        System.out.println("enter b:");
        b = Integer.parseInt(scanner.nextLine()) ;
        a=Math.abs(a) ;
        b =Math.abs(b) ;
        if (a==0 || b==0){
            System.out.println("No grestest common faster");
        }
        while (a!=b){
            if (a>b){
                a = a -b ;
            }else {
                b = b-a ;
            }
        }
        System.out.println("Greatest common factor: " + a);
}
}
