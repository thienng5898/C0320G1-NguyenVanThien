package keThua.baitap.pointandmoveablepoint;

public class TestMoavePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint =new MoveablePoint(2.5f,3.5f) ;
        moveablePoint.move() ;
        System.out.println(moveablePoint);
        moveablePoint.move() ;
        System.out.println(moveablePoint);
        moveablePoint.move() ;
        System.out.println(moveablePoint);
    }
}
