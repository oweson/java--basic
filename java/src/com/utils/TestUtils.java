package com.utils;

import com.utils.md5.MD5Utils;
import com.utils.random.CustomUUID;
import com.utils.string.StringUtils;

/**
 * @Author:oweson
 * @Date :2018/6/1 0001 17:08
 * @色厉而胆薄，好谋而寡断
 */
public class TestUtils {
    public static void main(String[] args) {
        String s = MD5Utils.toMD5("hello");
        System.out.println(s);
        System.out.println("-------------------------");
        boolean nullOrEmpty = StringUtils.isNullOrEmpty(" ");
        System.out.println(nullOrEmpty);
        System.out.println("----------------------");
       /* long generate = new CustomUUID).generate(100);
        System.out.println(generate);*/
    }
}
