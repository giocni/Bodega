package Controlador;

//Importo las librerias
import Conexion.Conexion;
import Modelo.Administrador;
import Modelo.AdministradorDAO;
import Vista.PrincipalVista;
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
        
         //Creo el objeto de la clase conexión y el modelo administradorDAO
         con = new Conexion();
         admiDAO = new AdministradorDAO(con);
            
        try
        {
            con.Conectar();
            String mensaje;
            
            //Ejecuto el metodo del modelo y verifico que no tenga valor null
            if(admiDAO.iniciarSesion(admi) != null)
            {
                mensaje = "Bienvenido al sistema";
                PrincipalVista ventana = new PrincipalVista();
                ventana.setVisible(true);
            }
            else
            {
                mensaje = "Lo sentimos, el usuarios no está registrador en la base de datos";
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