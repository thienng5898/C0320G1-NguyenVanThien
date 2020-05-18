package interfaceandabstractclass.baitap.colorable;

import keThua.thucHanh.geomatric.Circle;
import keThua.thucHanh.geomatric.Rectangle;
import keThua.thucHanh.geomatric.Shape;


public class Maintest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.0);
        shapes[1] = new ColorableSquare(5.0);
        shapes[2] = new Rectangle(3.0, 2.0);

        for (Shape hinh : shapes) {
            if (hinh instanceof ColorableSquare) {
                ColorableSquare colorableSquare = (ColorableSquare) hinh;
                System.out.println("Area square: " + colorableSquare.getArea());
                colorableSquare.howToColor();

            } else if (hinh instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) hinh;

                System.out.println("Area Rectangle: " + rectangle.getArea());

            } else if (hinh instanceof Circle) {
                Circle circle = (Circle) hinh;

                System.out.println("Area Circle: " + circle.getArea());

            }

        }
    }
}



