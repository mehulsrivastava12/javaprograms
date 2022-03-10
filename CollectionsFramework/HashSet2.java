package CollectionsFramework;



import java.util.*;


class HaashSet2 {


	public static void main(String[] args)
	{

		HashSet<String> hs = new HashSet<String>();


		hs.add("Welcome");
		hs.add("For");
		hs.add("Welcome");
		hs.add("A");
		hs.add("B");
		hs.add("Z");


		Iterator<String> i=hs.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();

		// Removing the element B
		hs.remove("B");

		// Printing the updated HashSet elements
		System.out.println("After removing element " + hs);

		// Returns false if the element is not present
		System.out.println("Element AC exists in the Set : "
						+ hs.contains("AC"));
	}
}
