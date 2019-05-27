package top.sea521.design.templatemethod;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start---");
        AbstractCourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end---");
        System.out.println("=============================================");


        System.out.println("前端课程start---");
        AbstractCourse feCourse = new WebCourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程end---");


    }
}
