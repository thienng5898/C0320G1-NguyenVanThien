package mangVaPhuongThucTrongJava.thuchanh;

import java.util.Scanner;

public class demSoLuongSinhVien {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter a size");
            size = Integer.parseInt(input.nextLine());
            if (size > 30) {
                System.out.println("Size can not exceed 30");
            }
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter mark for student " + (i + 1) + " :");
            array[i] = Integer.parseInt(input.nextLine());
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int value : array) {
            System.out.print(value + "\t");
            if (value >= 5 && value <= 10) {
                count++;
            }
        }
        System.out.print("\n The number of student passing the Exam is :" + count);
    }
}
