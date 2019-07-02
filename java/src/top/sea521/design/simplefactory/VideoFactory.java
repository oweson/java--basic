package top.sea521.design.simplefactory;


/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/26 0026 19:56
 */
public class VideoFactory {
    /**
     * 1 反射实现提高复用性
     */
    public static Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

    /**
     * 2 普通的工厂！
     */
    public static Video generator(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }
}
