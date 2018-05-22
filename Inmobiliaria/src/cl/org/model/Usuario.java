package cl.org.model;

public class Usuario {
    
    private int id;
    private String run;
    private String nombre;
    private boolean administrador;

    public Usuario() {
    }

    public Usuario(int id, String run, String nombre, boolean administrador) {
        this.id = id;
        this.run = run;
        this.nombre = nombre;
        this.administrador = administrador;
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

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre
               + "Perfil: " + administrador;
    }
    
    
}
