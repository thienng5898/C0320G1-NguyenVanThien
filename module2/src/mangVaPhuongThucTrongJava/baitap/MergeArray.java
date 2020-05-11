package mangVaPhuongThucTrongJava.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập size mảng 1");
        int size1 = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[size1];
        System.out.print("Nhập size mảng 2");
        int size2 = Integer.parseInt(sc.nextLine());
        int[] arr2 = new int[size2];
        int[] arr3 = new int[size1 + size2];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập vào giá trị phần tử thứ " + (i + 1) + " mảng 1 :");
            arr1[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập vào giá trị phần tử thứ " + (i + 1) + " mảng 2 :");
            arr2[i] = Integer.parseInt(sc.nextLine());
        }
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr3));
    }
}
