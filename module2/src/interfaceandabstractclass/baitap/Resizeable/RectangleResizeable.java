package interfaceandabstractclass.baitap.Resizeable;

import keThua.thucHanh.geomatric.Rectangle;

import java.util.Random;

public class RectangleResizeable extends Rectangle implements Resizeable {
    public RectangleResizeable(double width, double lenghth) {
        super(width,lenghth) ;
    }


    @Override
    public void resize(double percent) {
        System.out.println("Before resize: " + this);
        System.out.println("Resize with percent = " + percent + "%");
        this.setWidth(this.getWidth() * (1 + percent / 100));
        this.setLength(this.getLength() * (1 + percent / 100));
        System.out.println("After resize: " + this);
    }
}
