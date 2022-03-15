package MethodOverriding;


class Parent1 {
	private void m1()
	{
		System.out.println("From parent m1()");
	}

	protected void m2()
	{
		System.out.println("From parent m2()");
	}
}

class Child1 extends Parent1 {

	private void m1()
	{
		System.out.println("From child m1()");
	}

	public void m2()
	{
		System.out.println("From child m2()");
	}
}

class Main13 {
	public static void main(String[] args)
	{
		Parent1 obj1 = new Parent1();
		obj1.m2();
		Parent1 obj2 = new Child1();
		obj2.m2();
	}
}

