package cl.org.model;

/**
 *
 * @author Jorge A
 */
public class Log {

    private int id;
    private String registro;
    private String fecha;
    private String run;
    private String nombre;

    public Log() {
    }

    public Log(int id, String registro, String fecha, String run, String nombre) {
        this.id = id;
        this.registro = registro;
        this.fecha = fecha;
        this.run = run;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Log{" + "id=" + id + ", registro=" + registro + ", fecha=" + fecha + ", run=" + run + ", nombre=" + nombre + '}';
    }
}
