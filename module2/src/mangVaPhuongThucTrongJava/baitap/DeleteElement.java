package mangVaPhuongThucTrongJava.baitap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int[] arr = {5,6,7,2,9} ;
      int[] newarr = null ;
        System.out.println("Enter element want to be delete");
        int elementdel = sc.nextInt() ;
        for (int i =0 ;i<arr.length;i++){
            if (elementdel== arr[i]){
                newarr =new int[arr.length-1] ;
                for (int index= 0;index< i;index++){
                    newarr[index] = arr[index] ;
                }
                for (int j =i ;j<arr.length-1;j++){
                    newarr[j] =arr[j+1] ;
                }
                break;
            }
        }
        for (int i =0 ;i<newarr.length;i++){
            System.out.print(" "+newarr[i]);
        }
    }
}
