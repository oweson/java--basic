package eclipse.mar.staticproxy;

public class Mp implements Girl {
    private Girl g;


    public Mp(Girl g) {
        this.g = g;

        // TODO Auto-generated constructor stub
    }

    public void dosomething() {
        g.dosomething();
        // TODO Auto-generated method stub

    }

    public void pao() {
        g.pao();
        // TODO Auto-generated method stub

    }

}
