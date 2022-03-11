package Polymorphism;


class Ab{
    void Array(){
        int n=10;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }
}

class Ac extends Ab{
    void Array(){
        int m=5;
        int[] a=new int[m];
        for(int i=0;i<m;i++){
            a[i]=i+2;
        }
        for(int i=0;i<m;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
    }
}

class Ad extends Ab{
    int p=7;
    void Array(){
        int[] c=new int[p];
        for(int i=0;i<p;i++){
            c[i]=i+10;
        }
        for(int i=0;i<p;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println("\n");
    }
}
public class Dispatch {
    public static void main(String[] args) {
        Ab ab=new Ab();
        Ac ac=new Ac();
        Ad ad=new Ad();
        Ab ref;
        ref=ab;
        ref.Array();
        ref=ac;
        ref.Array();
        ref=ad;
        ref.Array();

    }
}
