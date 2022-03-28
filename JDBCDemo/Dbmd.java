package JDBCDemo;
import java.sql.*;  
public class Dbmd{  
    public static void main(String args[]){ //Program using method of DatabaseMetaData
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String user="root";
        String password="mehul@1234"; 
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(url,user,password);  
            DatabaseMetaData dbmd=con.getMetaData();  
            System.out.println("Driver Name: "+dbmd.getDriverName());  
            System.out.println("Driver Version: "+dbmd.getDriverVersion());  
            System.out.println("UserName: "+dbmd.getUserName());  
            System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
            System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
            con.close();  
        }
        catch(Exception e){
             System.out.println(e);
        }  
    }  
}  