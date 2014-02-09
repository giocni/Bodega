//Controlador del modelo Dtalle
package Controlador;

//Importo las librerias
import Conexion.Conexion;
import Modelo.Detalle;
import Modelo.DetalleDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DetalleControl {
    
    DetalleDAO deta;
    Conexion con;
    
    //Metodo para insertar cada detalle de la factura
    public boolean insertarDetalle(Detalle det)
    {
        //Creo los objetos
        con = new Conexion();
        deta = new DetalleDAO(con);
        boolean resultado = false;
        
        try
        {
            //Me conecto a la base de datos
            con.Conectar();
            
            //Ejecuto el metodo insertar del modelo DetalleDAO y le envio el parametro del metodo
            if(deta.insertarDetalle(det))
            {
                //Envio mensaje de exito al guardar datos
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
                
                //Retorno TRUE
                resultado = true;
            }
        }catch(ClassNotFoundException | SQLException e)
        {
            //Envio mensaje de excepción
            JOptionPane.showMessageDialog(null,"El articulo ya se ingresó anteriormente, verifica los datos ingresados\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        //Retorno el valor de la variable resultado
        return resultado;
    }
    
    //Metodo para listar detalles en la grilla
    public ArrayList<Detalle>listaDetalle()
    {
        //Creo los objetos
        con = new Conexion();
        deta = new DetalleDAO(con);
        
        //Variable del tipo ArrayList con el valor null como inicial
        ArrayList<Detalle>listaDeta = null;
        
        try
        {
            //Me conecto a la base de datos
            con.Conectar();
            
            //Ingreso al metodo listaDetalle del modelo DetalleDAO
            listaDeta = deta.listaDetalle();
            
            //Me desconecto de la base de datos
            con.Desconectar();
        }catch(ClassNotFoundException | SQLException e)
        {
            //Envio mensaje de error
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR);
        }
        
        //Retorno el valor de la lista del objeto
        return listaDeta;
    }
}