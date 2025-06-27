package E_abstractions_Interfaces.interfaces;

public class C implements I {
    @Override
    public void fun1() {
        System.out.println("fun1");
    }

    @Override
    public void fun2() {
        System.out.println("fun2");
    }

    @Override
    public void fun() {
        System.out.println("fun");
    }

    public static void main(String[] args) {
        C c = new C();
        c.fun1();
        c.fun2();
        c.fun();
    }
}
