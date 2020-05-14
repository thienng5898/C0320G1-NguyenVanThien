package keThua.thucHanh.geomatric;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3,3.4 );
        System.out.println(rectangle);
        rectangle =new Rectangle(3.5,5.2,"Orange",true) ;
        System.out.println(rectangle);
    }
}
