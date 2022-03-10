package CollectionsFramework;


import java.util.*;

public class HashSet1 {
	

	public static void main(String args[])
	{

		HashSet<String> hs = new HashSet<String>();

		hs.add("Geeks");
		hs.add("For");
		hs.add("Geeks");
		hs.add("Is");
		hs.add("Very helpful");


		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
