package Polymorphism;
import java.util.Scanner;

class Number1{
    static int Mul(int a, int b){
        return a*b;
    }

    static int Mul(int c,int d,int e){
        return c*d*e;
    }
}

public class UsingScannerClass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();
        int e=s.nextInt();

        System.out.println("Multiplication of a and b :" +Number1.Mul(a,b));

        System.out.println("Muliplication of c, d and e :" +Number1.Mul(c,d,e));
    }
}
