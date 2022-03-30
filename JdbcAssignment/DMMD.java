package JdbcAssignment;
import java.sql.*;
import java.util.*;
public class DMMD {
    public static void main(String[] args) {
        SortedSet<String> a=new TreeSet<String>();
        String url="jdbc:mysql://localhost:3306/employees",user="root",password="Mehul@1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select m.dept_no,e.first_name,e.last_name,max(DATEDIFF(m.to_date,m.from_date))"+
            "from dept_manager m INNER JOIN (employees e,dept_manager) ON e.emp_no=m.emp_no GROUP BY dept_no;");
            while(rs.next()){
                String value=rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" days";
                a.add(value);
            }
            con.close();
            for(String e:a){
                System.out.println(e+" ");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
