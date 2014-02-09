//Clase de la entidad cliente con sus metodos
package Modelo;

//Importo las librerias
import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClienteDAO {
    
    //Declaro la variable del tipo Conexion
    private Conexion con;
    
    //Constructor para instanciar la conexión a la db enviandole un parametro
    public ClienteDAO(Conexion con)
    {
        //Instancio la conexión a la db
        this.con = con;
    }
    
    //Metodo para guardar clientes en la base de datos
    public boolean registrarCliente(Cliente clie) throws SQLException
    {
        //Realizo la consulta SQL
        String sql = "INSERT INTO cliente (Iden_Clie,Nomb_Clie,Apel_Clie,Tele_Clie)"
                   + "VALUES ('"+clie.getIden_Clie()+"','"+clie.getNomb_Clie()+"','"+clie.getApel_Clie()+"','"+clie.getTele_Clie()+"')";
        
        //Me conecto a la db y ejecuto la consulta SQL
        PreparedStatement pst = con.getConexion().prepareStatement(sql);
        
        //Si se ingresó datos a la consulta sql retorna true ( > 0) sino retorna false
        return pst.executeUpdate() > 0;
    }
    
    //Metodo para eliminar clientes de la base de datos
    public boolean eliminarCliente(Cliente clie) throws SQLException
    {
        //Realizo la consulta SQL
        String sql = "DELETE FROM cliente WHERE Iden_Clie = '"+clie.getIden_Clie()+"'";
        
        //Me conecto a la db y ejecuto la consulta SQL
        PreparedStatement pst = con.getConexion().prepareStatement(sql);
        
        //Retorno el valor de la consulta
        return pst.executeUpdate() > 0;
    }
    
    //Metodo para buscar un cliente en la base de datos
    public Cliente bucarCliente(String clie) throws SQLException
    {
        //Realizo la consulta SQL
        String sql = "SELECT * FROM cliente WHERE Iden_Clie = '"+clie+"';";
        
        Cliente clien = null;
        
        Statement sta = con.getConexion().createStatement();
        ResultSet resultado = sta.executeQuery(sql);
        
        while(resultado.next())
        {
            clien = Mapear(resultado);
        }
        return clien;
    }
    
    //Metodo para modificar los datos de un cliente existente en la base de datos
    public boolean modificarCliente(Cliente clie,String cedula) throws SQLException
    {   
        //Realizo la consulta SQL
        String sql = "UPDATE cliente SET Iden_Clie = '"+clie.getIden_Clie()+"', Nomb_Clie = '"+clie.getNomb_Clie()+"', Apel_Clie = '"+clie.getApel_Clie()+"',\n" +
                     "Tele_Clie = '"+clie.getTele_Clie()+"' WHERE Iden_Clie = "+cedula+"";
        
        //Me conecto a la db y ejecuto la consulta SQL
        PreparedStatement pst = con.getConexion().prepareStatement(sql);
        
        return pst.executeUpdate() > 0;
    }
    
    //Metodo para listar todos los datos de los clientes
    public ArrayList<Cliente>listaCliente() throws SQLException
    {
        //Realizo la consulta SQL
        String sql = "SELECT * FROM cliente";
        
        //Creo un objeto de ArrayList
        ArrayList<Cliente>listaClie = new ArrayList();
        
        Statement sta = con.getConexion().createStatement();
        
        //El resultado de la consulta se guarda en la variable resultado
        ResultSet resultado = sta.executeQuery(sql);
        
        //Recorro el objeto de datos
        while(resultado.next())
        {
            //Agrego cada dato al ArrayList
            listaClie.add(Mapear(resultado));
        }
        //Retorno el valor de la lista de clientes
        return listaClie;
    }
    
    private Cliente Mapear(ResultSet rs)throws SQLException
    {
        Cliente clie = new Cliente();
        
        clie.setIden_Clie(rs.getString("Iden_Clie"));
        clie.setNomb_Clie(rs.getString("Nomb_Clie"));
        clie.setApel_Clie(rs.getString("Apel_Clie"));
        clie.setTele_Clie(rs.getString("Tele_Clie"));
        
        //Retorno el valor del objeto
        return clie;
    }
}