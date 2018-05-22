package cl.org.model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMVenta implements TableModel{
    
    private List<Venta>ventas;
    
    public TMVenta(List<Venta> ventas) {
        this.ventas = ventas;
    }
    
    @Override
    public int getRowCount() {
        return ventas.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
             case 0:
                 return "Fecha";
             case 1:
                 return "Nº Rol";
             case 2:
                 return "Vendedor";

             default:
                 return "Cliente";
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
        Venta ven = ventas.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return ven.getFecha();
            case 1:
                return ven.getIdRol();
            case 2:
                return ven.getIdUsuario();
            default:
                return ven.getIdCliente();
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
