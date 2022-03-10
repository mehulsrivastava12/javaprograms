package JavaBasics;


public class Cmp1 {
	public static void main(String args[])
	{


		String str1 = "Welcome";
		String str2 = new String("initialization");
		String str3 = new String("astha");


		System.out.print(
			"Difference  : ");
		System.out.println(str1.compareTo(str2));


		System.out.print(
			"Difference: ");
		System.out.println(str1.compareTo(str3));
	}
}
