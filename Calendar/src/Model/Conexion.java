package Model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class Conexion {
    //  MySQL Atributes
    public static final String URL = "jdbc:mysql://localhost:3306/time?autoReconnect=true&useSSL=false";  //  Database location with autoreconnect
    public static final String user = "root";   //  MySQL Workbench username
    public static final String password = "linkheroofhyrule";   //  MySQL Workbench 
    
    public Connection getConnection(){
            Connection connection = null;   //  Connection type object
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection(URL,  user, password);    //  Using all credentials to access the database
            //JOptionPane.showMessageDialog(null, "Connection succesful.");   //  Message dialog when the connection is successful
        }   catch(Exception ex){
            System.err.println("Error "+ex);
        }
        return connection;
    }
    
}
