package keThua.thucHanh.geomatric;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle=new Circle(3.5) ;
        System.out.println(circle);
        circle=new Circle(2.5,"red",false) ;
        System.out.println(circle);
    }
}
