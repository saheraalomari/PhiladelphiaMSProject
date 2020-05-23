package Control;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Sahera Al Omari
 */
public class connect {
    
    public static Connection ConnectDB(){
        try {
            
         //Class.forName("com.mysql.jdbc.Driver");
         //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?userTimezone=true&serverTimezone=UTC","root","root");
          Class.forName("org.sqlite.JDBC");
          Connection conn=DriverManager.getConnection("jdbc:sqlite:mydb.db");
            return conn;
            //return con;
          
        }
        catch (ClassNotFoundException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);}
        return null;
}
    
}
