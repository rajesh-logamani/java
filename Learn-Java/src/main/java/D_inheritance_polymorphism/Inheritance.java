package D_inheritance_polymorphism;

class P {
    protected int d1 = 10;
    protected int d = 100; // Note: 'd' is overridden in class C. If the reference type is P, it will access P's d, not C's d.

    protected void fun1(){
        System.out.println("P's fun1");
    }

    protected void fun(){
        System.out.println("P's fun");
    }

    // overloading fun() with string name parameter
    //compile time polymorphism
    protected void fun(String name){
        System.out.println(name + " from fun parameterised function");
    }

    static protected void sfun(){ // Static methods are not overridden, they are hidden. The method called depends on the reference type, not the object type.
        System.out.println("P's sfun");
    }
}

class C extends P{
    protected int d2 = 20;
    protected int d = 200;

    protected void fun2(){
        System.out.println("C's fun2");
    }

    // Overriding fun from parent class
    // Runtime polymorphism
    @Override
    protected void fun(){
        System.out.println("C's fun");
    }

    static protected void sfun(){
        System.out.println("C's sfun");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        P obj = new C();
        System.out.println(obj.d1);
        System.out.println(obj.d);
        obj.fun1();
        obj.fun();
        obj.sfun();
    }
}