package Ongraph;
import java.io.*;
public class airtravel {
    public static void main(String[] args) throws IOException {
        int sumof1958 =0,sumof1959=0,sumof1960=0,i=0,row=0;
        String path = "C:\\Users\\DELL\\Desktop\\airtravel.csv";
        String line;
        BufferedReader br = new BufferedReader(new FileReader(path));
        while((line=br.readLine())!=null){
            row++;
            String[] arry = line.split(",");
            if(i==0){
                i++;
            }
            else{
                if(i>12){
                    break;
                }  
                i++; 
            sumof1958 = sumof1958 +Integer.parseInt(arry[1].trim());
            sumof1959 = sumof1959 +Integer.parseInt(arry[2].trim());
            sumof1960 = sumof1960 +Integer.parseInt(arry[3].trim());            
            }  
        }
        System.out.println("Average Of Years: "+"1958"+"  "+"1959"+"  "+"1960");
        System.out.print("                  "+sumof1958/row);
        System.out.print("   "+sumof1959/row);
        System.out.print("   "+sumof1960/row);
        br.close();
    }
}