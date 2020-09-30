package top.sea521.design.structural.proxy.dynamic;

public class Mp implements Girl {
    private Girl g;


    public Mp(Girl g) {
        this.g = g;


    }

    @Override
    public void dosomething() {
        g.dosomething();


    }

    @Override
    public void pao() {
        g.pao();


    }

}
