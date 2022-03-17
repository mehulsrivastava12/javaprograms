package Ongraph;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class citites {
    public static void main(String[] args) {
        String file="C:\\Users\\DELL\\Desktop\\cities.csv";
        String line;
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            while((line=br.readLine())!=null){
                String key=(line.split(","))[9];
                if(hm.containsKey(key)){
                    hm.put(key,hm.get(key)+1);
                }
                else{
                    hm.put(key,1);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(hm);
    }
}

