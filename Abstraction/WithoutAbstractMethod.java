package Abstraction;

abstract class Man
{
    void Run()
    {
        System.out.println("Run function of Man class is called");
    }
}

class Woman extends Man{

}

public class WithoutAbstractMethod{
    public static void main(String[] args) {
        Woman w=new Woman();
        w.Run();

    }
}