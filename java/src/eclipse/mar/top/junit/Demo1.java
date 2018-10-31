package eclipse.mar.top.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import static org.junit.Assert.*;


@RunWith(Suite.class)
@SuiteClasses({task1.class})
public class Demo1 {
    //套件测试类
    //必须是空了类
    //必须是public
    //不能有main方法；
    //什么方法都不行、


}
