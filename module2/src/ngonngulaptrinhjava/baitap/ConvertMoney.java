package ngonngulaptrinhjava.baitap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        int rate = 23000 ;
        Scanner scanner =new Scanner(System.in) ;
        System.out.println("Enter USD :");
        int usd = Integer.parseInt(scanner.nextLine()) ;
        double VND = usd * rate ;
        System.out.println("Gia tri quy doi "+VND);
    }
}
