package chapter03;

public class tt {
    public static void demo1() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //System.out.println(10000);
        demo1();
        //为了方便请设置为自动保存；

        Student[] arr = new Student[5];                    //存储学生对象
        arr[0] = new Student("张三", 23);
        arr[1] = new Student("李四", 24);
        arr[2] = new Student("王五", 25);
        arr[3] = new Student("赵六", 26);
        arr[4] = new Student("马哥", 20);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "erer");

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "a");


        }
    }

}
