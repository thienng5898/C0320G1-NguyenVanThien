package keThua.thucHanh.geomatric;

public class SquareTest {
    public static void main(String[] args) {
        Square square =new Square() ;
        System.out.println(square);
        square = new Square(2.0) ;
        System.out.println(square);
        square =new Square(2.3,"Green",true) ;
        System.out.println(square);
    }
}
