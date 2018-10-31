package eclipse.mar.copy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Xmq {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //final Girl p = new Pjl();
        final Zhaoyuqing p = new Zhaoyuqing();
        //Mp m = new Mp(z);
        Girl proxy = (Girl) Proxy.newProxyInstance(p.getClass().getClassLoader(), p.getClass().getInterfaces(), new InvocationHandler() {

            public Object invoke(Object proxy, Method method, Object[] args)
                    throws Throwable {
                // TODO Auto-generated method stub
                return method.invoke(p, null);
            }
        });
        proxy.dosomething();
        proxy.pao();
        //m.dosomething();
        //m.pao();
        // TODO Auto-generated method stub

    }

}
