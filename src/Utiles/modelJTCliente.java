package Utiles;

//Importo las librerias
import Modelo.Cliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class modelJTCliente extends AbstractTableModel {
    
    //Creo el array con su columnas
    private String columnNames[] = {"Identificación","Nombre","Apellido","Teléfono"};
    
    //Al arraylist le doy la clase donde obtendrá los datos y le doy su nombre
    ArrayList<Cliente>listaClie;
    
    //Metodo para retornar los datos del objeto
    public ArrayList<Cliente>getLstDatos()
    {
        //Me retorna lo que contiene la lista del objeto
        return listaClie;
    }
    
    //Metodo para darle valor al ArrayList
    public void setLsDatos(ArrayList<Cliente>data)
    {
        this.listaClie = data;
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
        return this.listaClie.size();
    }
    
    //Este metodo me retorna el número de columnas del ArrayList
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    //Falta explicación
    @Override
    public Class getColumnClass(int columnIndex)
    {
        Object value = this.getValueAt(0, columnIndex);
        return (value == null ? Object.class : value.getClass());
    }
    
    //Este metodo me retorna el objeto del cliente seleccionado (solo los datos de ese cliente, NO todos)
    public Cliente getFila(int rowIndex)
    {
        return (Cliente) listaClie.get(rowIndex);
    }
    
    @Override
    public boolean isCellEditable(int rowIndex,int columnIndex)
    {
        return false;
    }
    
    //Metodo para dar los valores a cada campo de la tabla
    @Override
    public void setValueAt(Object value,int rowIndex, int columnIndex)
    {
        Cliente clie = listaClie.get(rowIndex);
        switch(columnIndex)
        {
            case 0:
                clie.setIden_Clie((String) value);
                break;
            case 1:
                clie.setNomb_Clie((String) value);
                break;
            case 2:
                clie.setApel_Clie((String) value);
                break;
            case 3:
                clie.setTele_Clie((String) value);
                break;
        }
    }
    
    //Metodo para retornar los valores de la tabla
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente clie = listaClie.get(rowIndex);
        switch(columnIndex)
        {
            case 0:
                return clie.getIden_Clie();
            case 1:
                return clie.getNomb_Clie();
            case 2:
                return clie.getApel_Clie();
            case 3:
                return clie.getTele_Clie();
        }
        //Si no retorna ninguno de los valores entonces retorna un String vacio
        return new String();
    }
    
}