package Modelo;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FacturaDAO {
    
    //Declaro la variable de tipo conexión
    private Conexion con;
    
    //Constructor para instanciar la conexión a la db enviandole un parametro
    public FacturaDAO(Conexion con)
    {
        //Instancio la conexión a la db
        this.con = con;
    }
    
    public boolean registrar(Factura f) throws SQLException
    {
        String sql = "INSERT INTO factura VALUES ("
                + "" + f.getNume_Fact() + ","
                + "" + f.getTota_Fact()+ ","
                + "'" + f.getFech_Fact()+ "',"
                + "'" + f.getObse_Fact()+ "',"
                + "'" + f.getFech_Even()+ "',"
                + "'" + f.getIden_Clie()+ "',"
                + "" + f.getDesc_Fact() + ");";
        
        PreparedStatement pst = con.getConexion().prepareStatement(sql);
        return pst.executeUpdate() > 0;
    }
    
    public Factura max_factura() throws SQLException
    {
        String sql = "SELECT max(Nume_Fact) as numero FROM factura;";
        
        
        Statement sta = con.getConexion().createStatement();
        ResultSet resultado = sta.executeQuery(sql); 
        Factura fac = null;
        
        while(resultado.next())
        {
            long val = resultado.getLong("numero");
            fac = new Factura();
            fac.setNume_Fact(val);
        }
        return fac;
    }
    
    
    
    private Factura Mapear(ResultSet rs) throws SQLException
    {
        Factura fac = new Factura();
        
        fac.setDesc_Fact(rs.getLong("Desc_Fact"));
        fac.setFech_Even(rs.getString("Fech_Even"));
        fac.setFech_Fact(rs.getString("Fech_Fact"));
        fac.setIden_Clie(rs.getString("Iden_Clie"));
        fac.setNume_Fact(rs.getLong("Nume_Fact"));
        fac.setObse_Fact(rs.getString("Obse_Fact"));
        fac.setTota_Fact(rs.getLong("Tota_Fact"));
        
        return fac;
    }
    
}
