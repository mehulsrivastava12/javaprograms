package Abstraction;

abstract class Fest{
    final void man(){
        System.out.println(" man() called");
    }
}

class Test1 extends Fest{

}

public class FinalMethod {
    public static void main(String[] args) {
        Test1 t=new Test1();
        t.man();
    }
    
}
