package sort.many;

import java.util.*;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/16 0016 11:34
 */
public class BubbleSort {
    public static void sort() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入");
        String[] split = scanner.nextLine().split(",");
        int[] a = new int[split.length];
        List<Integer> list = new ArrayList<>();
        for (String s : split) {
            list.add(Integer.parseInt(s));


        }
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);

        }

    }
    public static final void testScanner(){
        System.out.println("开始录入把！");
        Integer[] total=new Integer[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            total[i]=scanner.nextInt();
            System.out.println(Arrays.asList(total));

        }
    }

    public static void main(String[] args) {
        testScanner();
        sort();
        int[] arr = {1, 9, 8, 3, 5, 7};
        System.out.println("排序前");
        for (int i : arr) {
            System.out.println(i);

        }
        /**大的下沉*/
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;


                }

            }

        }
        System.out.println("排序后");
        for (int i : arr) {
            System.out.println(i);

        }

    }
}
