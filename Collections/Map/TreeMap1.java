package Collections.Map;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        String file="C:\\Users\\DELL\\Desktop\\cities.csv";
        String line;
        int i=0;
        TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
        TreeMap<Integer,String> hm2=new TreeMap<Integer,String>();
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            while((line=br.readLine())!=null){
                String key=(line.split(","))[9];
                hm.put(i,key);  //put the element in the HashMap
                i++;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        hm.remove(0); // remove element with a key using remove method
        hm.put(1,"PH");  // Change Value using put method
        for(Map.Entry<Integer,String> e:hm.entrySet()){  //Iterating using for each loop
            System.out.println("Key : " +e.getKey() +" Value : "+e.getValue());
        }
        hm.clone();  // Print and display the cloned HashMap using clone() method

        hm2.putAll(hm); //Copying one hashmap to another hashmap
        
        hm2.clear(); //Clearing the full HashMao using clear clear() method
        
        hm.compute(1 , (key, val) -> val.concat("OH")); //concatenate and remap the values using compute() method
       // hm2.compute(1,(key,val) -> val.concat("OH"));
        System.out.println(hm.containsKey(1)); //checking the hashmap contains the given key or not
        //System.out.println(hm);

        System.out.println(hm.containsValue("PHOH")); //Checkinh the hashmap contains the given value
        
        System.out.println(hm.entrySet()); // Using entrySet() to get the set view
        
        System.out.println("\n"+hm.get(2)); // Getting the value of key 2

        System.out.println(hm2.isEmpty());   //Returns true if this map contains no key-value mappings.

        System.out.println(hm.keySet()); // Using keySet() to get the set view of keys

        System.out.println(hm.size()); //return the size of HashMap

        System.out.println(hm.values()); // Using values() to get the set view of values

        System.out.println(hm.equals(hm2)); //checks the two HashMap are equal or not

        System.out.println(hm.hashCode());  // Getting the hashcode value for the map

        hm2.replace(1,"CH");  //Replaces the entry for the specified key only if it is currently mapped to some value.

        hm2.remove(128,"OH");  //Removes the entry for the specified key only if it is currently mapped to the specified value.

        hm2.replace(127, "PA", "CP");  //Replaces the entry for the specified key only if currently mapped to the specified value.
        
        hm.firstKey(); //Returns the first (lowest) key currently in this sorted map.

        hm.lastKey();  //Returns the last (highest) key currently in this sorted map.
    
        // Creating the sorted map for map head
        SortedMap<Integer, String> map_head = new 
        TreeMap<Integer, String>();
        map_head = hm.headMap(4);

        // Getting the map head
        System.out.println("The headmap is: " + map_head);

        // Displaying the submap
        // using subMap() method
        System.out.println("The subMap is "
                           + hm.subMap(126, 128));
    }
}

