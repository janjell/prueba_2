package cl.org.model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMVivienda implements TableModel{

    private List<Vivienda>viviendas;
    
    public TMVivienda(List<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }

    @Override
    public int getRowCount() {
        return viviendas.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Nº Rol";
            case 1:
                return "Dirección";

            case 2:
                return "Cantidad de Piezas";

            case 3:
                return "Cantidad de Baños";

            case 4:
                return "Tipo Vivienda";
            case 5:
                return "Valor";
            default:
                return "Nueva";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Vivienda v = viviendas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return v.getnDeRol();
            case 1:
                return v.getDireccion();

            case 2:
                return v.getCantPiezas();

            case 3:
                return v.getCantBanos();

            case 4:
                if(v.getTipoVivienda() == 1){
                    return "Casa";
                }else{
                    return "Departamento";
                }
                
            case 5:
                return v.getPrecio();
            default:
                if(v.isNuevo() == true){
                    return "Nueva";
                }else{
                    return "Usada";
                }

        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    
    
}
