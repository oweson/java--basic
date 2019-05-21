package basic.sea.system;

public class getOsNameTest {

    public static void main(String[] args) {
        String string = System.getProperty("os.name");
        System.out.println(string);
        String an = "/as/bb/cc";
        String replace = an.replace('/', '*');
        System.out.println(an);
        System.out.println(replace);

    }

}
