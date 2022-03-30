package JdbcAssignment;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class AverageSalary {
    public static void main(String[] args) {
        List<String> ls= new ArrayList<String>();
        String url="jdbc:mysql://localhost:3306/employees",user="root",password="Mehul@1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select t.title,avg(salary) from salaries s INNER JOIN (titles t) ON t.emp_no=s.emp_no GROUP BY title;");
            while(rs.next()){
                ls.add(rs.getString(1)+" "+Integer.toString(rs.getInt(2)));
            }
            con.close();
            for(String str:ls){
                System.out.println(str);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
