package Vista;

//Importo la librerias a utilizar en el proyecto
import Modelo.Cliente;
import Controlador.ClienteControl;
import Utiles.Metodos;
import javax.swing.JOptionPane;

public class PrincipalVista extends javax.swing.JFrame {

    //Metodo principal del formulario
    public PrincipalVista() {
        
        //Carga todos los componentes del formulario
        initComponents();
        
        //Ubico el formulario en el centro de la ventana
        setLocationRelativeTo(null);
    }
    
    //Variables globales
    Metodos met;
    ClienteControl clieCon;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbCliente = new javax.swing.JButton();
        jbFactura = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbCliente.setText("Clientes");

        jbFactura.setText("Factura");
        jbFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFacturaActionPerformed(evt);
            }
        });

        jButton1.setText("Edición de archivos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jbCliente)
                .addGap(39, 39, 39)
                .addComponent(jbFactura)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCliente)
                    .addComponent(jbFactura)
                    .addComponent(jButton1))
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Código del boton nueva factura
    private void jbFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFacturaActionPerformed
        
        boolean ban = true;
        
        while (ban)
        {
            String val = JOptionPane.showInputDialog(null,"Ingrese el número de identificación del cliente a buscar:","Buscar cliente",JOptionPane.QUESTION_MESSAGE);
            
            if(val != null)
            {
                if(val.compareTo("") == 0)
                {
                    JOptionPane.showMessageDialog(null,"Campo vacio, por favor ingrese un número de identificación valido.","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    clieCon = new ClienteControl();
                    Cliente cli = clieCon.buscarCliente(val);
                    
                    //Si no encontro nigún dato
                    if(cli == null)
                    {
                        //Envio mensaje de error
                        JOptionPane.showMessageDialog(null,"Datos nos encontrados, verifique si el número ingresado es correcto.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        //Creo el objeto de la vista FacturaVista
                        FacturaVista fac = new FacturaVista();
                        
                        //Mando falso para que el ciclo while se termine
                        ban = false;
                        
                        //Le envio a las variables publicas del formulario los datos del cliente seleccionado
                        fac.identificacion = (cli.getIden_Clie());
                        fac.nombre = (cli.getNomb_Clie());
                        fac.apellido = (cli.getApel_Clie());
                        fac.telefono = (cli.getTele_Clie());
                        
                        //Ejecuto el metodo cargar cliente
                        fac.cargarCliente();
                        
                        //Coloco visible el formulario
                        fac.setVisible(true);
                    }
                }
            }
            else
            {
                ban = false;
            }
        }
    }//GEN-LAST:event_jbFacturaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jbCliente;
    private javax.swing.JButton jbFactura;
    // End of variables declaration//GEN-END:variables

    public void visible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
