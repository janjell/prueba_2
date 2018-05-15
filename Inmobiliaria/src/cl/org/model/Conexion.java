package cl.org.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;        
import java.sql.SQLException;
import java.sql.Statement;      
 
public class Conexion {
    private Statement sen;
    private ResultSet rs;
    private Connection con;
   
    public Conexion(String server, String bd, String user, String pass) throws ClassNotFoundException, SQLException{
        String protocolo = "jdbc:mysql://";
        String lineaUser = "user="+user;
        String lineaPass = "password="+pass;
       
        String url = protocolo +
                server + "/" +
                bd + "?" +
                lineaUser + "&" +
                lineaPass;
       
        System.out.println(url);
       
        Class.forName("com.mysql.jdbc.Driver"); // JAR?
        con = DriverManager.getConnection(url);
    }
   
    public void ejecutar(String query) throws SQLException{
        System.out.println(query);
       
        sen = con.createStatement();
        sen.executeUpdate(query);
        close();
    }
   
    public ResultSet ejecutarSelect(String query) throws SQLException{
        System.out.println(query);
       
        sen = con.createStatement();
        rs = sen.executeQuery(query);
        return rs;
    }
   
    public void close() throws SQLException{
        sen.close();
    }
}