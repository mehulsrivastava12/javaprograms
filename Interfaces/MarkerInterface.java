package Interfaces;

import java.lang.Cloneable;

class Marker implements Cloneable{
    int i;
    String s;
    public Marker(int i, String s){
        this.i=i;
        this.s=s;
    }

    protected Object clone()
    throws CloneNotSupportedException{
        return super.clone();
    }
}

public class MarkerInterface{
    public static void main(String[] args)
    throws CloneNotSupportedException{
        Marker m=new Marker(20, "We welcome you in OnGraph Technologies");
        Marker b=(Marker)m.clone();
        System.out.println(b.i);
        System.out.println(b.s);
    }
    
}
