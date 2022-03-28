package JDBCDemo;
import java.sql.Statement;
import java.sql.*;
import java.io.BufferedReader;
import java.io.FileReader;
public class grades1 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String user="root";
        String password="mehul@1234";
        String path="CSVFiles/grades.csv";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            st.execute("CREATE TABLE grade1(LastName varchar(20),FirstName varchar(20),SSN varchar(20),Test1 varchar(20),Test2 varchar(20),Test3 varchar(20),Test4 varchar(20),Final varchar(20));");
            String sql="INSERT INTO grade1 VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";
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
                stm.addBatch();
            }
            stm.executeBatch();
            con.close();
            System.out.println("data inserted");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
