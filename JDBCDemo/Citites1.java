package JDBCDemo;
import java.sql.*;
import java.sql.Statement;
import java.io.*;
public class Citites1 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String user="root";
        String password="mehul@1234";
        String path="CSVFiles/cities.csv";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            st.execute("CREATE TABLE city1(LatD varchar(45), LatM varchar(45), LatS varchar(45),NS varchar(45),LonD varchar(45),LonM varchar(45),LonS varchar(45),EW varchar(45),City varchar(45),State varchar(45));");
            String sql="INSERT INTO city1 VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stm=con.prepareStatement(sql);
            String line;
            BufferedReader br=new BufferedReader(new FileReader(path));
            br.readLine();
            while((line=br.readLine())!=null){
                String[] data=line.split(",");
                stm.setString(1, data[0].trim());
                stm.setString(2, data[1].trim());
                stm.setString(3, data[2].trim());
                stm.setString(4, data[3].trim());
                stm.setString(5, data[4].trim());
                stm.setString(6, data[5].trim());
                stm.setString(7, data[6].trim());
                stm.setString(8, data[7].trim());
                stm.setString(9, data[8].trim());
                stm.setString(10, data[9].trim());
                stm.addBatch();
            }
            stm.executeBatch();                     
            con.close();
            System.out.println("Data Inserted Successfully");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
