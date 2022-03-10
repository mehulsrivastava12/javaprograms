package CollectionsFramework;


import java.util.*;

public class TreeSetDemo {
	
	public static void main(String args[])
	{
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("JAVA");
		ts.add("For");
		ts.add("JAVA");
		ts.add("Is");
		ts.add("Very helpful");

		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

