package basic.sea.reflect;

public class LoadDifference {
    public static void main(String[] args) throws ClassNotFoundException {
        //ClassLoader cl = Robot.class.getClassLoader();
        //Class r = Class.forName("basic.sea.reflect.Robot");
        Class.forName("com.mysql.jdbc.Driver");
    }
}
