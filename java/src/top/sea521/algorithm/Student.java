package top.sea521.algorithm;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/19 0019 18:48
 */
public class Student {
    public Student() {
    }

    Integer sNo;
    String sName;
    String sSex;
    Integer sJava;
    Integer sAge;

    public void setsNo(Integer sNo) {
        this.sNo = sNo;
    }

    public Integer getsNo() {
        return sNo;

    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public void setsJava(Integer sJava) {
        this.sJava = sJava;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    public String getsSex() {
        return sSex;
    }

    public Integer getsJava() {
        return sJava;
    }

    public Integer getsAge() {
        return sAge;
    }

    public Student(String sName, String sSex, Integer sJava, Integer sAge, Integer sNo) {
        this.sName = sName;
        this.sSex = sSex;
        this.sJava = sJava;
        this.sAge = sAge;
        this.sNo = sNo;
    }

    public static void main(String[] args) {
        Student student2 = new Student();
        student2.setsNo(0);
        student2.setsName("");
        student2.setsSex("");
        student2.setsJava(0);
        student2.setsAge(0);
        Student ppx = new Student();
        ppx.setsNo(0);
        ppx.setsName("");
        ppx.setsSex("");
        ppx.setsJava(0);
        ppx.setsAge(0);


        Student[] st = new Student[5];
        st[0] = new Student("09zc01", "张三", 100, 19, 94);
        st[1] = new Student("09zc02", "李四", 98, 20, 85);
        st[2] = new Student("09zc03", "王五", 89, 18, 96);
        st[3] = new Student("09zc04", "赵六", 21, 17, 90);
        st[4] = new Student("09zc05", "杨七", 90, 21, 88);
        int min = 100;
        int max = 0;
        int sum = 0;
        System.out.println("    学生信息：");
        for (int i = 0; i < st.length; i++) {
            if (st[i].getsJava() < min) {
                min = st[i].getsJava();

            }
            if (st[i].getsJava() > max) {
                max = st[i].getsJava();
                System.out.println("得到sun分数");
                sum += st[i].getsJava();

            }

        }
        System.out.println("min...." + min + "max" + max + "avg...." + sum / 5);

    }
}
