package mangVaPhuongThucTrongJava.baitap;

import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; //bậc của ma trận
        int sum = 0;
        System.out.println("Nhập vào bậc của ma trận");
        n = Integer.parseInt(sc.nextLine());
        int arr[][] = new int[n][n];
        System.out.println("Nhập phần tử cho mảng");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("array[" + i + "][" + j + "]");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Ma trận arr vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("tổng đường chéo là :" + sum);
    }
}
