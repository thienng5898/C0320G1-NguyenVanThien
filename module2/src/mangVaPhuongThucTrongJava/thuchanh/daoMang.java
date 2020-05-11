package mangVaPhuongThucTrongJava.thuchanh;

import java.util.Scanner;

public class daoMang {
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
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int value : array) {
            System.out.print(value + "\t");
        }

            for (int j = 0; j < array.length/2; j++) {
                int temp = array[j];
                array[j] = array[size - 1 - j];
                array[size - 1 - j] = temp;
            }

        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int item : array) {
            System.out.print(item + "\t");
        }
    }
}
