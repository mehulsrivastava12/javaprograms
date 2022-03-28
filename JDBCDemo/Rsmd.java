package JDBCDemo;
import java.sql.*;  
public class Rsmd{  //Program for ResulSetMetaData
    public static void main(String args[]){ 
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String user="root";
        String password="mehul@1234"; 
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(url,user,password);  
            PreparedStatement ps=con.prepareStatement("select * from city");  
            ResultSet rs=ps.executeQuery();  
            ResultSetMetaData rsmd=rs.getMetaData();  
            System.out.println("Total columns: "+rsmd.getColumnCount());  
            System.out.println("Column Name of 1st column: "+rsmd.getColumnName(2));  
            System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(2));  
            con.close();  
        }
        catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  