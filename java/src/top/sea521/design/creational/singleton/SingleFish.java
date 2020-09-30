package top.sea521.design.creational.singleton;

public class SingleFish {
    private SingleFish() {
    }

    public static SingleFish getInstance() {
        return fish.singleFish;
    }

    private static final class fish {
        private static SingleFish singleFish = new SingleFish();

    }

    public static void main(String[] args) {
        System.out.println(SingleFish.getInstance());
        System.out.println(SingleFish.getInstance());
    }
}
