package tiyinc.noobs;

import java.text.DecimalFormat;
import java.time.Instant;

public class ThreadRunner {
    public static void main(String[] args) {
        System.out.println("ThreadRunner running");

        int numThreadsStarted = 0;
        DecimalFormat timerFormatter = new DecimalFormat("###,###");

        long startMillis = Instant.now().toEpochMilli();

        while (true) {
            System.out.println("Number of threads started = " + numThreadsStarted);
            SampleThread sampleCode = new SampleThread(); //not a new thread that you can run on
            Thread anotherActualThread = new Thread(sampleCode); //this class can take on a runnable interface, can run on this
            anotherActualThread.start(); //allows for asynchronous thread running
            //sampleCode.run();
            numThreadsStarted++;
            if (numThreadsStarted > 10) {
                break;
            }
        }

        long endMillis = Instant.now().toEpochMilli();

        System.out.println("Ran in " + timerFormatter.format(endMillis - startMillis) + " ms");

        System.out.println("ThreadRunner done!");
    }
}

