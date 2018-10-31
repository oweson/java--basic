package github.design.factory;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/16 0016 22:23
 */
public class Factory {
    public void testSth() {
        String s = "";
        if (s != null) {

        }
        int a;
        if (s == null) {
            /**ctrl+alt+enter不仅仅不全';',是自动收尾的，会自动的不全大括补全哈哈*/
        }

        System.out.println();
    }

    Sender createNewInstance(String type) {
        if ("computer".equalsIgnoreCase(type)) {
            return new Computer();
        } else if ("mobile".equalsIgnoreCase(type)) {
            return new MobilePhone();
        } else {
            System.out.println("error");
            return null;
        }


    }
}
