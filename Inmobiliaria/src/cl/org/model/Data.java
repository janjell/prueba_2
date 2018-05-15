package cl.org.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Data {
   
    private Conexion con;
    private ResultSet rs;
    private String query;

    public Data() throws SQLException, ClassNotFoundException {
        con = new Conexion(
                "localhost",
                "bd_curso",
                "root",
                ""
        );
    }
    
    
}