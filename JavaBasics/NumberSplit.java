package JavaBasics;
import java.util.Scanner;

public class NumberSplit {
    public static String Number(int n){
        int p=0,q=0;
        if(n%2==0){
            p=n/2;
            q=n/2;
        }
        else{
            p=n/2;
            q=(n/2)+1;
        }
        return (p+" "+q);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(Number(n));
    }
    
}
