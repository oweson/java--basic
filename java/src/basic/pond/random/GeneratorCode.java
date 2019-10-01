package basic.pond.random;

import java.util.Random;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/25 0025 10:01
 */
public class GeneratorCode {
    public static void main(String[] args) throws InterruptedException {
        String generatorVertifyCode = GeneratorVertifyCode();
        System.out.println(generatorVertifyCode);
        /** 1 随机验证码。
         - 随机生成十组六位字符组成的验证码。
         - 验证码由大小写字母、数字字符组成。
         */
        for (int i = 0; i < 10; i++) {
            String s = verifyCode();
            Thread.sleep(210);
            System.out.println("随机验证码:" + s);

        }
    }

    private static String verifyCode() {
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8',
                '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e',
                'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 6; i++) {
            int index = r.nextInt(arr.length);
            code += arr[index];

        }
        return code;
    }

    private static String GeneratorVertifyCode() {
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8',
                '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e',
                'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String code = "";
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(arr.length);
            code += arr[index];


        }
        return code;

    }
}
