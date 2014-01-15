package Controlador;

import Conexion.Conexion;
import Modelo.Inventario;
import Modelo.InventarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InventarioControl {
    
    InventarioDAO invDAO;
    Conexion con;
    
    public boolean registrar(Inventario inv)
    {
        con = new Conexion();
        invDAO = new InventarioDAO(con);
        boolean resultado = false;
        
        try {
            con.Conectar();
            if(invDAO.registrar(inv))
            {
                JOptionPane.showMessageDialog(null,"Guardado correctamente","¡ Bien !",JOptionPane.INFORMATION_MESSAGE);
                resultado = true;
            }
            con.Desconectar();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"El articulo ya se encuentra registrado, verifique el código del producto\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }
    
    public ArrayList<Inventario> listaInventario()
    {
        con = new Conexion();
        invDAO = new InventarioDAO(con);
        ArrayList<Inventario> listaInv = null;
        
        try {
            con.Conectar();
            listaInv = invDAO.listaInventario();
            con.Desconectar();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        return listaInv;
    }
    
    public Inventario buscar(String cod)
    {
        con = new Conexion();
        invDAO = new InventarioDAO(con);
        Inventario inv = null;
        try {
            con.Conectar();
            inv= invDAO.buscar(cod);
            con.Desconectar();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return inv;
    }
    
    public boolean eliminar(String cod)
    {
        con = new Conexion();
        invDAO = new InventarioDAO(con);
        boolean resultado = false;
        
        try {
            con.Conectar();
            if(invDAO.eliminar(cod))
            {
                JOptionPane.showMessageDialog(null,"Eliminado correctamente","¡ Bien !",JOptionPane.INFORMATION_MESSAGE);
                resultado = true;
            }
            con.Desconectar();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"No se puede completar la operación, intente mas tarde.\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
        
    }
    
    public boolean modificar(Inventario inv,String cod)
    {
        con = new Conexion();
        invDAO = new InventarioDAO(con);
        boolean resultado = false;
        
        try {
            con.Conectar();
            if(invDAO.modificar(inv,cod))
            {
                JOptionPane.showMessageDialog(null,"Modificado correctamente","¡ Bien !",JOptionPane.INFORMATION_MESSAGE);
                resultado = true;
            }
            con.Desconectar();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"El articulo ya se encuentra registrado, verifique el código del producto\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }
    
    public ArrayList<Inventario> listaInventario_filtro(String val)
    {
        con = new Conexion();
        invDAO = new InventarioDAO(con);
        ArrayList<Inventario> listaInv = null;
        
        try {
            con.Conectar();
            listaInv = invDAO.listaInventario_filtro(val);
            con.Desconectar();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        return listaInv;
    }
    
}
