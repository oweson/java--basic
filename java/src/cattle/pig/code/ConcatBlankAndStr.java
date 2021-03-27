package cattle.pig.code;

/**
 * @author oweson
 * @date 2021/3/27 22:06
 */


public class ConcatBlankAndStr {
    public static void main(String[] args) {
        String s = "hello,  world !";
        char[] chars = s.toCharArray();
        StringBuffer character = new StringBuffer();
        StringBuffer blank = new StringBuffer();
        for (char c : chars) {
            if (Character.isWhitespace(c)) {
                blank.append(c);
            } else {
                character.append(c);
            }

        }
        System.out.println(character.append(blank));


    }
}
