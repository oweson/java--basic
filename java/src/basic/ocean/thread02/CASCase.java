package basic.ocean.thread02;

public class CASCase {
    public volatile int value;

    public synchronized void add() {
        value++;
    }
}
