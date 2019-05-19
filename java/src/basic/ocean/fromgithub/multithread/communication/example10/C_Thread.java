package basic.ocean.fromgithub.multithread.communication.example10;

/**
 * Created by Brian on 2016/4/14.
 */
public class C_Thread extends Thread {
    private Consumer c;

    public C_Thread(Consumer c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.popService();
        }
    }
}
