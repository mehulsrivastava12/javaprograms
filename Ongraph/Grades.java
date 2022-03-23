package Ongraph;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeMap;
public class Grades {
    public static void main(String[] args) {
        String file ="C:\\Users\\DELL\\Desktop\\grades.csv";
        String line;
        TreeMap<Float,String[]> t1=new TreeMap<Float,String[]>();
        TreeMap<Float,String[]> t2=new TreeMap<Float,String[]>();
        TreeMap<Float,String[]> t3=new TreeMap<Float,String[]>();
        TreeMap<Float,String[]> t4=new TreeMap<Float,String[]>();
        try (BufferedReader br =new BufferedReader(new FileReader(file))) {
            line=br.readLine();
            while((line = br.readLine()) != null){
               String[] dat=line.split(",");
               t1.put(Float.parseFloat(dat[3]),dat);
               t2.put(Float.parseFloat(dat[4]),dat);
               t3.put(Float.parseFloat(dat[5]),dat);
               t4.put(Float.parseFloat(dat[6]),dat);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        String[] test1=t1.get(t1.lastKey());
        String[] test2=t2.get(t2.lastKey());
        String[] test3=t3.get(t3.lastKey());
        String[] test4=t4.get(t4.lastKey());
        System.out.println("Topper of test 1 is : "+test1[1]+" "+test1[0]+","+test1[2]);
        System.out.println("Topper of test 2 is : "+test2[1]+" "+test2[0]+","+test2[2]);
        System.out.println("Topper of test 3 is : "+test3[1]+" "+test3[0]+","+test3[2]);
        System.out.println("Topper of test 4 is : "+test4[1]+" "+test4[0]+","+test4[2]);
    }
}
