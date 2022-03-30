package JdbcAssignment;
import java.sql.*;
public class Highest {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/employees",user="root",password="Mehul@1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select e.dept_no,first_name,last_name,max(salary)"+
            "from salaries s INNER JOIN (dept_emp e, dept_manager m,employees ee)"+
            "ON e.emp_no=s.emp_no AND m.emp_no=s.emp_no AND ee.emp_no=s.emp_no GROUP BY dept_no;"); 
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
            }
            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
