 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Group.VI;
import java.sql.*;

/**
 *
 * @author suman
 */
public class DBConnection {
   
    static final String DB_URL = "jdbc:mysql://localhost:3306/demo?zeroDateTimeBehavior=CONVERT_TO_NULL";
    static final String USER = "root";
    static final String PASS ="Sumanth@011938113";
    public static Connection connectDB()
    {
        // we need to set the connection first;
         Connection con = null;
        try
        {
            //register jdbc driver, not required for new jdk
         //   Class.forName("com.mysql.jdbc.Driver");
            // open a connection
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connected to the data base Successfully");
            return con;
        }
        catch(Exception e)
        {
            System.out.println("There were errors while connecting to Database");
            return null;
        }
    }
}
