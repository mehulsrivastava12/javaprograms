package Polymorphism;

class Parentt{
    void Onn(){
        System.out.println("Parent class");
    }
}

class Chilld extends Parentt{
    void Onn(){
        System.out.println("Child class");
    }
}

class Child2 extends Parentt{
    void Onn(){
        System.out.println("Second Child Class");
    }
}

public class RunTIme {
    public static void main(String[] args) {
        Parentt a=new Parentt();
        a.Onn();
        a=new Chilld();
        a.Onn();
        a=new Child2();
        a.Onn();
    }
}
