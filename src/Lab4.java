import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Vector;

class StopWatch{
    private Date startTime;
    private Date endTime;
    StopWatch(Date setStartTime){
        startTime=setStartTime;
    }
    public void setStartTime(Date newStartTime) {
        startTime = newStartTime;
    }
    public void setEndTime(Date newEndTime){
        endTime=newEndTime;
    }
    public void start(){
        startTime=new Date();
    }
    public void stop(){
        endTime=new Date();
    }
    public long getElapsedTime(){
        return endTime.getTime()-startTime.getTime();
    }
}
public class Lab4 {
    public static void main(String[] args) {
        int[] a=new int[100000];
        for(int i=0;i<100000;i++){
            a[i]= (int) (Math.random() * 10000);
        }

        StopWatch stopWatch=new StopWatch(new Date());
        stopWatch.start();
        for(int i=0;i<100000;i++){
            int min=a[i];
            int pos=i;
            for(int j=i;j<100000;j++){
                if(min>a[j]){
                    min=a[j];
                    pos=j;
                }
            }
            int tmp=a[i];
            a[i]=a[pos];
            a[pos]=tmp;
        }
        stopWatch.stop();
        System.out.println("The sort cost time "+stopWatch.getElapsedTime()+" ms");
//        for(int i:a) System.out.print(i+" ");

    }
}
