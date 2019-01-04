package eclipse.mar.array;

public class Demoyiwei {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = new int[6];
        // 在内存中开辟了一开六个的空间；

        System.out.println(arr.length);
        System.out.println(arr.getClass());
        arr[0] = 100;
        arr[1] = 210;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }


    }

}
