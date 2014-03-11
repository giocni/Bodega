package Controlador;

import Conexion.Conexion;
import Modelo.Factura;
import Modelo.FacturaDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FacturaControl {
    
    FacturaDAO fac;
    Conexion con;
    
    public boolean registrar(Factura f)
    {
        con = new Conexion();
        fac = new FacturaDAO(con);
        boolean resultado = false;
        try {
            con.Conectar();
            if(fac.registrar(f))
            {
                
                resultado = true;
            }
            con.Desconectar();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al registrar factura\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            resultado = false;
        }
        return resultado;
    }
    
    public long max_factura()
    {
        con = new Conexion();
        fac = new FacturaDAO(con);
        long max = 0;
        try {
            con.Conectar();
            Factura f = fac.max_factura();
            max = f.getNume_Fact();
            con.Desconectar();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return max;
    }
    
    
}
