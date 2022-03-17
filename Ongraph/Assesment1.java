package Ongraph;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Assesment1 {

    public static void main(String[] args) throws Exception {
        Path filePath = Paths.get("C:\\Users\\DELL\\Desktop\\homes.csv");
        Charset charset = StandardCharsets.UTF_8;
        ArrayList<Integer> ProfitList=new ArrayList<Integer>();
        int i=0;

        List<String> lines = Files.readAllLines(filePath, charset);
        for (i=0;i<lines.size()-1;i++) {
            if(i==0){
                
            }
            else{
                String line=lines.get(i);
                String[] array = line.split(",");
                int sell=Integer.parseInt(array[0].trim());
                int list=Integer.parseInt(array[1].trim());
                int tax=Integer.parseInt(array[8].trim());
                int profit=((list-sell)*1000)-tax;
                ProfitList.add(profit);
               
            }
        }
        System.out.println(ProfitList.size());
        Collections.sort(ProfitList);
        System.out.println();
        for(int j=ProfitList.size()-1;j>=ProfitList.size()-3;j--){
            System.out.println(ProfitList.get(j));
        }
    }
}
