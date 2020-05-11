package mangVaPhuongThucTrongJava.thuchanh;

import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20) {
                System.out.println("Size cannot exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + " :");
            array[i] = Integer.parseInt(sc.nextLine());
            i++;
        }
        System.out.print("Property list:");
        for (int value : array) {
            System.out.print(value + "\t");

        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
