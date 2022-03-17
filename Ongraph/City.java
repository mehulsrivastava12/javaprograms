package Ongraph;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {
    public static void countFrequencies(ArrayList<String> list)
    {
        Map<String, Integer> hm = new HashMap<String, Integer>();
  
        for (String i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }
  
        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println(val.getKey() + " has "+ val.getValue() + " cities");
        }
    }
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:\\Users\\DELL\\Desktop\\cities.csv");
        Charset charset = StandardCharsets.UTF_8;
        ArrayList<String> cities=new ArrayList<String>();
        int i=0;
        
        List<String> lines = Files.readAllLines(filePath, charset);
        for (i=0;i<lines.size()-1;i++) {
            if(i==0){
                
            }
            else{
                String line=lines.get(i);
                String[] array = line.split(",");
                cities.add(array[9]);
            }
        }
        Collections.sort(cities);
        countFrequencies(cities);
    }
}
