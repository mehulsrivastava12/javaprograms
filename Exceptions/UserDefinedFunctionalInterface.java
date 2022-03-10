package Exceptions;
interface Square{
    int calculate(int x);
}

public class UserDefinedFunctionalInterface {
    public static void main(String[] args) {
        int a=6;
        Square s= (int x) -> x*x;
        int ans = s.calculate(a);
        System.out.println(ans);
    }
    
}
