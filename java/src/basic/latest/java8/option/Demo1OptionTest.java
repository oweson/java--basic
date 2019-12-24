package basic.latest.java8.option;

import java.util.HashMap;
import java.util.Optional;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/8/27 23:00
 */
public class Demo1OptionTest {

    public static void main(String[] args) {
        Object message = Optional.ofNullable(null)
                .orElseGet(HashMap::new);
        System.out.println(message);
        String message2 = (String) Optional.ofNullable(null)
                .orElse("默认值");
        System.out.println(message2);


        String message1 = (String) Optional.ofNullable(null)
                .orElseThrow(() -> new RuntimeException("消息不存在!"));


        System.out.println(message1);

    }
}
