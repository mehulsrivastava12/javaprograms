package CollectionsFramework;

import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Shoes");
        hm.put(2,"Pants");
        hm.put(3,"Shirts");

        System.out.println("Value of HashMap At 1: " +hm.get(1));
        for(Map.Entry<Integer,String> e:hm.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
