package mangVaPhuongThucTrongJava.baitap;

import java.util.Scanner;

public class UseIllegalTriangleException {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ;
        int a = inputFromKeyboard("Enter length of side a: ", sc);
        int b = inputFromKeyboard("Enter length of side b: ", sc);
        int c = inputFromKeyboard("Enter length of side c: ", sc);
        try {
            checkTriangle(a,b,c);
            System.out.printf("{ a: %d, b: %d, c: %d } is a triangle!", a, b, c);
        }catch(IllegalTriangleException e) {
        System.out.printf("{ a: %d, b: %d, c: %d } is not a triangle!", a, b, c);
    }
}
public static void checkTriangle(int a , int b, int c) throws IllegalTriangleException {
        if (a > 0 && b > 0 && c > 0 && (a > b + c || b > a + c || c > a + b)){
            throw  new IllegalTriangleException() ;
        }
}
    public static Integer inputFromKeyboard(String message, Scanner scanner) {
        System.out.print(message);
        try {
            int number = Integer.parseInt(scanner.nextLine());
            return number;
        } catch (NumberFormatException exception) {
            System.out.println("Integer only!");
            return null;
        }
    }
}