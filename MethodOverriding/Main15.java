package MethodOverriding;

class Parent2 {

	static void m1()
	{
		System.out.println("From parent "
						+ "static m1()");
	}

	void m2()
	{
		System.out.println("From parent "
						+ "non-static(instance) m2()");
	}
}

class Child2 extends Parent2 {
	static void m1()
	{
		System.out.println("From child static m1()");
	}

	@Override
	public void m2()
	{
		System.out.println("From child "
						+ "non-static(instance) m2()");
	}
}


class Main15 {
	public static void main(String[] args)
	{
		Parent2 obj1 = new Child2();
		obj1.m1();
		obj1.m2();
	}
}

