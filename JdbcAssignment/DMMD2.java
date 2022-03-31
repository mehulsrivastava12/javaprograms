package JdbcAssignment;
import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class DMMD2 {
    public static void main(String[] args) {
        SortedMap<Long,String> ts=new TreeMap<Long,String>();
        String url="jdbc:mysql://localhost:3306/employees",user="root",password="Mehul@1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT m.dept_no,e.first_name,e.last_name,m.from_date,m.to_date "+
            "FROM dept_manager m JOIN (employees e,dept_manager) ON e.emp_no=m.emp_no GROUP BY dept_no");
            while(rs.next()){
                LocalDate date1 = LocalDate.parse(rs.getString(4));
                LocalDate date2 = LocalDate.parse(rs.getString(5));
                long diff = ChronoUnit.DAYS.between(date1, date2);  
                String value=rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+diff+" days";
                ts.put(diff,value);
            }
            con.close();
            System.out.println(ts.get(ts.lastKey()));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}