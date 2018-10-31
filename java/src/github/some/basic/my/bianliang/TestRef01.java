package github.some.basic.my.bianliang;

public class TestRef01 {
    private Ref01 ref01;

    public Ref01 getRef01() {
        return ref01;
    }

    public void setRef01(Ref01 ref01) {
        this.ref01 = ref01;
    }

    public static void main(String[] args) {
        TestRef01 testRef01 = new TestRef01();
        testRef01.setRef01(new Ref01());
        testRef01.ref01.run();
        testRef01.ref01.setAge(210);
        int age = testRef01.ref01.getAge();
        System.err.println(age);

        // TODO Auto-generated method stub

    }

}
