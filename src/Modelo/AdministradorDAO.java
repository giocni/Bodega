//Clase de la entidad Administrador con sus metodos
package Modelo;

//Importo las librerías
import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AdministradorDAO {
        
    //Declaro la variable
    private Conexion con;
    
    //Constructor para instanciar la conexión a la db
    public AdministradorDAO(Conexion con)
    {
        //Instancio la conexión a la base de datos
        this.con = con;
    }
    
    //Metodo para el inicio de sesión
    public Administrador iniciarSesion(Administrador admi) throws SQLException
    {
            Administrador admin = null;
        
            //Realizo la consulta SQL
            String sql = "SELECT Iden_Admi,Pass_Admi,Nomb_Admi,Apel_Admi "
                 + "FROM administrador "
                 + "WHERE Iden_Admi = '"+ admi.getIden_Admi() +"' AND Pass_Admi = '"+ admi.getPass_Admi() +"';";
            
            //Me conecto a la base de datos y ejecuto la consulta SQL
            Statement s = con.getConexion().createStatement();
            ResultSet rs = s.executeQuery(sql);
            
            int cont = 0;
            while(rs.next())
            {
                admin = Mapear(rs);
                cont++;
            }
            rs.close();
            return admin;
    }
    
    //Metodo para la busqueda de datos
    public Administrador buscarAdministrador(String admi) throws SQLException
    {
        //Realizo la consulta SQl
        String sql = "SELECT * FROM administrador WHERE Iden_Admi = '"+admi+"'";
        
        Administrador admin = null;
        
        Statement sta = con.getConexion().createStatement();
        
        ResultSet resultado = sta.executeQuery(sql);
        
        while(resultado.next())
        {
            admin = Mapear(resultado);
        }
        
        return admin;
    }
    
    //Metodo para listar todos los datos del administrador
    public ArrayList<Administrador>listaAdministrador() throws SQLException
    {
        //Realizo la consulta SQL
        String sql = "SELECT * FROM administrador";
        
        //Instancio un objeto del tipo ArrayList
        ArrayList<Administrador>listaAdmi = new ArrayList();
        
        Statement sta = con.getConexion().createStatement();
        
        //El resultado de la consulta se guarda en la variable resultado
        ResultSet resultado = sta.executeQuery(sql);
        
        //Recorro el objeto de datos
        while(resultado.next())
        {
            //Agrego cada dato al ArrayList
            listaAdmi.add(Mapear(resultado));
        }
        
        //Retorno el valor de la lista de administradores
        return listaAdmi;
    }
    
    private Administrador Mapear(ResultSet rs) throws SQLException
    {
        Administrador admi = new Administrador();
        
        admi.setIden_Admi(rs.getString("Iden_Admi"));
        admi.setNomb_Admi(rs.getString("Nomb_Admi"));
        admi.setApel_Admi(rs.getString("Apel_Admi"));
        admi.setPass_Admi(rs.getString("Pass_Admi"));
        
        return admi;
    }
}