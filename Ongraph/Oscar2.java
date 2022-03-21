package Ongraph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
public class Oscar2 {
    public static void main(String[] args){
        String file ="C:\\Users\\DELL\\Desktop\\oscar_age_male.csv";
        String line;
        String movie1="",movie2="",name1="",name2="";
        int max=0,i=0,min=44,year1=0,year2=0;
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        try (BufferedReader br =new BufferedReader(new FileReader(file))) {
            while((line = br.readLine()) != null){
                String key = (line.split(","))[4];
                if(i!=0){ 
                    if(Integer.parseInt(key)>max){
                        max=Integer.parseInt(key);
                        name1=(line.split(","))[6];
                        year1=Integer.parseInt((line.split(","))[2]);
                        movie1=(line.split(","))[8];
                    }
                    else if(Integer.parseInt(key)<min){
                        min=Integer.parseInt(key);
                        name2=(line.split(","))[6];
                        year2=Integer.parseInt((line.split(","))[2]);
                        movie2=(line.split(","))[8];
                    } 
                }
                else{
                    i=i+1;
                    continue;
                }                                               
            }
        } 
        catch (Exception e){
           System.out.println(e);
        }
        System.out.println("Youngest Winner name is "+name2+"in year "+year2+" for the film "+movie2);
        System.out.println("Eldest Winner name is "+name1+"in year "+year1+" for the film "+movie1);    
    }
}
