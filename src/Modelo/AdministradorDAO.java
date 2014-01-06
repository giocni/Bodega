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
    public Administrador iniciarSesion(Administrador adm) throws SQLException
    {
        Administrador admin = null;
        
            //Realizo la consulta SQL
            String sql = "SELECT Iden_Admi,Pass_Admi,Nomb_Admi,Apel_Admi "
                 + "FROM administrador "
                 + "WHERE Iden_Admi = '"+ admin.getIden_Admi() +"' AND Pass_Admi = '"+ admin.getPass_Admi() +"';";
            
            //Me conecto a la base de datos y ejecuto la consulta SQL
            Statement s = con.getConexion().createStatement();
            ResultSet rs = s.executeQuery(sql);
            
            int cont = 0;
            while(rs.next())
            {
                admin = Mapear(rs,cont);
                cont++;
            }
            rs.close();
            return admin;
    }
    
    private Administrador Mapear(ResultSet rs, int cont) throws SQLException
    {
        Administrador admi = new Administrador();
        
        admi.setIden_Admi(rs.getString("Iden_Admi"));
        admi.setNomb_Admi(rs.getString("Nomb_Admi"));
        admi.setApel_Admi(rs.getString("Apel_Admi"));
        admi.setPass_Admi(rs.getString("Pass_Admi"));
        
        return admi;
    }
}