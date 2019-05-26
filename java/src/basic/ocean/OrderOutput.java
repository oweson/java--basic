package basic.ocean;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 9:37
 */
public class OrderOutput implements Runnable {
    private Value value;

    private int index;

    public OrderOutput(Value value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                synchronized (value) {
                    while (index != value.getValue()) {
                        value.wait();
                    }
                    System.out.println(Thread.currentThread().getName());
                    value.setValue((index + 1) % 3);
                    value.notifyAll();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Value value = new Value(0);
        for (int i = 0; i < 3; i++) {
            new Thread(new OrderOutput(value, i), String.valueOf((char)(i + 'A'))).start();
        }
    }
}

class Value {
    private int value;

    public Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
