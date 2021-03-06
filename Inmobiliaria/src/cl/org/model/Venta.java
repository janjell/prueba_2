package cl.org.model;

public class Venta {

    private int id;
    private String fecha;
    private int idRol;
    private int idUsuario;
    private int idCliente;

    public Venta() {
    }

    public Venta(int id, String fecha, int idRol, int idUsuario, int idCliente) {
        this.id = id;
        this.fecha = fecha;
        this.idRol = idRol;
        this.idUsuario = idUsuario;
        this.idCliente = idCliente;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", fecha=" + fecha + ", idRol=" + idRol + ", idUsuario=" + idUsuario + ", idCliente=" + idCliente + '}';
    }
}
