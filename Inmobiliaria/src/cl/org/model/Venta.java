package cl.org.model;

public class Venta {

    private int id;
    private int idRol;
    private int idUsuario;
    private int idCliente;

    public Venta() {
    }

    public Venta(int id, int idRol, int idUsuario, int idCliente) {
        this.id = id;
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
        return "Venta{" + "id=" + id + ", idRol=" + idRol + ", idUsuario=" + idUsuario + ", idCliente=" + idCliente + '}';
    }
}
