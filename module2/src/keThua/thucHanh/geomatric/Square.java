package keThua.thucHanh.geomatric;

import interfaceandabstractclass.baitap.colorable.Colorable;

public class Square extends Rectangle implements Colorable {
    double size = 5.0 ;
    public Square(){

    }
    public Square(double size){
       super(size,size);

    }
    public Square(double size,String color ,boolean filled) {
        super(size,size,color,filled);
    }

    public double getSize() {
        return getWidth();
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setLength(double length) {
        setSize(length);
    }
    public void setSize(double size) {
        super.setWidth(size);
        super.setLength(size);
    }



    @Override
    public String toString(){
         return "A Square with side="
                + getSize()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
