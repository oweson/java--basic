package eclipse.mar.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentSystem {
    @SuppressWarnings("unchecked")
    static void Res(List names, List studentId, List number) {
        Scanner na = new Scanner(System.in);
        Scanner nu = new Scanner(System.in);
        Scanner st = new Scanner(System.in);

        while (true) {
            System.out.println("学生姓名");
            String name = na.nextLine();
            if (name.equals("quit")) {
                break;
            }
            System.out.println("学生学号");
            String stu = nu.nextLine();
            System.out.println("学生成绩");
            String num = nu.nextLine();
            names.add(name);
            studentId.add(stu);
            number.add(num);
        }
    }

    static void printAll(List names, List studentId, List number) {
        for (int i = 0; i < names.size(); i++) {
            String name = (String) names.get(i);
            String stu = (String) studentId.get(i);
            String num = (String) number.get(i);
            System.out.println(name + "  " + stu + "  " + num);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        List names = new ArrayList();

        List studentId = new ArrayList();

        List number = new ArrayList();
        Res(names, studentId, number);
        printAll(names, studentId, number);

        // TODO Auto-generated method stub

    }

}
