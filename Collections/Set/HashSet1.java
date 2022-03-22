package Collections.Set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        String file="C:\\Users\\DELL\\Desktop\\cities.csv";
        String line;
        HashSet<String> hs=new HashSet<String>();
        HashSet<String> hs2=new HashSet<String>();
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            while((line=br.readLine())!=null){
                String key=(line.split(","))[9];
                hs.add(key); // Adding elements to above Set
                // using add() method
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        hs.remove(" MN");  // Removing the element 
        
        hs.clone(); //clone the elements

        hs2.addAll(hs); //copying all elements of hashset to another hashset

        hs2.clear(); //clearing the hashset fully

        System.out.println(hs.contains(" OH")); //Used to return true if an element is present in set.

        hs.remove(" OH"); //Used to remove the element if it is present in set.

        Iterator value = hs.iterator();
  
        // Displaying the values after iterating through the set
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }

        System.out.println(hs2.isEmpty()); //to check the hashset is empty or not

        hs.size(); //used to return the size of the hashset

        System.out.println(hs.equals(hs2)); //used to check the the two hashset is equal or not

        System.out.println(hs.hashCode()); //used to return the hash code

        // Check if the collection
        // contains same elements
        System.out.println("\nBoth the collections same: "+ hs.containsAll(hs2));

        // This method is used to retain all the elements from the set which are mentioned in the given collection.
        //This method returns true if this set changed as a result of the call.
        hs2.retainAll(hs);

        // Creating the array and using toArray()
        Object[] arr = hs.toArray();
  
        System.out.println("The array is:");
        for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}
