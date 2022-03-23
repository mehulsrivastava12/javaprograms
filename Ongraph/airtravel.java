package Ongraph;
import java.io.*;
public class airtravel {
    public static void main(String[] args) throws IOException {
        String n;
        float sumof1958 =0,sumof1959=0,sumof1960=0;
        int i=0;
        String path = "C:\\Users\\DELL\\Desktop\\airtravel.csv";
        BufferedReader br = new BufferedReader(new FileReader(path));
        while((n=br.readLine())!=null){
            String[] arry = n.split(",");
            if(i==0){
                i++;
            }
            else{
                if(i>12){
                    break;
                }  
                i++; 
            sumof1958 = sumof1958 +Float.parseFloat(arry[1].trim());
            sumof1959 = sumof1959 +Float.parseFloat(arry[2].trim());
            sumof1960 = sumof1960 +Float.parseFloat(arry[3].trim());            
            }     
        }
        System.out.println("Average of Year 1958 "+sumof1958/(i-1));
        System.out.println("Average of Year 1959 "+sumof1959/(i-1));
        System.out.println("Average Of Year 1960 "+sumof1960/(i-1));
        br.close();
    }
}