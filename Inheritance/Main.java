package Inheritance;


class one {
	public void print()
	{
		System.out.println("Welcome");
	}
}

class two extends one {
	public void print_to() { 
		System.out.println("to");
	}
}

class three extends two {
	public void print()
	{
		System.out.println("ongraph");
	}
}

// Drived class
public class Main {
	public static void main(String[] args)
	{
		three g = new three();
		g.print();
		g.print_to();
		g.print();
	}
}
