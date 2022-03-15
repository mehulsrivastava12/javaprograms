package MethodOverloading;


class Base1{
    public static void display(){
        System.out.println("Static or class method from base");
    }

    public void print(){
        System.out.println("Non-static or instance method from base");
    }
}

class Derived1 extends Base1{
    public static void display(){
        System.out.println("Static or class method from Derived");
    }

    public void print(){
        System.out.println("Non-static or instance method from derived");
    }
}

public class Test {
    public static void main(String[] args) {
        Base1 b1=new Derived1();
        b1.display();
        b1.print();
    }
}
