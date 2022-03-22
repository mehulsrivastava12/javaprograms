package Ongraph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Oscar1 {
    public static void main(String[] args) {
        String file="C:\\Users\\DELL\\Desktop\\oscar_age_male.csv";
        String line;
        List<List<String>> l=new ArrayList<List<String>>();
        List<String> Age=new ArrayList<String>();
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            while((line=br.readLine())!=null){
                l.add(Arrays.asList(line.split(","))); 
                String[] arr=line.split(",");
                String age=(arr[4]);
                Age.add(age);
                Age.remove("Age");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        int min=Age.indexOf(Collections.min(Age));
        int max=Age.indexOf(Collections.max(Age));
        System.out.println("Youngest : "+l.get(min+1));
        System.out.println("Eldest : "+l.get(max+1));
    }
}
