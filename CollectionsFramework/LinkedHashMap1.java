package CollectionsFramework;

import java.util.*;

public class LinkedHashMap1 {

	public static void main(String a[])
	{

		LinkedHashMap<String, String> lhm
			= new LinkedHashMap<String, String>();

		lhm.put("one", "practice.visualstudio.org");
		lhm.put("two", "code.visualcode.org");
		lhm.put("four", "quiz.visualcode.org");
        lhm.put("five","visualcode");

		System.out.println(lhm);
		System.out.println("Getting value for key 'one': "
						+ lhm.get("one"));

		System.out.println("Size of the map: "
						+ lhm.size());

		System.out.println("Is map empty? "
						+ lhm.isEmpty());

		System.out.println("Contains key 'two'? "
						+ lhm.containsKey("two"));

		System.out.println(
			"Contains value 'practice.visual"
			+ "code.org'? "
			+ lhm.containsValue("practice"
								+ ".visualcode.org"));

		System.out.println("delete element 'one': "
						+ lhm.remove("one"));

        lhm.put("five","Visual-Code");

		System.out.println("Mappings of LinkedHashMap : ");

        for(Map.Entry<String,String> f:lhm.entrySet()){
            System.out.println(f.getKey() +" : " +f.getValue());
        }
        
            
	}
}
