package JDBCDemo;
import java.sql.Statement;
import java.sql.*;
import java.io.BufferedReader;
import java.io.FileReader;
public class CSV1 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String user="root";
        String password="Mehul@1234";
        String path = "airtravel.csv";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            st.execute("CREATE TABLE air(month varchar(10),year1958 int,year1959 int,year1960 int);");
            String sql = "INSERT INTO air(month,year1958,year1959,year1960) VALUES ( ?, ?, ?, ?)";
            PreparedStatement stm = con.prepareStatement(sql);                                               
            String line;
            BufferedReader br =new BufferedReader(new FileReader(path));
            br.readLine();
            while((line = br.readLine()) != null){
                String[] data=line.split(",");
                stm.setString(1, data[0]);
                stm.setInt(2, Integer.parseInt(data[1].trim()));
                stm.setInt(3, Integer.parseInt(data[2].trim()));
                stm.setInt(4, Integer.parseInt(data[3].trim()));
                stm.addBatch();
            }
          stm.executeBatch();                     
          con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}