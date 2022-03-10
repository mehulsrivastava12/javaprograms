package CollectionsFramework;


import java.util.LinkedHashSet;


public class LinkedHash {


	public static void main(String[] args)
	{


		LinkedHashSet<String> linkedset
			= new LinkedHashSet<String>();


			linkedset.add("A");
		linkedset.add("F");
		linkedset.add("G");
		linkedset.add("D");


		linkedset.add("A");
		linkedset.add("E");


		System.out.println("Size of LinkedHashSet = "
						+ linkedset.size());

		System.out.println("Original LinkedHashSet:"
						+ linkedset);
		
		System.out.println("Removing D from LinkedHashSet: "
						+ linkedset.remove("D"));

		System.out.println(
			"Trying to Remove Z which is not "
			+ "present: " + linkedset.remove("Z"));

		System.out.println("Checking if A is present="
						+ linkedset.contains("A"));


		System.out.println("Updated LinkedHashSet: "
						+ linkedset);
	}
}
