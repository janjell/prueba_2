package cl.org.model;

public class Cliente {
    
    private int id;
    private String run;
    private String nombre;
    private int sueldo;

    public Cliente() {
    }

    public Cliente(int id, String run, String nombre, int sueldo) {
        this.id = id;
        this.run = run;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", run=" + run + ", nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    
}
