package Interfaces;

interface In1{
    final int a=10;

    void display();
}

public class Interface implements In1 {

    public void display(){
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        Interface t=new Interface();
        t.display();
        System.out.println(a);
    }
}
