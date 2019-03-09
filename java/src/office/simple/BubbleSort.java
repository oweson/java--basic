package office.simple;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/4 0004 16:44
 */
public class BubbleSort {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tem = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tem;
                    /**大的往后放*/

                }

            }

        }
        for (Integer i : a) {
            System.out.print(i + " ,");

        }


    }

    public static void main(String[] args) {
        int[] a = {1, 100, 1000, 210, 8989, 999};
        System.out.println("排序前........." + "数组的长度是" + a.length);
        for (Integer i : a
                ) {
            System.out.print(i + " ");

        }
        System.out.println("排序后.........");
        new BubbleSort().bubbleSort(a);

    }
}
