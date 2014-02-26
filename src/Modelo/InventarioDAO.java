package Modelo;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class InventarioDAO {
    
    private Conexion con;
    
    public InventarioDAO(Conexion con)
    {
        this.con = con;
    }
    
    public boolean registrar(Inventario inv) throws SQLException
    {
        String sql = "INSERT INTO inventario VALUES ("
                + "'" + inv.getNume_Inve() + "',"
                + "'" + inv.getNomb_Inve() + "',"
                + "'" + inv.getDesc_Inve() + "',"
                + "'" + inv.getCant_Inve() + "');";
        
        PreparedStatement pst = con.getConexion().prepareStatement(sql);
        return pst.executeUpdate() > 0;
    }
    
    public ArrayList<Inventario> listaInventario() throws SQLException
    {
        String sql = "SELECT * FROM inventario;";
        ArrayList<Inventario> listaInv = new ArrayList();
        
        Statement sta = con.getConexion().createStatement();
        ResultSet resultado = sta.executeQuery(sql); 
        while(resultado.next())
        {
            listaInv.add(Mapear(resultado));
        }
        return listaInv;
    }
    
    public Inventario buscar(String cod) throws SQLException
    {
        String sql = "SELECT * FROM inventario WHERE nume_inve = '" + cod + "';";
        Inventario inv = null;
        
        Statement sta = con.getConexion().createStatement();
        ResultSet resultado = sta.executeQuery(sql);
        
        while(resultado.next())
        {
            inv = Mapear(resultado);
        }
        return inv;
    }
    
    public boolean eliminar(String cod) throws SQLException
    {
        String sql = "DELETE FROM inventario WHERE nume_inve = '" + cod + "';";
        
        PreparedStatement pst = con.getConexion().prepareStatement(sql);
        return pst.executeUpdate() > 0;
    }
    
    public boolean modificar(Inventario inv,String cod) throws SQLException
    {
        String sql = "UPDATE inventario SET "
                + "nume_inve = '" + inv.getNume_Inve() + "' , "
                + "nomb_inve = '" + inv.getNomb_Inve() + "' , "
                + "desc_inve = '" + inv.getDesc_Inve() + "' , "
                + "cant_inve = '" + inv.getCant_Inve() + "' "
                + "WHERE nume_inve = '" + cod + "';";
        
        PreparedStatement pst = con.getConexion().prepareStatement(sql);
        return pst.executeUpdate() > 0;
    }
    
    public ArrayList<Inventario> listaInventario_filtro(String val) throws SQLException
    {
        String sql = "SELECT * FROM inventario WHERE "
                + "nume_inve LIKE '%" + val + "%' OR "
                + "nomb_inve LIKE '%" + val + "%' OR "
                + "desc_inve LIKE '%" + val + "%' OR "
                + "cant_inve LIKE '%" + val + "%';";
        ArrayList<Inventario> listaInv = new ArrayList();
        
        Statement sta = con.getConexion().createStatement();
        ResultSet resultado = sta.executeQuery(sql); 
        while(resultado.next())
        {
            listaInv.add(Mapear(resultado));
        }
        return listaInv;
    }
    
    public void Reporte_lista_inventario(String nom_reporte,Conexion con) throws JRException, SQLException
    {
        JasperReport reporte;
        JasperPrint reporte_view;
        
        reporte = JasperCompileManager.compileReport(nom_reporte+".jrxml");
        reporte_view= JasperFillManager.fillReport( reporte, null, con.getConexion() );
        JasperViewer.viewReport( reporte_view ); 
        
        con.Desconectar();
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
