package top.sea521.design.behavioral.strategy.test;

/**
 * @author chengwanli
 * @date 2020/10/16 11:16
 */


public class TmpLover {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void cal(int a, int b) throws Exception {
        if (animal == null) {
            throw new Exception("errro");
        }
        animal.eat(a, b);
    }
}
