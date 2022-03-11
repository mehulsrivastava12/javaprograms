package Polymorphism;

class Number{
    static int Multi(int a,int b){
        return a*b;
    }

    static int Multi(int a, int b, int c){
        return a*b*c;
    }
}

public class DifferentArguments {
    public static void main(String[] args) {
        int d=Number.Multi(5, 10);
        int e=Number.Multi(4, 4, 4);
        System.out.println(d);
        System.out.println(e);
    }
}
