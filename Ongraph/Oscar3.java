package Ongraph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeMap;
public class Oscar3 {
    public static void main(String[] args){
        String file ="C:\\Users\\DELL\\Desktop\\oscar_age_male.csv";
        String line;
        int i=0;
        TreeMap<String,String> ts=new TreeMap<String, String>();
        try (BufferedReader br =new BufferedReader(new FileReader(file))) {
            while((line = br.readLine()) != null){
                if(i!=0){
                    String age = (line.split(","))[4];
                    ts.put(age,line);
                }
                else{
                    i=i+1;
                    continue;
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        String[] ss=ts.get(ts.firstKey()).split(",,");
        String[] st=ts.get(ts.lastKey()).split(",,");
        System.out.println("Youngest : \n"+ss[1]+","+ss[3]+","+ss[4]);
        System.out.println("Eldest : \n"+st[1]+","+st[3]+","+st[4]);
    }
}
