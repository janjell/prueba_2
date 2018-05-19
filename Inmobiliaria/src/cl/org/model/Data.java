package cl.org.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Data {

    private Conexion con;
    private ResultSet rs;
    private String query;

    public Data() throws SQLException, ClassNotFoundException {
        con = new Conexion("localhost", "bd_inmobiliaria", "root", "");
    }

    // Crear
    public void crearUsuario(Usuario nuevo) throws SQLException {
        query = "INSERT INTO usuario VALUES(NULL,'" + nuevo.getRun()
                + "','" + nuevo.getNombre()
                + "','" + nuevo.isAdministrador() + "')";
        con.ejecutar(query);
        con.close();
    }

    public void crearCliente(Cliente nuevo) throws SQLException {
        query = "INSERT INTO cliente VALUES(NULL,'" + nuevo.getRun()
                + "','" + nuevo.getNombre()
                + "','" + nuevo.getSueldo() + "')";
        con.ejecutar(query);
        con.close();
    }

    public void crearVivienda(Vivienda nueva) throws SQLException {
        query = "INSERT INTO vivienda VALUES(NULL,'" + nueva.getDireccion()
                + "','" + nueva.getCantPiezas()
                + "','" + nueva.getCantBanos()
                + "','" + nueva.getTipoVivienda()
                + "','" + nueva.getPrecio()
                + "','" + nueva.isNuevo() + "')";
        con.ejecutar(query);
        con.close();
    }

    public void crearVenta(Venta nueva) throws SQLException {
        query = "INSERT INTO venta VALUES(NULL,'" + nueva.getIdRol()
                + "','" + nueva.getIdUsuario()
                + "','" + nueva.getIdCliente() + "')";
        con.ejecutar(query);
        con.close();
    }

    public void crearTipoVivienda(TipoVivienda nueva) throws SQLException {
        query = "INSERT INTO venta VALUES(NULL,'" + nueva.getTipo() + "')";
        con.ejecutar(query);
        con.close();
    }

    // Leer
    // Por hacer... 
    // Actualizar
    public void updateUsuario(Usuario mod) throws SQLException {
        query = "UPDATE usuario SET nombre = '" + mod.getNombre()
                + "', administrador='" + mod.isAdministrador()
                + "' WHERE run = '" + mod.getRun() + "'";
        con.ejecutar(query);
        con.close();
    }

    public void updateCliente(Cliente mod) throws SQLException {
        query = "UPDATE cliente SET nombre = '" + mod.getNombre()
                + "', sueldo='" + mod.getSueldo()
                + "' WHERE run = '" + mod.getRun() + "'";
        con.ejecutar(query);
        con.close();
    }

    public void updateVivienda(Vivienda mod) throws SQLException {
        query = "UPDATE vivienda SET direccion = '" + mod.getDireccion()
                + "', cantPiezas='" + mod.getCantPiezas()
                + "', cantBanos='" + mod.getCantBanos()
                + "', tipoVivienda='" + mod.getTipoVivienda()
                + "', precio='" + mod.getPrecio()
                + "', nuevo='" + mod.isNuevo()
                + "' WHERE nrol = '" + mod.getnDeRol() + "'";
        con.ejecutar(query);
        con.close();
    }

    public void updateVenta(Venta mod) throws SQLException {
        query = "UPDATE venta SET idRol = '" + mod.getIdRol()
                + "', idUsuario='" + mod.getIdUsuario()
                + "', idCliente='" + mod.getIdCliente()
                + "' WHERE id = '" + mod.getId() + "'";
        con.ejecutar(query);
        con.close();
    }

    public void updateTipoVivienda(TipoVivienda mod) throws SQLException {
        query = "UPDATE tipoVivienda SET tipo = '" + mod.getTipo()
                + "' WHERE id = '" + mod.getId() + "'";
        con.ejecutar(query);
        con.close();
    }

    // Borrar
    public void borrarUsuario(Usuario del) throws SQLException {
        query = "DELETE usuario WHERE run = '" + del.getRun() + "'";
        con.ejecutar(query);
        con.close();
    }

    public void borrarCliente(Cliente del) throws SQLException {
        query = "DELETE cliente WHERE run = '" + del.getRun() + "'";
        con.ejecutar(query);
        con.close();
    }

    public void borrarVivienda(Vivienda del) throws SQLException {
        query = "DELETE vivienda WHERE nrol = '" + del.getnDeRol() + "'";
        con.ejecutar(query);
        con.close();
    }

    public void borrarVenta(Venta del) throws SQLException {
        query = "DELETE venta WHERE id = '" + del.getId() + "'";
        con.ejecutar(query);
        con.close();
    }

    public void borrarTipoVivienda(TipoVivienda del) throws SQLException {
        query = "DELETE tipoVivienda WHERE id = '" + del.getId() + "'";
        con.ejecutar(query);
        con.close();
    }

    // Existencia
    public int existeUsuario(String run) throws SQLException {
        query = "SELECT COUNT(*) FROM usuario WHERE run = '" + run + "'";
        rs = con.ejecutarSelect(query);

        int resultado = 0;

        if (rs.next()) {
            resultado = rs.getInt(1);
        }

        con.close();

        return resultado;
    }

    public int existeCliente(String run) throws SQLException {
        query = "SELECT COUNT(*) FROM cliente WHERE run = '" + run + "'";
        rs = con.ejecutarSelect(query);

        int resultado = 0;

        if (rs.next()) {
            resultado = rs.getInt(1);
        }

        con.close();

        return resultado;
    }

    public int existeVivienda(int rol) throws SQLException {
        query = "SELECT COUNT(*) FROM vivienda WHERE nrol = '" + rol + "'";
        rs = con.ejecutarSelect(query);

        int resultado = 0;

        if (rs.next()) {
            resultado = rs.getInt(1);
        }

        con.close();

        return resultado;
    }

    // Busqueda
    public void buscarUsuario() throws SQLException {

    }

    public void buscarCliente() throws SQLException {

    }

    public void buscarVivienda() throws SQLException {

    }

}
