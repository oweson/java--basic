package top.sea521.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/9 11:35
 */
public class Demo1AddTwoNumber {
    /**
     * Given nums = [2, 7, 11, 15], target = 9,
     * <p>
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static int[] twoSum02(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] ints = twoSum(arr, 9);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);

        }
        // 打印的是地址！
        System.out.println(ints);
    }
}
