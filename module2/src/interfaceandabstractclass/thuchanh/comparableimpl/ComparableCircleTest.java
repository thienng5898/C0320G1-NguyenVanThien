package interfaceandabstractclass.thuchanh.comparableimpl;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles =  new ComparableCircle[4] ;
        comparableCircles[0] = new ComparableCircle(3.6) ;
        comparableCircles[1] = new ComparableCircle() ;
        comparableCircles[2] = new ComparableCircle(2.2,"blue",true) ;
        comparableCircles[3] = new ComparableCircle(4.2,"indigo",false) ;

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : comparableCircles) {
            System.out.println(circle);
        }
        Arrays.sort(comparableCircles);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : comparableCircles) {
            System.out.println(circle);
        }
    }
}
