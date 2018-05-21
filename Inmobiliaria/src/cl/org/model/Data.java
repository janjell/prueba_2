package cl.org.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

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
                + "'," + nuevo.isAdministrador() + ")";
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
                + "','" + nueva.getEstado()
                + "','" + nueva.getCantPiezas()
                + "','" + nueva.getCantBanos()
                + "','" + nueva.getTipoVivienda()
                + "','" + nueva.getPrecio()
                + "', " + nueva.isNuevo() + ")";
        con.ejecutar(query);
        con.close();
    }

    public void crearVenta(Venta nueva) throws SQLException {
        query = "INSERT INTO venta VALUES(NULL,'" + nueva.getFecha()
                + "','" + nueva.getIdRol()
                + "','" + nueva.getIdUsuario()
                + "','" + nueva.getIdCliente() + "')";
        con.ejecutar(query);
        con.close();
    }

    // Leer
    public List<Usuario> verUsuarios() throws SQLException {
        query = "SELECT * FROM usuario";
        List<Usuario> usuarios = new ArrayList<>();
        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            Usuario usu = new Usuario();
            usu.setRun(rs.getString(1));
            usu.setNombre(rs.getString(2));
            usu.setAdministrador(rs.getBoolean(3));
            usuarios.add(usu);
        }
        con.close();
        return usuarios;
    }

    public List<Cliente> verClientes() throws SQLException {
        query = "SELECT * FROM cliente";
        List<Cliente> clientes = new ArrayList<>();
        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            Cliente cli = new Cliente();
            cli.setRun(rs.getString(1));
            cli.setNombre(rs.getString(2));
            cli.setSueldo(rs.getInt(3));
            clientes.add(cli);
        }
        con.close();
        return clientes;
    }

    public List<Vivienda> verViviendas() throws SQLException {
        query = "SELECT * FROM vivienda";
        List<Vivienda> viviendas = new ArrayList<>();
        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            Vivienda viv = new Vivienda();
            viv.setDireccion(rs.getString(1));
            viv.setEstado(rs.getInt(2));
            viv.setCantPiezas(rs.getInt(3));
            viv.setCantBanos(rs.getInt(4));
            viv.setTipoVivienda(rs.getInt(5));
            viv.setPrecio(rs.getInt(6));
            viv.setNuevo(rs.getBoolean(7));
            viviendas.add(viv);
        }

        con.close();
        return viviendas;
    }

    public List<Venta> verVentas() throws SQLException {
        query = "SELECT * FROM venta";
        List<Venta> ventas = new ArrayList<>();
        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            Venta ven = new Venta();
            ven.setFecha(rs.getInt(1));
            ven.setIdRol(rs.getInt(2));
            ven.setIdUsuario(rs.getInt(3));
            ven.setIdCliente(rs.getInt(4));
            ventas.add(ven);
        }

        con.close();
        return ventas;
    }

    // Actualizar
    public void updateCliente(Cliente mod) throws SQLException {
        query = "UPDATE cliente SET nombre = '" + mod.getNombre()
                + "', sueldo='" + mod.getSueldo()
                + "' WHERE run = '" + mod.getRun() + "'";
        con.ejecutar(query);
        con.close();
    }

    public void updateVivienda(Vivienda mod) throws SQLException {
        query = "UPDATE vivienda SET direccion = '" + mod.getDireccion()
                + "', estado='" + mod.getEstado()
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
        query = "UPDATE venta SET fecha = '" + mod.getFecha()
                + "', rol_fk='" + mod.getIdRol()
                + "', usuario_fk='" + mod.getIdUsuario()
                + "', cliente_fk='" + mod.getIdCliente()
                + "' WHERE id = '" + mod.getId() + "'";
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
    public Usuario buscarUsuario(String run) throws SQLException {
        query = "SELECT * FROM usuario WHERE run = '" + run + "'";
        rs = con.ejecutarSelect(query);
        Usuario usu = null;

        while (rs.next()) {
            usu = new Usuario();
            usu.setRun(rs.getString(1));
            usu.setNombre(rs.getString(2));
            usu.setAdministrador(rs.getBoolean(3));
        }

        con.close();
        return usu;
    }

    public Cliente buscarCliente(String run) throws SQLException {
        query = "SELECT * FROM cliente WHERE run = '" + run + "'";
        rs = con.ejecutarSelect(query);
        Cliente cli = null;

        while (rs.next()) {
            cli = new Cliente();
            cli.setRun(rs.getString(1));
            cli.setNombre(rs.getString(2));
            cli.setSueldo(rs.getInt(3));
        }

        con.close();
        return cli;
    }

    public Vivienda buscarVivienda(int rol) throws SQLException {
        query = "SELECT * FROM vivienda WHERE nrol = '" + rol + "'";
        rs = con.ejecutarSelect(query);
        Vivienda viv = null;

        while (rs.next()) {
            viv = new Vivienda();
            viv.setDireccion(rs.getString(1));
            viv.setEstado(rs.getInt(2));
            viv.setCantPiezas(rs.getInt(3));
            viv.setCantBanos(rs.getInt(4));
            viv.setTipoVivienda(rs.getInt(5));
            viv.setPrecio(rs.getInt(6));
            viv.setNuevo(rs.getBoolean(7));
        }

        con.close();
        return viv;
    }

    public int verificarPersona(String run) throws SQLException {
        query = "SELECT administrador FROM usuario WHERE run = '" + run + "'";
        rs = con.ejecutarSelect(query);

        int resultado = 0;

        if (rs.next()) {
            resultado = rs.getInt(1);
        }

        con.close();
        return resultado;
    }
}
