package interfaceandabstractclass.baitap.Resizeable;

import keThua.thucHanh.geomatric.Square;



public class SquareResizeable extends Square implements Resizeable {
public SquareResizeable (double size){
    super(size);
}


        @Override
        public void resize(double percent) {
            System.out.println("Before resize: " + this);
            System.out.println("Resize with percent = " + percent + "%");
            this.setSize(this.getSize() * (1 + percent / 100));
            System.out.println("After resize: " + this);
    }
}

