package eclipse.mar.offier;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/18 0018 21:39
 */
public class Demo1ZhiShu {
    /**
     * 定义
     * 质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数。
     * 假如a*b=c（a、b、c都是整数)，那么我们称a和b就是c的因数。
     * 需要注意的是，唯有被除数，除数，商皆为整数，余数为零时，此关系才成立。
     * 反过来说，我们称c为a、b的倍数。在研究因数和倍数时，不考虑0。
     */
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            // 1循环的范围
            for (int k = 2; k <= i; k++) {
                // 2除数
                // 3排除所有在 i=k 之前 能被k整除(余数为0)的数
               if (i % k == 0 && i != k) {
                    break;
                }
                // 4输出所有在 i=k 且 i%k=0的数
                if (i % k == 0 && i == k) {
                    System.out.println(i);
                }
            }
        }
    }
}
