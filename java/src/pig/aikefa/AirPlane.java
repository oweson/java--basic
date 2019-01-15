package pig.aikefa;


import java.util.HashSet;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/9 0009 19:48
 */
public class AirPlane implements IMovable {
    protected String name;
    protected HashSet<String> acceptedEnvironments = new HashSet<String>();

    public AirPlane(String name) {
        super();
        this.name = name;
        acceptedEnvironments.add("sky");
    }

    @Override
    public void move(String environment) {
        if (acceptedEnvironments.contains(environment)) {
            System.out.println(this.name + "will fly in the" + environment);
        } else {
            System.out.println(this.name + "cannot fly in the" + environment);
        }


    }
}
