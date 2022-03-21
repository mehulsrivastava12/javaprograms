package Ongraph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Oscar2 {
    public static void main(String[] args) {
        String file="C:\\Users\\DELL\\Desktop\\oscar_age_male.csv";
        String line;
        List<String> Year=new ArrayList<String>();
        List<String> Age=new ArrayList<String>();
        List<String> Name=new ArrayList<String>();
        List<String> Movie=new ArrayList<String>();

        try(BufferedReader cr=new BufferedReader(new FileReader(file))){
            while((line=cr.readLine())!=null){
                String[] ar=line.split(",");
                String year=(ar[2]);
                String name=(ar[6]);
                String movie=ar[8];
                String age=ar[4];
                Name.add(name);
                Year.add(year);
                Movie.add(movie);
                Age.add(age);
                Age.remove("Age");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        int min=(Age.indexOf(Collections.min(Age)));
        int max=(Age.indexOf(Collections.max(Age)));
        System.out.println("Youngest : ");
        System.out.println(Year.get(min+1)+" "+Name.get(min+1)+" "+Movie.get(min+1));
        System.out.println("Eldest : ");
        System.out.println(Year.get(max+1)+" "+Name.get(max+1)+" "+Movie.get(max+1));
    }
}
