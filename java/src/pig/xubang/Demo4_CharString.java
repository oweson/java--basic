package pig.xubang;

/**
 * @author oweson
 * @date 2021/3/29 21:32
 */


public class Demo4_CharString {
    public static void main(String[] args) {
        char[] c = new char['n'];
        String s = new String(c);
        System.out.print("Ericsso"+c+",");
        System.out.print("Ericsso"+s);
        // Ericsso[C@14ae5a5,Ericsso
        //  FullGC 时会产生GC停顿，也叫 stop the world。简称 STW ,是指在执行垃圾收集算法时，用户线程都被挂起;
        // 老年代内存空间不足时，会触发 FullGC.
        //永久代/metaspace 内存空间不足时，也会触发FullGC.
        //显示调用 GC,System.gc().(会建议jvm GC，但是不一定会GC).

    }
}
