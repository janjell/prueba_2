package cl.org.model;

public class VistaTop {

    private String fecha;
    private String nombre;

    public VistaTop() {
    }

    public VistaTop(String fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
