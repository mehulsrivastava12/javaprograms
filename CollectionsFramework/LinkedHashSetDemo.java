package CollectionsFramework;

import java.util.*;

public class LinkedHashSetDemo {
	
	public static void main(String args[])
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		lhs.add("VisualCode");
		lhs.add("Is");
		lhs.add("visual");
		lhs.add("Is");
		lhs.add("Very helpful");

		// Traversing elements
		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
