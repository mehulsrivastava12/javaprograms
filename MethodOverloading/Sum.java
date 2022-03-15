package MethodOverloading;

public class Sum {
    public int sum(int a,int b,int c){
        return (a+b+c);
    }

    public int sum(int a, int b){
        return (a+b);
    }

    public double sum(double a, double b){
        return (a+b);
    }

    public static void main(String[] args) {
        Sum s=new Sum();
        System.out.println(s.sum(5.5, 3.9));
        System.out.println(s.sum(15, 4));
        System.out.println(s.sum(12, 3, 16));
    }
}
