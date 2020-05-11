package mangVaPhuongThucTrongJava.baitap;

public class CountChar {
    public static void main(String[] args) {
        String string ="an ninh si tinh" ;
        char kitu = 'n' ;
        int count =0 ;
        for (int i =0;i<string.length();i++){
            if (string.charAt(i)==kitu){
                count++ ;
            }
        }
        System.out.println("số lần xuất hiện kí tự " +kitu+" trong chuỗi " +string+" = "+count );
    }
}
