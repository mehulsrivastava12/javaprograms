package Collections.Map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        String file="C:\\Users\\DELL\\Desktop\\cities.csv";
        String line;
        int i=0;
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
        LinkedHashMap<Integer,String> lhm2=new LinkedHashMap<Integer,String>();
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            while((line=br.readLine())!=null){
                String key=(line.split(","))[9];
                lhm.put(i,key);  //put the element in the HashMap
                i++;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        lhm.remove(0); // remove element with a key using remove method
        lhm.put(1,"PH");  // Change Value using put method
        for(Map.Entry<Integer,String> e:lhm.entrySet()){  //Iterating using for each loop
            System.out.println("Key : " +e.getKey() +" Value : "+e.getValue());
        }
        lhm.clone();  // Print and display the cloned HashMap using clone() method

        lhm2.putAll(lhm); //Copying one hashmap to another hashmap
        
        lhm2.clear(); //Clearing the full HashMao using clear clear() method
        
        lhm.compute(1 , (key, val) -> val.concat("OH")); //concatenate and remap the values using compute() method
       // hm2.compute(1,(key,val) -> val.concat("OH"));
        System.out.println(lhm.containsKey(1)); //checking the hashmap contains the given key or not
        //System.out.println(hm);

        System.out.println(lhm.containsValue("PHOH")); //Checkinh the hashmap contains the given value
        
        System.out.println(lhm.entrySet()); // Using entrySet() to get the set view
        
        System.out.println("\n"+lhm.get(2)); // Getting the value of key 2

        System.out.println(lhm2.isEmpty());   //Returns true if this map contains no key-value mappings.

        System.out.println(lhm.keySet()); // Using keySet() to get the set view of keys

        System.out.println(lhm.size()); //return the size of HashMap

        System.out.println(lhm.values()); // Using values() to get the set view of values

        System.out.println(lhm.equals(lhm2)); //checks the two HashMap are equal or not

        System.out.println(lhm.hashCode());  // Getting the hashcode value for the map

        lhm2.replace(1,"CH");  //Replaces the entry for the specified key only if it is currently mapped to some value.

        lhm2.remove(128,"OH");  //Removes the entry for the specified key only if it is currently mapped to the specified value.

        lhm2.replace(127, "PA", "CP");  //Replaces the entry for the specified key only if currently mapped to the specified value.

        
    }
}
