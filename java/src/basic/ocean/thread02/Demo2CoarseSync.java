package basic.ocean.thread02;

public class Demo2CoarseSync {
    public static String copyString100Times(String target){
        int i = 0;
        StringBuffer sb = new StringBuffer();
        while (i<100){
            sb.append(target);
        }
        return sb.toString();
    }
}
