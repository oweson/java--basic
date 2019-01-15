package pig.aikefa;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/10 0010 9:46
 */
public class SeaPlane extends AirPlane {
    public SeaPlane(String name) {
        /**这里调用父类的有参数构造函数，
         * 构造初始化的时候集合添加sky--然后添加sea!!!*/
        super(name);
        acceptedEnvironments.add("sea");
    }


}
