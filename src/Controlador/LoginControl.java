package Controlador;

//Importo las librerias
import Conexion.Conexion;
import Modelo.Administrador;
import Modelo.AdministradorDAO;
import Vista.PrincipalVista;
import java.sql.SQLException;

public class LoginControl {

    AdministradorDAO admiDAO;
    Administrador a;
    Conexion con;
    public boolean t = false;
     
    public String iniciarSesion(Administrador admin)
    { 
        if(!campoVacio(admin.getIden_Admi()))
        {
            return "El campo 'Usuario' está vacio, por favor verifique sus datos.";
        }
         if(!campoVacio(admin.getPass_Admi()))
        {
            return "El campo 'Contraseña' está vacio, por favor verifique sus datos.";
        }
         
        con = new Conexion();
        admiDAO = new AdministradorDAO(con);
       
        
        try
        {
            System.out.println("antes");
            con.Conectar();
            System.out.println("despues");
            String mensaje;
            
            if(admiDAO.iniciarSesion(admin) != null)
            {
                mensaje = "Bienvenido al sistema";
                
                PrincipalVista p = new PrincipalVista();
                
                p.setVisible(true);
                
                LoginControl l = new  LoginControl();
                t = true;
                
            }
            else
            {
                mensaje = "Lo sentimos, los datos no son correctos o usted no está registrado en el sistema.";
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