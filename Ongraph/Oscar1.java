package Ongraph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Oscar1 {
    public static void main(String[] args) {
        String file="C:\\Users\\DELL\\Desktop\\oscar_age_male.csv";
        String line;
        String li;
        List<List<String>> l=new ArrayList<List<String>>();
        List<String> Age=new ArrayList<String>();
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            while((line=br.readLine())!=null){
                l.add(Arrays.asList(line.split(","))); 

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        try(BufferedReader cr=new BufferedReader(new FileReader(file))){
            while((li=cr.readLine())!=null){
                String[] arr=li.split(",");
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
        System.out.println("Youngest : ");
        System.out.println(l.get(min+1));
        System.out.println("Eldest : ");
        System.out.println(l.get(max+1));

    }
}
