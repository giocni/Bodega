package Controlador;

//Importo las librerias
import Conexion.Conexion;
import Modelo.Administrador;
import Modelo.AdministradorDAO;
import java.sql.SQLException;

public class LoginControl {

    AdministradorDAO admiDAO;
    Conexion con;
    
    public String iniciarSesion(Administrador admi)
    {
        if(!campoVacio(admi.getIden_Admi()))
        {
            return "El campo 'Usuario' está vacio, por favor verifique el dato.";
        }
        if(!campoVacio(admi.getPass_Admi()))
        {
            return "El campo 'Contraseña' está vacio, por favor verifique el dato.";
        }
        con = new Conexion();
        admiDAO = new AdministradorDAO(con);
        try
        {
            con.Conectar();
            int mensaje;
            
            if(admiDAO.iniciarSesion(admi) != null)
            {
                mensaje = 1;
            }
            else
            {
                mensaje = 0;
            }
            con.Desconectar();
            return mensaje;
            }catch(SQLException | ClassNotFoundException ex)
            {
                return ex.getMessage();
            }
    }
    
    private boolean campoVacio(String cadena)
    {
        return cadena.trim().length() >0;
    }
}