import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*
        * Import the package
        * Load the class and register
        * create connection
        * create statement
        * execute the statement
        * process and result
        * close connection
        * */

        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="Abhishek@007";
        String sql="update student set sname='Mitanshu' where sid=3";

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,uname,pass);
        Statement st= con.createStatement();


//        rs.next();
//        String name=rs.getString("sname");
//        System.out.println(name);

//        Read
//        ResultSet rs= st.executeQuery(sql);
//        while (rs.next()){
//            System.out.println(rs.getInt("sid")+" "+rs.getString("sname")+" "+rs.getInt("marks"));
//        }

//        Insert
//        boolean status=st.execute(sql);
//        System.out.println(status);

//        Update
        boolean status=st.execute(sql);
        System.out.println(status);





        con.close();
        System.out.println("Connection closed");

        System.out.println("Connection established");
    }
}
