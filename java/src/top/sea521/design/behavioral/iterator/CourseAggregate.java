package top.sea521.design.behavioral.iterator;

/**
 * Created by geely.
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);
    CourseIterator getCourseIterator();



}
