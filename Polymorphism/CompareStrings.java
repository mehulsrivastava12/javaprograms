package Polymorphism;

import java.util.Scanner;


class compare{
    static int strstr(String X, String Y){
        if (X == null || Y.length() > X.length()) {
            return -1;
        }

        if (Y == null || Y.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= X.length() - Y.length(); i++)
        {
            int j;
            for (j = 0; j < Y.length(); j++) {
                if (Y.charAt(j) != X.charAt(i + j)) {
                    break;
                }
            }

            if (j == Y.length()) {
                return i;
            }
        }

        return -1;
    }

    static String strstr(String X){
        System.out.println("String X:");
        return X;
    }
}
public class CompareStrings {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String X=s.nextLine();
        String Y=s.nextLine();
        int p=compare.strstr(X,Y);
        String c=compare.strstr(X);
        System.out.println(p);
    }

}
