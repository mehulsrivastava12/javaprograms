package Collections.Map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {
    public static void main(String[] args) {
        String file="C:\\Users\\DELL\\Desktop\\cities.csv";
        String line;
        int i=0;
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        Hashtable<Integer,String> ht2=new Hashtable<Integer,String>();
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            while((line=br.readLine())!=null){
                String key=(line.split(","))[9];
                ht.put(i,key);  //put the element in the HashMap
                i++;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        ht.remove(0); // remove element with a key using remove method
        ht.put(1,"PH");  // Change Value using put method
        for(Map.Entry<Integer,String> e:ht.entrySet()){  //Iterating using for each loop
            System.out.println("Key : " +e.getKey() +" Value : "+e.getValue());
        }
        ht.clone();  // Print and display the cloned HashMap using clone() method

        ht2.putAll(ht); //Copying one hashmap to another hashmap
        
        ht2.clear(); //Clearing the full HashMao using clear clear() method
        
        ht.compute(1 , (key, val) -> val.concat("OH")); //concatenate and remap the values using compute() method
       // hm2.compute(1,(key,val) -> val.concat("OH"));
        System.out.println(ht.containsKey(1)); //checking the hashmap contains the given key or not
        //System.out.println(hm);

        System.out.println(ht.containsValue("PHOH")); //Checkinh the hashmap contains the given value
        
        System.out.println(ht.entrySet()); // Using entrySet() to get the set view
        
        System.out.println("\n"+ht.get(2)); // Getting the value of key 2

        System.out.println(ht2.isEmpty());   //Returns true if this map contains no key-value mappings.

        System.out.println(ht.keySet()); // Using keySet() to get the set view of keys

        System.out.println(ht.size()); //return the size of HashMap

        System.out.println(ht.values()); // Using values() to get the set view of values

        System.out.println(ht.equals(ht2)); //checks the two HashMap are equal or not

        System.out.println(ht.hashCode());  // Getting the hashcode value for the map

        ht.replace(1,"CH");  //Replaces the entry for the specified key only if it is currently mapped to some value.

        ht.remove(128,"OH");  //Removes the entry for the specified key only if it is currently mapped to the specified value.

        ht.replace(127, "PA", "CP");  //Replaces the entry for the specified key only if currently mapped to the specified value.

        
    }
}
