package lopVaDoiTuongtrongJava.baitap.Fan;

public class DemoFan {
    public static void main(String[] args) {


        ClassFan fan1 = new ClassFan();
        fan1.setSpeed(fan1.getFast());
        fan1.setOn(true);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        System.out.println("Fan1 :" + fan1.toString());
        ClassFan fan2 = new ClassFan();
        fan2.setSpeed(fan2.getMedium());
        fan2.setOn(false);
        fan2.setColor("blue");
        fan2.setRadius(5.0);
        System.out.println("Fan2 :" + fan2.toString());
    }
}

