package Abstraction;

abstract class Help{
    static void Demo(){
        System.out.println("This is Demo() inside the help class");
    }
}

public class Static12 extends Help {
    public static void main(String[] args) {
        Help.Demo();
    }
}
