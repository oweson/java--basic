package top.sea521.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/10 20:10
 */
public class Demo3SubString {
    public static int lengthOfLongestSubstring(String s) {
        // 求最大的不重复的子串；
        int n = s.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        //System.out.println(s.charAt(0)); 0
        // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                // h e l l o
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            // 1
            map.put(s.charAt(j), j + 1);
            // ans=1 l : 1
            // ans=2 L : 2
            // ans=3 L : 3
            // ans=2 L : 4
        }
        return ans;
    }

    public static void main(String[] args) {
        int hello = lengthOfLongestSubstring("hello");
        System.out.println(hello);

    }
}
