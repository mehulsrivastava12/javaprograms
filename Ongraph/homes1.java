package Ongraph;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.NavigableSet;
import java.util.TreeSet;

public  class homes1{
    public static void main(String[] args){
        String file = "C:\\Users\\DELL\\Desktop\\homes.csv";
        String line;
        NavigableSet<Integer> ns =new TreeSet<Integer>();
        try (BufferedReader br =new BufferedReader(new FileReader(file))){
            line=br.readLine();
            while((line = br.readLine()) != null){
                String[] data= line.split(",");
                int p=(Integer.parseInt(data[1].trim()) - Integer.parseInt(data[0].trim()))*1000 - Integer.parseInt(data[8].trim());
                ns.add(p);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Largest profit: "+ns.pollLast()+" \nSecond Largest Profit: "+ns.pollLast()+"\nThird Largest Profit: "+ns.pollLast());
    }
}