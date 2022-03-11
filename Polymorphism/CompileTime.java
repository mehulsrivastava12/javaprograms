package Polymorphism;

class Poly{
    static int Multiply(int a,int b){
        return a*b;
    }

    static double Multiply(double a, double b){
        return a*b;
    }
}

public class CompileTime {
    public static void main(String[] args) {
        System.out.println(Poly.Multiply(2, 3));

        System.out.println(Poly.Multiply(5.5, 4.35));
    }
    
}
