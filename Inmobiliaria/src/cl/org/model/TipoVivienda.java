package cl.org.model;

public class TipoVivienda {

    private int id;
    private String tipo;

    public TipoVivienda() {
    }

    public TipoVivienda(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TipoVivienda{" + "id=" + id + ", tipo=" + tipo + '}';
    }
}
