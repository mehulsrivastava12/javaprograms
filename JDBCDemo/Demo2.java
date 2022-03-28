package JDBCDemo;
import java.sql.*;
import java.sql.Statement;
public class Demo2 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String user="root";
        String password="mehul@1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from city where LatS='0'");
            while(rs.next()){
                String data=" ";
                for(int i=1;i<=10;i++){
                    data +=rs.getString(i)+" ";
                }
                System.out.println(data);
            }        
            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
