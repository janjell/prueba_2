package cl.org.model;

public class Vivienda {
    
    private int nDeRol;
    private String direccion;
    private int estado;
    private int cantPiezas;
    private int cantBanos;
    private int tipoVivienda;
    private int precio;
    private boolean nuevo;

    public Vivienda() {
    }

    public Vivienda(int nDeRol, String direccion, int estado, int cantPiezas, int cantBanos, int tipoVivienda, int precio, boolean nuevo) {
        this.nDeRol = nDeRol;
        this.direccion = direccion;
        this.estado = estado;
        this.cantPiezas = cantPiezas;
        this.cantBanos = cantBanos;
        this.tipoVivienda = tipoVivienda;
        this.precio = precio;
        this.nuevo = nuevo;
    }

    public int getnDeRol() {
        return nDeRol;
    }

    public void setnDeRol(int nDeRol) {
        this.nDeRol = nDeRol;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCantPiezas() {
        return cantPiezas;
    }

    public void setCantPiezas(int cantPiezas) {
        this.cantPiezas = cantPiezas;
    }

    public int getCantBanos() {
        return cantBanos;
    }

    public void setCantBanos(int cantBanos) {
        this.cantBanos = cantBanos;
    }

    public int getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(int tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    @Override
    public String toString() {
        return direccion;
    }
    
//    @Override
//    public String toString() {
//        return "Vivienda{" + "nDeRol=" + nDeRol + ", direccion=" + direccion + ", estado=" + estado + ", cantPiezas=" + cantPiezas + ", cantBanos=" + cantBanos + ", tipoVivienda=" + tipoVivienda + ", precio=" + precio + ", nuevo=" + nuevo + '}';
//    } 
    
}