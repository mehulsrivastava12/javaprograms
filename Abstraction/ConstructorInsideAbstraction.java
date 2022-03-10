package Abstraction;

abstract class Parent{
    Parent(){
        System.out.println("Parent Constructor called");
    }

    abstract void print();
}

class Child extends Parent{
    Child()
    {
        System.out.println("Child Constructor called");
    }

    void print()
    {
        System.out.println("Child Print() called");
    }
}

public class ConstructorInsideAbstraction {
    public static void main(String[] args) {
        Child c=new Child();
        c.print();
    }
}
