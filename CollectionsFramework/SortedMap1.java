package CollectionsFramework;


import java.util.*;
class SortedMap1 {

	public static void main(String args[])
	{
		SortedMap<Integer,String> tm1 = new TreeMap<Integer,String>();

		SortedMap<Integer, String> tm2
			= new TreeMap<Integer, String>();

		tm1.put(3, "Code");
		tm1.put(2, "Studio");
		tm1.put(1, "Visual");
        tm1.put(4,"Sachin");
        tm1.put(5,"Initialise");

		tm2.put(new Integer(3), "Code");
		tm2.put(new Integer(2), "Studio");
		tm2.put(new Integer(1), "Visual");

		System.out.println(tm1);
		System.out.println(tm2);

        tm1.remove(5);
        System.out.println("Updated sortedMap is : " +tm1);

        tm1.put(4,"Mehul");
        System.out.println("New updated SortedMap is : ");
        for(Map.Entry<Integer,String> g:tm1.entrySet()){
            System.out.println(g.getKey()+" : "+g.getValue());
        }




	}
}
