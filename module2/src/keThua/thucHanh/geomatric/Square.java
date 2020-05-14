package keThua.thucHanh.geomatric;

public class Square extends Rectangle {
    private double size = 1.0 ;
    public Square(){

    }
    public Square(double size){
        this.size =size ;
    }
    public Square(double size,String color ,boolean filled) {
        super(size,size,color,filled);
    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
        setWidth(size);
        setLength(size);
    }
    @Override
    public void setWidth(double width){
        setSize(width);
    }
    @Override
    public void setLength(double length){
        setSize(length);
    }
    @Override
    public String toString(){
         return "A Square with side="
                + getSize()
                + ", which is a subclass of "
                + super.toString();
    }
}
