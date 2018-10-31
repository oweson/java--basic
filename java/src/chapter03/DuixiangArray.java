package chapter03;

public class DuixiangArray {

    public static void main(String[] args) {
        //System.out.println(10000);
        Student[] arr = new Student[5];                    //存储学生对象
        arr[0] = new Student("张三", 23);
        arr[1] = new Student("李四", 24);
        arr[2] = new Student("王五", 25);
        arr[3] = new Student("赵六", 26);
        arr[4] = new Student("马哥", 20);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "a");


        }
	        
	      /*  for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }*/

        // TODO Auto-generated method stub

    }

}
