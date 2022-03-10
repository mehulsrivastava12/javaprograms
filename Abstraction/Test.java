package Abstraction;

abstract class Base{
    abstract void fun();
}

class Derived extends Base{
    void fun(){
        System.out.println("Derived fun() called");
    }
}

public class Test {
    public static void main(String[] args) {
        Base b=new Derived();
        b.fun();
    }

}
