package github.some.basic.my.jihekuanjia;

public class PracticeSeason {
    public static void main(String[] args) {
        Season season = Season.AUTM;
        // 1遍历enum;
        for (Season s : Season.values()) {
            System.out.println(s);
        }
        switch (season) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTM:
                System.out.println("秋天");
                break;
            case WIDTER:
                System.out.println("冬天");
                break;
        }
    }

}
