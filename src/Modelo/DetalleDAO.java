//Clase de la entidad Detalle con sus metodos
package Modelo;

//Importo las lirerias
import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DetalleDAO {
    
    //Declaro la variable de tipo conexión
    private Conexion con;
    
    //Constructor para instanciar la conexión a la db enviandole un parametro
    public DetalleDAO(Conexion con)
    {
        //Instancio la conexión a la db
        this.con = con;
    }
    
    //Metodo para guardar los detalles en la base de datos
    public boolean insertarDetalle(Detalle deta) throws SQLException
    {
        //Realizo la consulta SQL
        String sql = "INSERT INTO detalle (Nomb_Deta,Desc_Deta,Cant_Deta,Valo_Deta,Nume_Fact)"
                   +  "VALUES ('"+deta.getNomb_Deta()+"','"+deta.getDesc_Deta()+"','"+deta.getCant_Deta()+"','"+deta.getValo_Deta()+"','"+deta.getNume_Fact()+"');";
        
        //Me conecto a la db y ejecuto la consult SQL
        PreparedStatement pst = con.getConexion().prepareStatement(sql);
        
        //Me retorna TRUE si la consulta tiene datos ingresados (> 0) sino retorna FALSE
        return pst.executeUpdate() > 0;
    }
    
    //Metodo para eliminar los detalles de la base de datos
    public boolean eliminarDetalle(Detalle deta) throws SQLException
    {
        //Realizo la consulta SQL
        String sql = "DELETE FROM detalle WHERE Nume_Deta = '"+deta.getNume_Deta()+"';";
        
        //Me conecto a la db y ejecuto la consulta SQL
        PreparedStatement pst = con.getConexion().prepareStatement(sql);
        
        //Retorno el valor de la consulta
        return pst.executeUpdate() > 0;
    }
    
    //Metodo para modificar los datos de un detalle existente en la base de datos
    public boolean modificarDetalle(Detalle deta) throws SQLException
    {
        //Realizo la consulta SQL
        String sql = "UPDATE detalle"
                   + "SET Nomb_Deta = '"+deta.getNomb_Deta()+"', Desc_Deta = '"+deta.getDesc_Deta()+"', Cant_Deta = '"+deta.getCant_Deta()+"', Valo_Deta = '"+deta.getValo_Deta()+"'"
                   + "WHERE Nume_Deta = '"+deta.getNume_Deta()+"';";
        
        //Me conecto a la base de datos y ejecuto la consulta SQL
        PreparedStatement pst = con.getConexion().prepareStatement(sql);
        
        return pst.executeUpdate() > 0;
    }
    
    //Metodo para listar todos los datos de los detalles
    public ArrayList<Detalle>listaDetalle() throws SQLException
    {
        //Realizo la consulta SQL
        String sql = "SELECT * FROM detalle";
        
        //Creo un objeto de ArrayList
        ArrayList<Detalle>listaDeta = new ArrayList();
        
        Statement sta = con.getConexion().createStatement();
        
        //El resultado de la consulta se guarda en la variable resultado
        ResultSet resultado = sta.executeQuery(sql);
        
        //Recorro el objeto de datos
        while(resultado.next())
        {
            //Agrego cada dato al ArrayList
            listaDeta.add(Mapear(resultado));
        }
        
        //Retorno el valor de la lista de detalles
        return listaDeta;
    }
    
    //Metodo para mapear
    private Detalle Mapear(ResultSet rs) throws SQLException
    {
        Detalle deta = new Detalle();
        
        deta.setNomb_Deta(rs.getString("Nomb_Deta"));
        deta.setDesc_Deta(rs.getString("Desc_Deta"));
        deta.setCant_Deta(rs.getString("Cant_Deta"));
        deta.setValo_Deta(rs.getString("Valo_Deta"));
        
        //Retorno el valor del objeto
        return deta;
    }
}