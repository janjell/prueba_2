package cl.org.model;

public class VentasString {

    private int id;
    private String fecha;
    private String idRol;
    private String idUsuario;
    private String idCliente;
    
    public VentasString(){}

    public VentasString(int id, String fecha, String idRol, String idUsuario, String idCliente) {
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

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "VentasString{" + "id=" + id + ", fecha=" + fecha + ", idRol=" + idRol + ", idUsuario=" + idUsuario + ", idCliente=" + idCliente + '}';
    }
    
    
}
