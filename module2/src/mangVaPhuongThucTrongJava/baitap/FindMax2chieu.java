package mangVaPhuongThucTrongJava.baitap;

import java.util.Scanner;

public class FindMax2chieu {
    public static void main(String[] args) {
        // khai báo và cho người dùng nhập số hàng và số cột
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng");
        m = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột");
        n = Integer.parseInt(sc.nextLine());

        // Khai báo mảng hai chiều có m hàng n cột
        int[][] array = new int[m][n];
        // Nhập phần tử cho mảng
        System.out.println("Nhập phần tử cho mảng");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("array[" + i + "][" + j + "]");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        // Tìm phần tử lớn nhất trong mảng
        int max = array[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là :"+ max);
    }
}


