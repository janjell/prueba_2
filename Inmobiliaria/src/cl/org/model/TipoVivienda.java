package cl.org.model;

public class TipoVivienda {

    private int id;
    private boolean casa;

    public TipoVivienda() {
    }

    public TipoVivienda(int id, boolean casa) {
        this.id = id;
        this.casa = casa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCasa() {
        return casa;
    }

    public void setCasa(boolean casa) {
        this.casa = casa;
    }

    @Override
    public String toString() {
        return "TipoVivienda{" + "id=" + id + ", casa=" + casa + '}';
    }

}
