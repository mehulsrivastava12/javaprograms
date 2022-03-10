package Inheritance;


class four {
	public void print()
	{
		System.out.println("Welcome");
	}
}

class five extends four {
	public void print_to() { System.out.println("to"); }
}

public class Main1 {
	public static void main(String[] args)
	{
		five g = new five();
		g.print();
		g.print_to();
		g.print();
	}
}
