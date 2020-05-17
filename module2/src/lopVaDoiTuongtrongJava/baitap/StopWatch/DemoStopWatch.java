package lopVaDoiTuongtrongJava.baitap.StopWatch;

public class DemoStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        stopWatch.end();

        System.out.println("thời gian thực hiện đếm tù 1 đến 100000 mất " + stopWatch.getElapsedTime() + " milisecond");
    }
}
