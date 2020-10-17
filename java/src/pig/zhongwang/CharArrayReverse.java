package pig.zhongwang;

import sun.print.SunMinMaxPage;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chengwanli
 * @date 2020/10/14 20:55
 */


public class CharArrayReverse {
    public static void main(String[] args) {
        // 1 逆序排列
        Character[] characters = new Character[4];
        characters[0] = 'a';
        characters[1] = 'b';
        characters[2] = 'c';
        characters[3] = 'a';
        Character[] latest = new Character[characters.length];
        for (int length = characters.length; length > 0; length--) {
            latest[characters.length - length] = characters[length - 1];
        }
        characters = latest;
        for (Character character : characters) {
            System.out.println(character);
        }
        // 2 找出频率最多的数字；

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character character : characters) {
            if (map.containsKey(character)) {
                Integer integer = map.get(character);
                map.put(character, ++integer);
            } else {
                map.put(character, 1);
            }

        }
        // 2 找出频率次数最多的那个字符
        System.out.println(map);
        Character c = null;
        int maxTotal = 0;
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            if (map.get(characterIntegerEntry.getKey()) > maxTotal) {
                maxTotal = map.get(characterIntegerEntry.getKey());
                c = characterIntegerEntry.getKey();
            }
        }
        System.out.println(c);

    }
}
