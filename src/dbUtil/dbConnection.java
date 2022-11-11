package dbUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    Connection conn = null;
    // String query = "SELECT * FROM login_tbl";

    // if(conn!=null)
    // {
    //     System.out.println("Connected to Database");
    // }

    public static Connection getConnection(){
            try {
                return DriverManager.getConnection(Config.URL, Config.USERNAME, Config.PASSWORD);
            } catch (SQLException e) {
                
                e.printStackTrace();
            }
    return null;
    
  }
}
