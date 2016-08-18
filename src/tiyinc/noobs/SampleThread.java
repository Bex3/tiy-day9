package tiyinc.noobs;

public class SampleThread implements Runnable {

    public void run() {
        System.out.println("Running " + Thread.currentThread().getId());

        try {
            Thread.sleep(2000);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        System.out.println("Done running " + Thread.currentThread().getId());
    }
}
