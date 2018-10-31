package eclipse.mar.array;

public class ShuYin {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //查找指定元素出现的的第一次诉因；
        int[] arr = {1, 2, 33, 44, 55, 66, 77, 88, 109};
        int index = getIndex(arr, 200);
        System.out.println(index);
        // TODO Auto-generated method stub

    }

    private static int getIndex(int[] arr, int i) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i) {
                return j;
            }

        }
        // TODO Auto-generated method stub
        return -100;
    }

}
