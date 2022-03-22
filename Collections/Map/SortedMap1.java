package Collections.Map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap1 {
    public static void main(String[] args) {
        String file="C:\\Users\\DELL\\Desktop\\cities.csv";
        String line;
        int i=128;
        SortedMap<Integer,String> sm=new TreeMap<Integer,String>();
        SortedMap<Integer,String> sm2=new TreeMap<Integer,String>();
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            while((line=br.readLine())!=null){
                String key=(line.split(","))[9];
                sm.put(i,key);  //put the element in the HashMap
                i--;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Comparator comp = sm.comparator();  // Getting used Comparator in the map using comparator() method
 
        // Printing the comparator value
        System.out.println("Comparator value: "+ comp);

        sm.remove(0); // remove element with a key using remove method
        
        sm.put(1,"PH");  // Change Value using put method
        
        for(Map.Entry<Integer,String> e:sm.entrySet()){  //Iterating using for each loop
            System.out.println("Key : " +e.getKey() +" Value : "+e.getValue());
        }

        sm2.putAll(sm); //Copying one hashmap to another hashmap
        
        sm2.clear(); //Clearing the full HashMao using clear clear() method
        
        sm.compute(1 , (key, val) -> val.concat("OH")); //concatenate and remap the values using compute() method
       // hm2.compute(1,(key,val) -> val.concat("OH"));
        System.out.println(sm.containsKey(1)); //checking the hashmap contains the given key or not
        //System.out.println(hm);

        System.out.println(sm.containsValue("PHOH")); //Checkinh the hashmap contains the given value
        
        System.out.println(sm.entrySet()); // Using entrySet() to get the set view
        
        System.out.println("\n"+sm.get(2)); // Getting the value of key 2

        System.out.println(sm2.isEmpty());   //Returns true if this map contains no key-value mappings.

        System.out.println(sm.keySet()); // Using keySet() to get the set view of keys

        System.out.println(sm.size()); //return the size of HashMap

        System.out.println(sm.values()); // Using values() to get the set view of values

        System.out.println(sm.equals(sm2)); //checks the two HashMap are equal or not

        System.out.println(sm.hashCode());  // Getting the hashcode value for the map

        sm.replace(1,"CH");  //Replaces the entry for the specified key only if it is currently mapped to some value.

        sm.remove(128,"OH");  //Removes the entry for the specified key only if it is currently mapped to the specified value.

        sm.replace(127, "PA", "CP");  //Replaces the entry for the specified key only if currently mapped to the specified value.

        System.out.println(sm.firstKey()); //Returns the first (lowest) key currently in this map

        System.out.println(sm.lastKey());  //Returns the last (highest) key currently in this map

        System.out.println("Elements in range from 2 to 5 in the map is : "+ sm.subMap(2, 5));  // Returning the key ranging between 2 and 5
    
        System.out.println("Keys greater than or equal to given key :"+sm.tailMap(125));//Returns a view of the portion of this map whose keys are greater than or equal to fromKey.
    }
}
