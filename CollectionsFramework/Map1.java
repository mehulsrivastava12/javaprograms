package CollectionsFramework;


import java.util.*;


public class Map1 {

	public static void main(String[] args)
	{

		Map<String, Integer> map = new TreeMap<>();

		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

        

		for (Map.Entry<String, Integer> e : map.entrySet())

			System.out.println(e.getKey() + " "
							+ e.getValue());
	}
}
