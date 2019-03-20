package top.sea521.factory.proxy.dynamic;

public class Mp implements Girl {
    private Girl g;


    public Mp(Girl g) {
        this.g = g;

        // TODO Auto-generated constructor stub
    }
       @Override
    public void dosomething() {
        g.dosomething();
        // TODO Auto-generated method stub

    }
   @Override
    public void pao() {
        g.pao();
        // TODO Auto-generated method stub

    }

}
