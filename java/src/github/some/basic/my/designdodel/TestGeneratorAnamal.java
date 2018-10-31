package github.some.basic.my.designdodel;

public class TestGeneratorAnamal {

    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal animal = (factory).getAnimal("bird");
        Animal animal2 = factory.getAnimal("ant");
        Animal animal3 = factory.getAnimal("pps");
        animal.run();
        animal2.run();
        //animal3.run();
        // factory.getAnimal("bird");
        // TODO Auto-generated method stub

    }

}
