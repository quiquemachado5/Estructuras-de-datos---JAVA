
import java.sql.*;

public class NewClass {
    static String bd = "MiniAgenda";
    static String login = "usuario";
    static String password = "clave";
    static String url = "jdbc:mysql://localhost/" + bd + "?serverTimezone=UTC";
    Class c = Class.forName("Controlador JDBC");
        Driver driver = (Driver)c.newInstance();
        DriverManager.registerDriver(driver); 
        Class.forName("Controlador JDBC").newInstance();
        
    
    public static void main(String[] args) throws Exception {
         
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                System.out.println("Conexión a base de datos " + url + " ... Ok");
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
