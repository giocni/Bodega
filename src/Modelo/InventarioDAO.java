package Modelo;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InventarioDAO {
    
    private Conexion con;
    
    public InventarioDAO(Conexion con)
    {
        this.con = con;
    }
    
    
    
    
    private Inventario Mapear(ResultSet rs) throws SQLException
    {
        Inventario inve = new Inventario();
        
        inve.setNume_Inve(rs.getString("Nume_Inve"));
        inve.setNomb_Inve(rs.getString("Nomb_Inve"));
        inve.setDesc_Inve(rs.getString("Desc_Inve"));
        inve.setCant_Inve(rs.getLong("Cant_Inve"));
        
        return inve;
    }
    
}
