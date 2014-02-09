//Controlador del modelo cliente
package Controlador;

//Importo las librerias
import Conexion.Conexion;
import Modelo.Cliente;
import Modelo.ClienteDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteControl {
    
    ClienteDAO clie;
    Conexion con;
    
    //Metodo para el registro de clientes
    public boolean registrarCliente(Cliente clien)
    {
        //Creo los objetos
        con = new Conexion();
        clie = new ClienteDAO(con);
        boolean resultado = false;
        
        try
        {
            //Me conecto a la base de datos
            con.Conectar();
                    
            //Ejecuto el metodo registrar el modelo ClienteDAO y le envio el parametro del metodo
            if(clie.registrarCliente(clien))
            {
                //Envio mensaje de exito al guardar datos
                JOptionPane.showMessageDialog(null, "Guardado correctamente","¡ Bien !", JOptionPane.INFORMATION_MESSAGE);
                
                //Retorno true
                resultado = true;
            }
        }catch(ClassNotFoundException | SQLException e)
        {
            //Envio mensaje de excepción
            JOptionPane.showMessageDialog(null,"El cliente ya se encuentra registrado en el sistema, verifique los datos ingresados\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        //Retorno el valor de la variable resultado
        return resultado;
    }
    
    //Metodo para eliminar cliente de la base de datos
    public boolean eliminarCliente(Cliente clien)
    {
        //Creo los objetos
        con = new Conexion();
        clie = new ClienteDAO(con);
        boolean resultado = false;
        
        try
        {
            //Me conecto a la base de datos
            con.Conectar();
            
            //Ejecuto el metodo eliminarCliente del modelo ClienteDAO y le envio el parametro del metodo
            if(clie.eliminarCliente(clien))
            {
                //Envio mensaje de exito al eliminar los datos
                JOptionPane.showMessageDialog(null,"Eliminado correctamente","¡ Bien !",JOptionPane.INFORMATION_MESSAGE);
                
                //Retorno true
                resultado = true;
            }
        }catch(ClassNotFoundException | SQLException e)
        {
            //Envio mensaje de excepción
            JOptionPane.showMessageDialog(null,"El cliente ya no está en la base de datos","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        //Retorno el valor de la variable resultado
        return resultado;
    }
    
    //Metodo para buscar un cliente en la base de datos
    public Cliente buscarCliente(String cod)
    {
        con = new Conexion();
        clie = new ClienteDAO(con);
        Cliente clien = null;
        
        try
        {
            con.Conectar();
            clien = clie.bucarCliente(cod);
            con.Desconectar();
            
        }catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"No se encontró el cliente en la base de datos, verifique la información ingresada","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        //Retorno e valor de la consulta
        return clien;
    }
    
    //Metodo para modificar clientes de una base de datos
    public boolean modificarCliente(Cliente clien,String cedula)
    {
        //Creo los objetos
        con = new Conexion();
        clie = new ClienteDAO(con);
        boolean resultado = false;
        
        try
        {
            //Me conecto a la base de datos
            con.Conectar();
            
            //Ejecuto el metodo modificar del modelo ClienteDAO y le envio el parametro del metodo
            if(clie.modificarCliente(clien,cedula))
            {
                //Envio mensaje de exito al guardar datos
                JOptionPane.showMessageDialog(null, "Modificado correctamente","! Bien !",JOptionPane.INFORMATION_MESSAGE);
                
                //Retorno true
                resultado = true;
            }
        }catch(ClassNotFoundException | SQLException e)
        {
            //Envio mensaje de excepción
            JOptionPane.showMessageDialog(null,"El cliente no se pudo modificar, vuelva a intertalo mas adelante\n"
                                         + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        //Retorno el valor de la variable resultado
        return resultado;
    }
    
    //Metodo para listar clientes en la grilla
    public ArrayList<Cliente>listaCliente()
    {
        //Creo los objetos
        con = new Conexion();
        clie = new ClienteDAO(con);
        
        //Variable del tipo ArrayList con valor null como inicial
        ArrayList<Cliente> listaClie = null;
        
        try
        {
            //Me conecto a la base de datos
            con.Conectar();
            
            //Ingreso al metodo listaCliente del modelo ClienteDAO
            listaClie = clie.listaCliente();
            
            //Me desconecto de la base de datos
            con.Desconectar();
        }catch(ClassNotFoundException | SQLException e)
        {
            //Envio mensaje de error
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        //Retorno el valor de la lista del objeto
        return listaClie;
    }
}