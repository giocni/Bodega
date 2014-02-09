package Utiles;

//Importo las librerias
import Modelo.Detalle;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class modelJTDetalle extends AbstractTableModel {
    
    //Creo el array con sus columnas
    private String columnNames[] = {"Articulo","Descripción","Cantidad","Valor unitario","Valor total"};
    
    //Al arrayList le doy la clase donde obtendrá los datos y le doy su nombre
    ArrayList<Detalle>listaDeta;
    
    //Metodo para retornar los datos del objeto
    public ArrayList<Detalle>getLstDatos()
    {
        //Me retorna lo que contiene la lista del objeto
        return listaDeta;
    }
    
    //Metodo para darle valor al ArrayList
    public void setLsDatos(ArrayList<Detalle>data)
    {
        this.listaDeta = data;
    }
    
    //Este metodo retorna el nombre de la columna del ArrayList
    @Override
    public String getColumnName(int colmnIdex)
    {
        return columnNames[colmnIdex];
    }
    
    //Este metodo me retorna el número de filas del ArrayList
    @Override
    public int getRowCount()
    {
        return this.listaDeta.size();
    }
    
    //Este metodo me retorna el número de columnas del ArrayList
    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }
    
    //Falta explicación
    @Override
    public Class getColumnClass(int columnIndex)
    {
        Object value = this.getValueAt(0, columnIndex);
        return (value == null ? Object.class : value.getClass());
    } 
    
    //Este metodo me retorna el objeto del articulo seleccionado (solo los datos de ese cliente, No todos)
    public Detalle getFila(int rowIndex)
    {
        return (Detalle) listaDeta.get(rowIndex);
    }
    
    @Override
    public boolean isCellEditable(int rowIndex,int columnIndex)
    {
        return false;
    }
    
    //Metodo para dar los valores a cada campo de la tabla
    public void setValueAt(Object value, int rowIndex, int columnIndex)
    {
        Detalle deta = listaDeta.get(rowIndex);
        switch(columnIndex)
        {
            case 0:
                deta.setNomb_Deta((String) value);
                break;
            case 1:
                deta.setDesc_Deta((String) value);
                break;
            case 2:
                deta.setCant_Deta((String )value);
                break;
            case 3:
                deta.setValo_Deta((String) value);
                break;
        }
    }
    
    //Metodo para retornar los valores de la tabla
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Detalle deta = listaDeta.get(rowIndex);
        switch(columnIndex)
        {
            case 0:
                return deta.getNomb_Deta();
            case 1:
                return deta.getDesc_Deta();
            case 2:
                return deta.getCant_Deta();
            case 3:
                return deta.getValo_Deta();
        }
        
        //Si no retorna ninguno de los valores entonces retorna un String vacio
        return new String();
    }
}