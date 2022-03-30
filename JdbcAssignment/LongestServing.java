package JdbcAssignment;
import java.sql.Statement;
import java.util.SortedMap;
import java.util.TreeMap;
import java.sql.*;

public class LongestServing {
    public static void main(String[] args) {
        SortedMap<Integer,String> a=new TreeMap<Integer,String>();
        String url="jdbc:mysql://localhost:3306/employees",user="root",password="Mehul@1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select t.title,t.emp_no,datediff(e.to_date,e.from_date)"+
            "from dept_emp e INNER JOIN (titles t) ON t.emp_no=e.emp_no;");
            while(rs.next()){
                String value="Title:"+rs.getString(1)+"\nemp_no: "+rs.getInt(2)+" \n"+rs.getInt(3)+" days";
                a.put(rs.getInt(3),value);
            }                                      
            con.close();
            System.out.println(a.get(a.lastKey()));
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
