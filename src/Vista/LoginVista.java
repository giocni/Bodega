//Esta es la vista del inicio de sesión de usuario
package Vista;

//Importo las librerias
import Controlador.LoginControl;
import Modelo.Administrador;
import Utiles.Metodos;
import javax.swing.JOptionPane;

//Para la parte gráfica del proyecto
import org.jvnet.substance.SubstanceLookAndFeel;

public class LoginVista extends javax.swing.JFrame {
    
    //Variable del tipo LoginControl y Metodod
    LoginControl login;
    Metodos met;
   
    
    public LoginVista() {
        initComponents();
        met = new Metodos();
        
        setResizable(false);
        
        met.Solo_Numeros(txtUsuario);
        met.Limite_Caracteres(txtUsuario, 15);
        met.Limite_Caracteres(txtpassword, 16);
        
        //Ubico el formulario en el centro de la pantalla
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JToggleButton();
        lblNombreDeUsuario = new javax.swing.JLabel();
        lblPasswordDeUsuario = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombreDeUsuario1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setName("frmLogin"); // NOI18N

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnIniciarSesion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIniciarSesion.setText("Entrar");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        lblNombreDeUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNombreDeUsuario.setText("Usuario:");

        lblPasswordDeUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPasswordDeUsuario.setText("Contraseña:");

        txtpassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblNombreDeUsuario1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblNombreDeUsuario1.setText("INICIAR SESIÓN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblNombreDeUsuario1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNombreDeUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPasswordDeUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblNombreDeUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreDeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPasswordDeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Código del boton iniciarSesión
    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
       
        login = new LoginControl();
        Administrador admin = new Administrador();
        
        admin.setIden_Admi(txtUsuario.getText());
        admin.setPass_Admi(txtpassword.getText());
   
        JOptionPane.showMessageDialog(null,login.iniciarSesion(admin));
        
        if(login.t == true)
        {
            String m = admin.getIden_Admi();
            AdministradorVista p = new AdministradorVista();
            p.setIden_Admi(m);
            
            dispose();
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    public void limpiar()
    {
        txtUsuario.setText("");
        txtpassword.setText("");
        
        txtUsuario.requestFocus();
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                //Agrego el tema
                PrincipalVista.setDefaultLookAndFeelDecorated(true);
                
                //Agrego el skin a mi proyecto
                SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.ModerateSkin");
                
                //Agrego el tema a mi proyecto
                SubstanceLookAndFeel.setCurrentTheme( "org.jvnet.substance.theme.SubstanceSteelBlueTheme");
                
                //Visibilidad de la página TRUE
                new LoginVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnIniciarSesion;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNombreDeUsuario;
    private javax.swing.JLabel lblNombreDeUsuario1;
    private javax.swing.JLabel lblPasswordDeUsuario;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}