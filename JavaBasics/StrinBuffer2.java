package JavaBasics;

class StrinBuffer2 {

	
	public static void main(String[] args)
	{


		StringBuffer s = new StringBuffer("OngrraphTechnologies");


		int p = s.length();

	
		int q = s.capacity();


		System.out.println("Length of string ="
						+ p);
		System.out.println(
			"Capacity of string =" + q);
	}
}
