package lopVaDoiTuongtrongJava.baitap.StopWatch;

import java.util.Date;

public class StopWatch {
    private long startTime ;
    private  long endTime ;
    public StopWatch() {
        this.startTime = new Date().getTime();
    }
    public void start() {
    this.startTime = new Date() .getTime() ;
}
public  void end(){
        this.endTime =new Date() .getTime() ;
}
    public long getElapsedTime() {
        if (this.endTime == 0) {
            this.endTime = new Date().getTime();
        }
        return endTime - startTime;
    }
}
