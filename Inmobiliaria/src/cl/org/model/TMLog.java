package cl.org.model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMLog implements TableModel {

    private List<Log> logs;

    public TMLog(List<Log> logs) {
        this.logs = logs;
    }

    @Override
    public int getRowCount() {
        return logs.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Registro";
            case 1:
                return "Fecha";
            case 2:
                return "RUN de Usuario";
            default:
                return "Nombre de Usuario";
            
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
        Log reg = logs.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return reg.getRegistro();
            case 1:
                return reg.getFecha();
            case 2:
                return reg.getRun();
            default:
                return reg.getNombre();
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