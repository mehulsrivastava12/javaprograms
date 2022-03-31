package JdbcAssignment;
import java.time.LocalDate;
import java.util.*;
import java.sql.*;
import java.time.temporal.ChronoUnit;
public class LongestServing {
    public static void main(String[] args) {
        SortedMap<Long,String> a=new TreeMap<Long,String>();
        String url="jdbc:mysql://localhost:3306/employees",user="root",password="Mehul@1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select t.title,t.emp_no,e.from_date,e.to_date "+
            "from dept_emp e JOIN (titles t) ON t.emp_no=e.emp_no;");
            while(rs.next()){
                LocalDate date1 = LocalDate.parse(rs.getString(3));
                LocalDate date2 = LocalDate.parse(rs.getString(4));
                long diff = ChronoUnit.DAYS.between(date1, date2); 
                String value="Title : "+rs.getString(1)+"\nEmp_NO : "+rs.getInt(2)+"\nDuration : "+diff+" days";
                a.put(diff,value);
            }                                      
            con.close();
            System.out.println(a.get(a.lastKey()));
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}