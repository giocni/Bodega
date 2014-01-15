package Vista;

import Controlador.InventarioControl;
import Modelo.Inventario;
import Utiles.Metodos;
import Utiles.modelJTInventario;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class InventarioVista extends javax.swing.JFrame {

    
    public InventarioVista() {
        initComponents();
        met = new Metodos();
        met.Limite_Caracteres(txtNume_Inve, 25);
        met.Limite_Caracteres(txtNomb_Inve, 30);
        met.Limite_Caracteres(txtCant_Inve, 20);
        met.Solo_Numeros(txtCant_Inve);
        
        cargar_tabla();
        txtNume_Inve.requestFocus();
    }

    Metodos met;
    InventarioControl invCon;
    modelJTInventario modelInv = new modelJTInventario();
    String codigo;
    
    private void limpiar()
    {
        txtCant_Inve.setText(null);
        txtDesc_Inve.setText(null);
        txtNomb_Inve.setText(null);
        txtNume_Inve.setText(null);
        txtNume_Inve.requestFocus();
    }
    
    private void cargar_tabla()
    {
        invCon = new InventarioControl();
        modelInv.setLstDatos(invCon.listaInventario());
        tablaInve.setModel(modelInv);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNume_Inve = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc_Inve = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomb_Inve = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCant_Inve = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblCaracteres = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInve = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNume_Inve.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel1.setText("Número / Código:");

        txtDesc_Inve.setColumns(20);
        txtDesc_Inve.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        txtDesc_Inve.setLineWrap(true);
        txtDesc_Inve.setRows(5);
        txtDesc_Inve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDesc_InveKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtDesc_Inve);

        jLabel3.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel3.setText("Descripción:");

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel2.setText("Nombre del producto:");

        txtNomb_Inve.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        btnCancelar.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        btnModificar.setText("Guardar cambios");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel4.setText("Cantidad:");

        txtCant_Inve.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        jLabel5.setText("Caracteres restantes:");

        lblCaracteres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaracteres.setText("250");

        jLabel6.setForeground(new java.awt.Color(253, 2, 28));
        jLabel6.setText("*");

        jLabel7.setForeground(new java.awt.Color(253, 2, 28));
        jLabel7.setText("*");

        jLabel8.setForeground(new java.awt.Color(253, 2, 28));
        jLabel8.setText("*");

        tablaInve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número / Código", "Nombre del producto", "Descripción", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaInveMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaInve);
        if (tablaInve.getColumnModel().getColumnCount() > 0) {
            tablaInve.getColumnModel().getColumn(0).setMinWidth(100);
            tablaInve.getColumnModel().getColumn(0).setPreferredWidth(100);
            tablaInve.getColumnModel().getColumn(1).setMinWidth(120);
            tablaInve.getColumnModel().getColumn(1).setPreferredWidth(120);
            tablaInve.getColumnModel().getColumn(2).setMinWidth(210);
            tablaInve.getColumnModel().getColumn(2).setPreferredWidth(210);
            tablaInve.getColumnModel().getColumn(3).setMinWidth(80);
            tablaInve.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        jLabel9.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel9.setText("Filtro:");

        txtFiltro.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        txtBuscar.setText("Busqueda");
        txtBuscar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCant_Inve, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNume_Inve, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addGap(39, 39, 39))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(txtNomb_Inve, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNume_Inve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomb_Inve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCant_Inve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lblCaracteres)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(!met.campo_vacio(txtNume_Inve,"Número / Código"))
        {
            if(!met.campo_vacio(txtNomb_Inve,"Nombre del producto"))
            {
                if(!met.campo_vacio(txtCant_Inve,"Cantidad"))
                {
                    Inventario inv = new Inventario();
                    invCon = new InventarioControl();
                    
                    inv.setNume_Inve(txtNume_Inve.getText().trim());
                    inv.setNomb_Inve(txtNomb_Inve.getText().trim());
                    inv.setDesc_Inve(txtDesc_Inve.getText().trim());
                    inv.setCant_Inve(Long.parseLong(txtCant_Inve.getText().trim()));
                    if(invCon.registrar(inv))
                    {
                        limpiar();
                        cargar_tabla();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        btnRegistrar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtDesc_InveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDesc_InveKeyTyped
        try
        {
            int num =250 - txtDesc_Inve.getText().trim().length();
            lblCaracteres.setText(String.valueOf(num));
            if(num <= 0)
            {
                evt.consume();
            }
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_txtDesc_InveKeyTyped

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        boolean ban = true;
        while (ban)
        {
            String val = JOptionPane.showInputDialog(null,"Ingrese el código del articulo a buscar:","Buscar articulo",JOptionPane.QUESTION_MESSAGE);
            if(val != null)
            {
                if(val.compareTo("") == 0)
                {
                    JOptionPane.showMessageDialog(null,"Campo vacio, por favor ingrese un código válido.","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    invCon = new InventarioControl();
                    Inventario inv = invCon.buscar(val);
                    if(inv == null)
                    {
                        JOptionPane.showMessageDialog(null,"Datos no encontrados, verifique si el código es correcto.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        txtNume_Inve.setText(inv.getNume_Inve());
                        txtNomb_Inve.setText(inv.getNomb_Inve());
                        txtDesc_Inve.setText(inv.getDesc_Inve());
                        txtCant_Inve.setText(String.valueOf(inv.getCant_Inve()));
                        
                        txtDesc_InveKeyTyped(null);
                        btnRegistrar.setEnabled(false);
                        btnModificar.setEnabled(true);
                        btnEliminar.setEnabled(true);
                        
                        codigo = inv.getNume_Inve();
                        ban = false;
                    }
                }
            }
            else
            {
                ban = false;
            }
        }
        
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       int op = JOptionPane.showConfirmDialog(null,"Esta seguro de eliminar el articulo '"+codigo+"' del sistema ?","Eliminar",JOptionPane.YES_NO_OPTION);
       if (op == 0)
       {
           invCon = new InventarioControl();
           if(invCon.eliminar(codigo))
           {
               btnCancelarActionPerformed(null);
               cargar_tabla();
           }
       }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(!met.campo_vacio(txtNume_Inve,"Número / Código"))
        {
            if(!met.campo_vacio(txtNomb_Inve,"Nombre del producto"))
            {
                if(!met.campo_vacio(txtCant_Inve,"Cantidad"))
                {
                    Inventario inv = new Inventario();
                    invCon = new InventarioControl();
                    
                    inv.setNume_Inve(txtNume_Inve.getText().trim());
                    inv.setNomb_Inve(txtNomb_Inve.getText().trim());
                    inv.setDesc_Inve(txtDesc_Inve.getText().trim());
                    inv.setCant_Inve(Long.parseLong(txtCant_Inve.getText().trim()));
                    if(invCon.modificar(inv,codigo))
                    {
                        btnCancelarActionPerformed(null);
                        cargar_tabla();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tablaInveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInveMouseClicked

        Inventario inv = modelInv.getFila(tablaInve.getSelectedRow());
        
        txtNume_Inve.setText(inv.getNume_Inve());
        txtNomb_Inve.setText(inv.getNomb_Inve());
        txtDesc_Inve.setText(inv.getDesc_Inve());
        txtCant_Inve.setText(String.valueOf(inv.getCant_Inve()));
        
        txtDesc_InveKeyTyped(null);
        btnRegistrar.setEnabled(false);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);

        codigo = inv.getNume_Inve();
    }//GEN-LAST:event_tablaInveMouseClicked

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        String val = txtFiltro.getText();
        invCon = new InventarioControl();
        modelInv.setLstDatos(invCon.listaInventario_filtro(val));
        tablaInve.removeAll();
        tablaInve.setModel(modelInv);
        
    }//GEN-LAST:event_txtFiltroKeyTyped

    
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
            java.util.logging.Logger.getLogger(InventarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCaracteres;
    private javax.swing.JTable tablaInve;
    private javax.swing.JButton txtBuscar;
    private javax.swing.JTextField txtCant_Inve;
    private javax.swing.JTextArea txtDesc_Inve;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtNomb_Inve;
    private javax.swing.JTextField txtNume_Inve;
    // End of variables declaration//GEN-END:variables
}
