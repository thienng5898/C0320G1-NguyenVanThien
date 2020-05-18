package interfaceandabstractclass.baitap.Resizeable;

import keThua.thucHanh.geomatric.Circle;



public class CircleResizeable extends Circle implements Resizeable {
public CircleResizeable(double radius){
    super(radius);
}

    @Override
    public void resize(double percent) {
        System.out.println("Before resize: " + this);
        System.out.println("Resize with percent = " + percent + "%");
        this.setRadius(this.getRadius() * (1 + percent / 100));
        System.out.println("After resize: " + this);
    }
}

