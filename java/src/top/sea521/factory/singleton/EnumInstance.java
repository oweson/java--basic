package top.sea521.factory.singleton;

import sun.security.jca.GetInstance;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/21 0021 11:47
 */
public enum EnumInstance {

    INSTANCE{
        protected  void printTest(){
            System.out.println("Geely Print Test");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
