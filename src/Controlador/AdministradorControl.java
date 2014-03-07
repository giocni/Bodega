//Controlador del modelo Administrador
package Controlador;

//Importo las librerias
import Conexion.Conexion;
import Modelo.Administrador;
import Modelo.AdministradorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdministradorControl {
    
    //Variables globales
    AdministradorDAO admiDAO;
    Conexion con;
    
    //Metodo para buscar administradores en la base de datos
    public Administrador buscarAdministrador(String cod)
    {
        con     = new Conexion();
        admiDAO = new AdministradorDAO(con);
        Administrador admi = null;
        
        try
        {
            con.getConexion();
            admi = admiDAO.buscarAdministrador(cod);
            con.Desconectar();
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"No se encontró el administrador en la base de datos","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return admi;
        
    }
}