package top.sea521.design.behavioral.strategy.test;

/**
 * @author chengwanli
 * @date 2020/10/16 11:18
 */


public class MainTest {
    public  void compute(Animal animal,int a,int b) throws Exception {
        TmpLover tmpLover = new TmpLover();
        tmpLover.setAnimal(animal);
        tmpLover.cal(a,b);

    }

    public static void main(String[] args) throws Exception {
       MainTest mainTest =  new MainTest();
       mainTest.compute(new Fish(),1,2);
       mainTest.compute(new Bird(),1,2);
    }
}
