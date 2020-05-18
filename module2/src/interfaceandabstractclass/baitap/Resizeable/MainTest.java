package interfaceandabstractclass.baitap.Resizeable;


import java.util.Random;

public class MainTest {
    public static void main(String[] args) {
        Random random = new Random();
        CircleResizeable circleResizeable = new CircleResizeable(5.0);
        circleResizeable.resize(getRandomFrom1To99(random));
        RectangleResizeable rectangleResizeable = new RectangleResizeable(4.0, 3.0);
        rectangleResizeable.resize(getRandomFrom1To99(random));
        SquareResizeable squareResizeable = new SquareResizeable(10.0);
        squareResizeable.resize(getRandomFrom1To99(random));

    }

    public static int getRandomFrom1To99(Random random) {
        return random.nextInt(99) + 1;
    }
}