package Interfaces;

interface Test1{
    interface How{
        void display();
    }
}

class Testing1 implements Test1.How{
    public void display(){
        System.out.println("'Interface inside another Interface'");
    }
}

public class InterfaceInsideInterface {
    public static void main(String[] args) {
        Test1.How ob;
        Testing1 t=new Testing1();
        ob=t;
        ob.display();
    }
}
