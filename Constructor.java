class Constructor{
    {
        System.out.println("init");
    }
    
    Constructor()
    {
        System.out.println("default");
    }

    {
        System.out.println("Second");
    }

    Constructor(int x)
    {
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        new Constructor();
        new Constructor(10);
    }
}