package CollectionsFramework;


import java.util.*;
class Map2 {
	public static void main(String args[])
	{
		Map<Integer, String> hm1 = new HashMap<>();

		Map<Integer, String> hm2
			= new HashMap<Integer, String>();

		hm1.put(1, "Visual");
		hm1.put(2, "Studio");
		hm1.put(3, "Code");

		hm2.put(new Integer(1), "Visual");
		hm2.put(new Integer(2), "Studio");
		hm2.put(new Integer(3), "Code");

		System.out.println(hm1);
		System.out.println(hm2);
	}
}
