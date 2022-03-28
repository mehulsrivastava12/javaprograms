package JDBCDemo;
import java.sql.*;  
public class PreparedUpdate{  
    public static void main(String args[]){ 
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String user="root";
        String password="mehul@1234"; 
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(url,user,password);  
            PreparedStatement stmt=con.prepareStatement("update emp set name=? where id=?");  
            stmt.setString(1,"Sonoo"); 
            stmt.setInt(2,101);  
            int i=stmt.executeUpdate();  
            System.out.println(i+" records updated");
            con.close();  
        }
        catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  