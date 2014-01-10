package Utiles;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Metodos {
    
    public void Solo_Numeros(JTextField a)
    {
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                if((Character.isLetter(c)))
                {
                   e.consume();
                }
                else
                {
                    if(((int)e.getKeyChar() != KeyEvent.VK_SPACE) && ((int)e.getKeyChar() != 44) && 
                            (((int)e.getKeyChar() < 48) || ((int)e.getKeyChar() > 57)))
                    {
                       e.consume();
                    }
                }
            }
        });
    }
    
    public void Limite_Caracteres(JTextField a,int limite)
    {
        final int limit = limite;
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e)
            {
                JTextField c =(JTextField) e.getComponent();
                if(c.getText().length() == limit)
                {
                    //getToolkit().beep(); //producir un sonido
                    e.consume();
                }  
            }
        });
    }
    
    public boolean Validar_Email (String email) 
    {
        // Establecer el patron
        Pattern p = Pattern.compile("[-\\w\\.]+@\\w+\\.\\w+");

        // Asociar el string al patron
        Matcher m = p.matcher(email);

       // Comprobar si encaja
        boolean estado = m.matches();
        if(!estado)
        {
            JOptionPane.showMessageDialog(null,"El correo electrónico es incorrecto, por favor digite un correo válido "
                    + ", por ejemplo:\n usuario_001@hotmail.com",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
       return estado;
    }
    
    private boolean campo_vacio(String cadena,String campo)
    {
        cadena = cadena.trim();
        if(cadena.compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(null,"El campo '"+campo+"' se encuentra vacio, por favor ingrese un valor en dicho campo.",
                                          "Error",JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }
}
