package basic.ocean.fromgithub.multithread.meet;


/**
 * 打印主线程名字！
 */
public class printMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }
}

/*
output:
main
 */