package Ongraph;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.NavigableSet;
import java.util.TreeSet;

public  class homes1{
    public static void main(String[] args){
        String file = "C:\\Users\\DELL\\Desktop\\homes.csv";
        String line;
        NavigableSet<Integer> St =new TreeSet<Integer>();
        try (BufferedReader br =new BufferedReader(new FileReader(file))){
            line=br.readLine();
            while((line = br.readLine()) != null){
                String[] key= line.split(",");
                int p=(Integer.parseInt(key[1].trim()) - Integer.parseInt(key[0].trim()))*1000 - Integer.parseInt(key[8].trim());
                St.add(p);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Largest profit: "+St.pollLast()+" \nSecond Largest Profit: "+St.pollLast()+"\nThird Largest Profit: "+St.pollLast());
    }
}