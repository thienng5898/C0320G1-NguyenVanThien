package mangVaPhuongThucTrongJava.baitap;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int size ;
        int[] array  ;
        Scanner sc =new Scanner(System.in) ;
        System.out.print("Nhập vào số phần tử của mảng");
        size =Integer.parseInt(sc.nextLine()) ;
        array = new int[size] ;
        int i = 0 ;
        while (i < array.length) {
            System.out.println("Nhập vào giá trị phần tử thứ " + (i + 1) + " :");
            array[i] = Integer.parseInt(sc.nextLine());
            i++;
        }
        System.out.print("Danh sách các phần tử:");
        for (int j =0;j<array.length;j++) {
            System.out.print(array[j] + "\t");

        }
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là " + min + " ,tại vị trí " + index);
    }
}
