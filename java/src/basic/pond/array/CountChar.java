package basic.pond.array;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/29 0029 19:53
 */
public class CountChar {
    /**
     * 开发提示：将数字强制转换，根据ASCII码表转换为字符。可以定义长度26的数组，
     * 每个元素，对应去保存每种字符的出现次数，比如0索引保存a的次数，1索引保存b的次数，以此类推。
     */
    public static void main(String[] args) {
        //  获取长度100的字符数组
        char[] charArray = {'a', 'l', 'f', 'm', 'f', 'o', 'b', 'b', 's', 'n'};
        //  统计字符数组中字母出现次数
        printCount(charArray);
    }

    public static void printCount(char[] charArray) {
        int[] count = new int[26];
        // 对应保存字母出现的次数
        for (int i = 0; i < charArray.length; i++) {
            int c = charArray[i];
            count[c - 97]++;
        }
        // 打印字母和次数
        for (int i = 0, ch = 97; i < count.length; i++, ch++) {
            if (count[i] != 0) {
                System.out.println((char) ch + "--" + count[i]);
            }
        }
    }
}
