package cl.org.model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMTop implements TableModel {

    private List<VistaTop> ventas;

    public TMTop(List<VistaTop> ventas) {
        this.ventas = ventas;
    }

    @Override
    public int getRowCount() {
        return ventas.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Fecha";
            case 1:
                return "Nombre";
            default:
                return "Vacio";
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
        VistaTop top = ventas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return top.getFecha();
            case 1:
                return top.getNombre();
            default:
                return null;
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
