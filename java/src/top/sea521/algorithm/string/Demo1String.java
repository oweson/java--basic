package top.sea521.algorithm.string;

import java.util.HashSet;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/4 0004 18:13
 */
public class Demo1String {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();
        String str = "abc";
        set = RollList(str, 0);
        System.out.println(set);
    }

    public static HashSet<String> RollList(String str, int i) {
        HashSet<String> set = new HashSet<>();
        if (i >= (str.length() - 1)) {
            set.add(str);
            return set;
        }
        char[] charArray = str.toCharArray();
        String now = "";
        //将第i个元素开始,与后面所有元素都换一次,就能得到所有组合
        //例如,abc,i=0,表示,第一个元素从0开始换,得到abc,bac,cba的组合,然后再去算bc,ac,ba的所有组合
        for (int k = i; k < str.length(); k++) {
            char temp = charArray[i];
            charArray[i] = charArray[k];
            charArray[k] = temp;
            //交换完后,处理后续,处理完后,再将两数还原位置,使得每次都是以abc的顺序进行交换
            now = String.valueOf(charArray);
            set.addAll(RollList(now, (i + 1)));
            temp = charArray[i];
            charArray[i] = charArray[k];
            charArray[k] = temp;
        }
        return set;
    }

}
