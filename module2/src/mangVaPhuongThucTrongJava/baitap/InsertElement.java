package mangVaPhuongThucTrongJava.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int x ;
        int index ;
        int[] arr = {0,4,2,3,5,6,7,8,9} ;

        System.out.println("Nhập Giá trị X cần chèn");
        x = Integer.parseInt(sc.nextLine()) ;
        System.out.println("Nhập vào vị trí mảng cần chèn");
        index = Integer.parseInt(sc.nextLine());
//        do {
//            if (index <= 1 || index >= arr.length - 1) {
//                System.out.println("Không chèn được, mời nhập lại");
//            }
//        }while (index <= 1 || index >= arr.length - 1) ;
        int[] newarr =new int[arr.length+1] ;
        for (int i =0 ;i<arr.length;i++){
            newarr[i] =arr[i];
        }

        for (int i=newarr.length-1;i>index;i--){
            newarr[i]=newarr[i-1];
        }
        newarr[index] = x ;
        System.out.println("mang sau khi chen la "+ Arrays.toString(newarr));
    }
}
