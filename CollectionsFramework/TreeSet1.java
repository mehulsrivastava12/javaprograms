package CollectionsFramework;

import java.util.*;

class TreeSEt1 {

	public static void main(String[] args)
	{
		Set<String> ts = new TreeSet<>();

		ts.add("Gaur");
		ts.add("F");
		ts.add("Garg");
		ts.add("A");
		ts.add("B");
		ts.add("Z");

	    for ( String a : ts)

			System.out.print(a + ", ");

		System.out.println();
	}
}
