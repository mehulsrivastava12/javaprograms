package MethodOverloading;

public class UserDemo {
    public static void main(String[] args) {
        Demo d=new Demo();
        byte a=35;
        d.show("hiiiii");
        d.show(a);
        d.show(23);
        d.show('A');
        d.show("A");
    }
}
