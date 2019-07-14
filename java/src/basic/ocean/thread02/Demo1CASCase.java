package basic.ocean.thread02;

public class Demo1CASCase {
    public volatile int value;

    public synchronized void add() {
        value++;
    }
}
