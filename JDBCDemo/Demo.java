package JDBCDemo;
import java.sql.Statement;
import java.sql.*;
public class Demo {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String user="root";
        String password="Mehul@1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection(url, user, password);

            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery("Select * from employee");

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
            }
            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
