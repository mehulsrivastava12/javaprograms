package Abstraction;

interface Inter1{
    final int a=10;
    void display1();
}


public class TestClass implements Inter1 {
    public void display1(){
        System.out.println("Mehul");
    }
    public static void main(String[] args) {
        TestClass tc =new TestClass();
        tc.display1();
        System.out.println(a);
    }
}
