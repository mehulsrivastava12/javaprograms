package Ongraph;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeMap;
public class Oscar3 {
    public static void main(String[] args){
        String file ="C:\\Users\\DELL\\Desktop\\oscar_age_male.csv";
        String line;
        TreeMap<Integer,String[]> ts=new TreeMap<Integer, String[]>();
        try (BufferedReader br =new BufferedReader(new FileReader(file))) {
            line=br.readLine();
            while((line = br.readLine()) != null){
                    String[] data =line.split(",");
                    ts.put(Integer.parseInt(data[4]),data);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        String[] ss=ts.get(ts.firstKey());
        String[] st=ts.get(ts.lastKey());
        System.out.println("Youngest : \n"+ss[2]+","+ss[6]+","+ss[8]);
        System.out.println("Eldest : \n"+st[2]+","+st[6]+","+st[8]);
    }
}
