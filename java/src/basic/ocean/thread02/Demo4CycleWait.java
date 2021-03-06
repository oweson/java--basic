package basic.ocean.thread02;

public class Demo4CycleWait implements Runnable {
    private String value;
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value = "we have data now";
    }

    public static void main(String[] args) throws InterruptedException {
        Demo4CycleWait cw = new Demo4CycleWait();
        Thread t = new Thread(cw);
        t.start();
        while (cw.value == null) {
            Thread.sleep(100);
        }
        t.join();
        System.out.println("value : " + cw.value);
    }
}
