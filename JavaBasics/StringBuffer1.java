package JavaBasics;

class StringBuffer1 {

	public static void main(String[] args)
	{


		StringBuffer s = new StringBuffer("Welcome");


		int p = s.length();


		int q = s.capacity();


		System.out.println("Length of string Welcome="
						+ p);
		System.out.println(
			"Capacity of string Welcome=" + q);
	}
}
