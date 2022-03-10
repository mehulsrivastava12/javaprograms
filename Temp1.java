class Temp1{
    {
        System.out.println("init");
    }
    
    Temp1()
    {
        System.out.println("default");
    }

    {
        System.out.println("Second");
    }

    Temp1(int x)
    {
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        new Temp1();
        new Temp1(10);
    }
}