package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 15:09
 */
public class ArrayTest {
    /** 1 java语言的下面几种数组复制方法中，哪个效率最高？
     正确答案: B   你的答案: B
     for 循环逐一复制
     System.arraycopy
     Array.copyOf
     使用clone方法

     解析：复制的效率System.arraycopy>clone>Arrays.copyOf>for循环，
     这个有兴趣自己测试一下就知道了。这里面在System类源码中给出了arraycopy的方法，
     是native方法，也就是本地方法，肯定是最快的。而Arrays.copyOf(注意是Arrays类，不是Array)的实现，在源码中是调用System.copyOf的，多了一个步骤，肯定就不是最快的。前面几个说System.copyOf的不要看，
     System类底层根本没有这个方法，自己看看源码就全知道了。*/
}
