package ngonngulaptrinhjava.thuchanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double weight,height,bmi ;
        System.out.println("Your weight(kg)");
        weight = scanner.nextDouble() ;
        System.out.println("Yor height(in meter)");
        height = scanner.nextDouble() ;
        bmi =weight/ Math.pow(height,2) ;
        if (bmi < 18){
            System.out.printf("%-20.2f%s",bmi,"UnderWeight");
        }else if(bmi<25.0){
            System.out.printf("%-20.2f%s",bmi,"Normal");
        }else if(bmi < 30){
            System.out.printf("%-20.2f%s", bmi, "OverWeight");
        }else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
