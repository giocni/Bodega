package Utiles;

import Modelo.Inventario;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class modelJTInventario extends AbstractTableModel{
    
    private String columnNames[] = {"Número / Código","Nombre del producto","Descripción","Cantidad"};
    ArrayList<Inventario> listaInve;
    
    public ArrayList<Inventario> getLstDatos()
    {
        return listaInve;
    }
    
    public void setLstDatos(ArrayList<Inventario> data)
    {
        this.listaInve = data;
    }
    
    @Override
    public String getColumnName(int colmnIdex)
    {
        return columnNames[colmnIdex];
    }
    
    @Override
    public int getRowCount() 
    {
        return this.listaInve.size();
    }

    @Override
    public int getColumnCount() 
    {
        return columnNames.length;
    }
    
    @Override
    public Class getColumnClass(int columnIndex)
    {
        Object value = this.getValueAt(0, columnIndex);
        return (value == null ? Object.class : value.getClass());
    }
    
    public Inventario getFila(int rowIndex)
    {
        return (Inventario) listaInve.get(rowIndex);
    }
    
    @Override
    public boolean isCellEditable(int rowIndex,int columnIndex)
    {
        return false;
    }
    
    @Override
    public void setValueAt(Object value,int rowIndex, int columnIndex)
    {
        Inventario inve = listaInve.get(rowIndex);
        switch(columnIndex)
        {
            case 0:
                inve.setNume_Inve((String) value);
                break;
            case 1:
                inve.setNomb_Inve((String)value);
                break;
            case 2:
                inve.setDesc_Inve((String)value);
                break;
            case 3:
                inve.setCant_Inve(Long.parseLong((String)value));
                break;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Inventario inve = listaInve.get(rowIndex);
        switch(columnIndex)
        {
            case 0:
                return inve.getNume_Inve();
            case 1:
                return inve.getNomb_Inve();
            case 2:
                return inve.getDesc_Inve();
            case 3:
                return inve.getCant_Inve();
        }
        return new String();
    }
    
}
