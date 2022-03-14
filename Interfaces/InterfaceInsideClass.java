package Interfaces;

class Test{
    interface how{
        void show();
    }
}

class Testing implements Test.how{
    public void show(){
        System.out.println(" 'Interface inside a class' ");
    }
}

public class InterfaceInsideClass {
    public static void main(String[] args) {
        Test.how ob;
        Testing t=new Testing();
        ob=t;
        ob.show();
    }
}
