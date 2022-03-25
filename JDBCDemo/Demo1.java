package JDBCDemo;
import java.sql.Statement;
import java.sql.*;
public class Demo1 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String user="root";
        String password="mehul@1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Load and register
            Connection con=DriverManager.getConnection(url, user, password); //Establish Connection
            Statement st=con.createStatement(); //Creating Statement
            ResultSet rs=st.executeQuery("Select * from employee"); //Executing the query
            while(rs.next()){ //Processing the result
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
            }
            con.close(); //Closing the conncetion
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
