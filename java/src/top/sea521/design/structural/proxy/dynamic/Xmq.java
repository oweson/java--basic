package top.sea521.design.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Xmq {

    /**
     * @param args
     */
    public static void main(String[] args) {
        final Girl p = new Pjl();
        Girl proxy = (Girl) Proxy.newProxyInstance(p.getClass().getClassLoader(),
                p.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args)
                    throws Throwable {
                return method.invoke(p, null);
            }
        });
        proxy.dosomething();
        proxy.pao();


    }

}
