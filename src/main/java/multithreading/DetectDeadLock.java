package multithreading;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class DetectDeadLock {

    public static void main(String[] args) {

        ThreadMXBean bean = ManagementFactory.getThreadMXBean();

            long [] ids = bean.findMonitorDeadlockedThreads();


        if(ids !=null){

            ThreadInfo [] threadInfo = bean.getThreadInfo(ids);

            for( ThreadInfo threadInfo1 : threadInfo){

                System.out.println(threadInfo1.getThreadId());    //Prints the ID of deadlocked thread

                System.out.println(threadInfo1.getThreadName());  //Prints the name of deadlocked thread
            }
        }else {

            System.out.printf("No dead lock detected");
        }


    }
}
