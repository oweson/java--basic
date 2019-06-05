package top.sea521.algorithm.string;


/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/4 0004 18:19
 */
public class Demo2GenertorString {
    public static void randomStr(int count, int length) {
        String[] strings = new String[count];
        // 存储生成的字符数组
        int i = length;
        //控制字符长度
        StringBuilder sb = null;
        for (int i1 = 0; i1 < count; i1++) {
            sb = new StringBuilder();
            for (int j = 0; j < i; j++) {
                //生成一个97-122之间的int类型整数--为了生成小写字母
                int intValL = (int) (Math.random() * 26 + 97);
                //生成一个65-90之间的int类型整数--为了生成大写字母
                int intValU = (int) (Math.random() * 26 + 65);
                //生成一个30-39之间的int类型整数--为了生成数字
                int intValN = (int) (Math.random() * 10 + 48);

                int intVal = 0;
                int r = (int) (Math.random() * 3);

                if (r == 0) {
                    intVal = intValL;
                } else if (r == 1) {
                    intVal = intValU;
                } else {
                    intVal = intValN;
                }

                sb.append((char) intVal);
            }
            strings[i1] = new String(sb);

        }
        // 遍历数组
        for (int i1 = 0; i1 < strings.length; i1++) {
            System.out.println(strings[i1]);

        }


    }


    public static void main(String[] args) {
        randomStr(9, 15);

    }
}
