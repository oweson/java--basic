

package top.sea521.arraydemo;


class ArrayCopyDemo {

    /**
     * 数组的拷贝
     *
     * @param args
     */
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 1, copyTo, 0, 5);
        System.out.println(new String(copyTo));

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
