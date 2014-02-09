//Vista del Modelo y Control Cliente
package Vista;

//Importo las librerias a utilizar
import Controlador.ClienteControl;
import Modelo.Cliente;
import Utiles.Metodos;
import Utiles.modelJTCliente;
import javax.swing.JOptionPane;

public class ClienteVista extends javax.swing.JFrame {

    //Metodo principal del formulario
    public ClienteVista() {
        
        //Carga todos los componentes del formulario
        initComponents();
        
        //Utilizo el metodo habilitar
        habilitar(true);
       
        //Ubico el formulario en el centro de la pantalla
        setLocationRelativeTo(null);
        
        //Creo el objeto del modelo Metodos
        met = new Metodos();
        
        //Accedo al metodo Limite_Caracteres para cada JTextBox
        met.Limite_Caracteres(txtIdentificacion, 15);
        met.Limite_Caracteres(txtNombre, 30);
        met.Limite_Caracteres(txtApellido, 30);
        met.Limite_Caracteres(txtTelefono, 15);
        
        //Al campo número de identificación y de teléfono le apruebo que solo se ingrese números
        met.Solo_Numeros(txtIdentificacion);
        met.Solo_Numeros(txtTelefono);
        
        //Cargo la grilla de clientes
        cargar_tabla();
    }
    
    //Declaro las variables de las clases
    Metodos met;
    ClienteControl clie;
    modelJTCliente modelClie;
    String cedula;

    //Metodo inhabilitar JButton y JTextBox
    private void habilitar(Boolean resp)
    {
            //Mando el focus
            txtIdentificacion.requestFocus();
            
            //Deshabilito los JTextBox
            txtIdentificacion.setEnabled(!resp);
            txtNombre.setEnabled(!resp);
            txtApellido.setEnabled(!resp);
            txtTelefono.setEnabled(!resp);
        
            //Deshabilito los JButton
            btnRegistrar.setEnabled(!resp);
            btnCancelar.setEnabled(!resp);
            btnNuevo.setEnabled(resp);
            btnBuscar.setEnabled(resp);
            btnModificar.setEnabled(!resp);
            btnEliminar.setEnabled(!resp);
            btnLimpiar.setEnabled(!resp); 
    }
    
    //Metodo para limpiar los TextBox
    private void limpiar()
    {
        txtIdentificacion.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtTelefono.setText(null);
        txtIdentificacion.requestFocus();
    }
    
    //Metodo para cargar la grilla de clientes
    private void cargar_tabla()
    {
        //Creo el objeto
        modelClie = new modelJTCliente();
        clie = new ClienteControl();
        
        /*Ejecuto el metodo setLsDatos del modelo modelJTCliente
          y le envio como parametro el array de datos listaCliente*/
        modelClie.setLsDatos(clie.listaCliente());
        
        //Cargo los datos a la grilla
        TablaClie.setModel(modelClie);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClie = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Identificación:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Teléfono:");

        btnRegistrar.setText("Guardar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        TablaClie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaClie);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdentificacion)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnBuscar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnModificar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnEliminar))
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Código del botón ingresar clientes
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        //Verifico que los campos estén vacio
        if(!met.campo_vacio(txtIdentificacion, "Identificación"))
        {
            if(!met.campo_vacio(txtNombre, "Nombre"))
            {
                if(!met.campo_vacio(txtApellido, "Apellido"))
                {
                    if(!met.campo_vacio(txtTelefono, "Teléfono"))
                    {
                        //Creo el objeto del modelo Cliente y controlador ClienteControl
                        Cliente clien = new Cliente();
                        clie = new ClienteControl();
                        
                        //Accedo a los metodos SET del modelo Cliente y les envio el valor de los txt por parametro
                        clien.setIden_Clie(txtIdentificacion.getText().trim());
                        clien.setNomb_Clie(txtNombre.getText().trim());
                        clien.setApel_Clie(txtApellido.getText().trim());
                        clien.setTele_Clie(txtTelefono.getText().trim());
                        
                        //Si el metodo devuelve true
                        if(clie.registrarCliente(clien))
                        {
                            //Limpio las cajas de texto
                            limpiar();
                            
                            habilitar(true);
                            
                            //Cargo los datos ingresados en la grilla
                            cargar_tabla();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    //Código para el botón nuevo
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        
        //Limpio las cajas de texto
        limpiar();
        
        //Mando valor true al metodo habilitar, false = Habilita las cajas de texto
        habilitar(false);
        
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed
    
    //Código para el boton cancelar
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        limpiar();
        
        habilitar(true);
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    //Código para el botón eliminar
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        //Creo el objeto del modelo Cliente y controlador ClienteDAO
        Cliente clien = new Cliente();
        clie = new ClienteControl();
                        
        //Accedo a los metodos SET del modelo Cliente y les envio el valor del txt por parametro
        clien.setIden_Clie(txtIdentificacion.getText().trim()); 
                    
        //Le pregunto al administrador si está seguro de eliminar al cliente seleccionado
        int op = JOptionPane.showConfirmDialog(null,"Esta seguro de eliminar el cliente del sistema ?","Eliminar",JOptionPane.YES_NO_OPTION);
                  
        //Si la respuesta es verdadera
        if(op == 0)
        {
            //Si el metodo devuelve true
            if(clie.eliminarCliente(clien))
            {
                //Limpio las cajas de texto
                limpiar();
                
                //Actualizo la grilla de clientes
                cargar_tabla();
           }
        }else
        {
            limpiar();
            
            habilitar(true);
        }   
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    //Código del botón limpiar
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //Código boton buscar
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        boolean ban = true;
        while(ban)
        {
            String val = JOptionPane.showInputDialog(null,"Ingrese el número de identificación a buscar:","Buscar cliente",JOptionPane.QUESTION_MESSAGE);
            if(val != null)
            {
                if(val.compareTo("") == 0)
                {
                    JOptionPane.showMessageDialog(null,"Campo vacio, por favor ingrese un código válido.","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    //Instancia los objetos
                    clie = new ClienteControl();
                    Cliente clien = clie.buscarCliente(val);
                    
                    //Verifico que tenga valor null
                    if(clien == null)
                    {
                        JOptionPane.showMessageDialog(null,"Datos no encontrados, verifique si el número de identificación es correcto.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        //Cargo los datos a cada JTextBox
                        txtIdentificacion.setText(clien.getIden_Clie());
                        txtNombre.setText(clien.getNomb_Clie());
                        txtApellido.setText(clien.getApel_Clie());
                        txtTelefono.setText(clien.getTele_Clie());
                        
                        //La variable global cédula tendra guardada el número de identificación del cliente buscado
                        cedula = clien.getIden_Clie();
                        
                        habilitar(false);
                        
                        btnRegistrar.setEnabled(false);
                        btnLimpiar.setEnabled(false);
                        
                        txtIdentificacion.requestFocus();
                        
                        ban = false;
                    }
                }
            }
            else
            {
                ban = false;
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    //Código del botón modificar
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        //Verifico que los campos estén vacios
        if(!met.campo_vacio(txtIdentificacion, "Identificación"))
        {
            if(!met.campo_vacio(txtNombre, "Nombre"))
            {
                if(!met.campo_vacio(txtApellido, "Apellido"))
                {
                    if(!met.campo_vacio(txtTelefono, "Teléfono"))
                    {
                        //Creo el objeto del modelo Cliente y el controlador ClienteControl
                        Cliente clien = new Cliente();
                        clie = new ClienteControl();
                        
                        //.trim() elimina los espacios
                        
                        //Accedo a los metodos SET del modelo cliente y les envio el valor del txt por parametro
                        clien.setIden_Clie(txtIdentificacion.getText().trim());
                        clien.setNomb_Clie(txtNombre.getText().trim());
                        clien.setApel_Clie(txtApellido.getText().trim());
                        clien.setTele_Clie(txtTelefono.getText().trim());
                        
                        //Si el metodo devuelve true
                        if(clie.modificarCliente(clien,cedula))
                        {
                            //Limpio las cjas de texto
                            limpiar();
                            
                            habilitar(true);
                            
                            //Cargo los datos modificados en la grilla
                            cargar_tabla();
                        }
                    }
                }
            }
        } 
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaClie;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}