//Vista del Modelo Detalle y Control Detalle
package Vista;

//Importo las librerias a utilizar
import Controlador.DetalleControl;
import Controlador.FacturaControl;
import Modelo.Detalle;
import Modelo.Factura;
import Utiles.Metodos;
import Utiles.modelJTDetalle;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class FacturaVista extends javax.swing.JFrame {

    //Metodo principal del formulario
    public FacturaVista() {
        
        //Carga todos los componentes del formulario
        initComponents();
        
        setResizable(false);
        
        //Ubico el formulario en el centro de la pantalla
        setLocationRelativeTo(null);
        
        //Ubico el Focus
        txtArticulo.requestFocus();
        
        //Desactivo los txt que no se utilizarán en el formulario
        txtIdentificacion.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtTotal.setEnabled(false);
        txtNumFactura.setEnabled(false);
        
        //Creo e objeto del modelo Metodos
        met = new Metodos();
        
        //Accedo al metodo solo números
        met.Solo_Numeros(txtCantidad);
        met.Solo_Numeros(txtValUnitario);
        met.Solo_Numeros(txtTotal);
        met.Solo_Numeros(txtDescuento);
        
        //Metodo para el limite de caracteres en los txt
        met.Limite_Caracteres(txtArticulo, 25);
        met.Limite_Caracteres(txtDescripcion, 250);
        
    }
    
    //Variables publicas que obtienen los datos ingresados en el input de la pagina principal
    public String identificacion,nombre,apellido,telefono;
    public long max;
    public boolean bandera;

    //Declaro las variables de las clases
    Metodos met;
    DetalleControl deta;
    modelJTDetalle modelDeta = new modelJTDetalle();
    FacturaControl facCon;
    long descuento = 0;
    
    //Array del tipo Modelo Detalle
    ArrayList<Detalle> listaDeta = new ArrayList();
    
    //Metodo para obtener datos del cliente
    public void cargarCliente()
    {
        txtIdentificacion.setText(identificacion);
        txtNombre.setText(nombre);
        txtApellido.setText(apellido);
        txtTelefono.setText(telefono);
        txtNumFactura.setText(String.valueOf(max));
    }
    
    //Metodo para limpiar los textbox
    public void limpiar()
    {
        txtArticulo.setText("");
        txtDescripcion.setText("");
        txtCantidad.setText("");
        txtValUnitario.setText("");
        txtDescuento.setText("");
        
        //Mando el focus
        txtArticulo.requestFocus();
    }
    
    public long calcular_total()
    {
        long total = 0;
        for(int i = 0 ; i < listaDeta.size() ; i++)
        {
            total += listaDeta.get(i).getValt_Deta();
        }
        return total;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDeta = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtArticulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtValUnitario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNumFactura = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        txtGuardar = new javax.swing.JButton();
        DateEvento = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Factura de Venta");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Identificación:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Teléfono:");

        txtIdentificacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtIdentificacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtApellido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTelefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        TablaDeta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Articulo", "Descripción", "Cantidad", "Valor unitario", "Valor total"
            }
        ));
        TablaDeta.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TablaDetaPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDeta);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Articulo:");

        txtArticulo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArticuloActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Cantidad:");

        txtCantidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Valor unitario:");

        txtValUnitario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Descripción:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("TOTAL  A PAGAR:");

        txtTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTotal.setText("0");
        txtTotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("DESCUENTO:");

        txtDescuento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoActionPerformed(evt);
            }
        });
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyReleased(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnImprimir.setText("Imprimir y Guardar");

        btnLimpiar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtDescripcion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Número Factura");

        txtNumFactura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNumFactura.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Observación:");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setText("Fecha de evento:");

        txtObservacion.setColumns(20);
        txtObservacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtObservacion.setRows(5);
        jScrollPane2.setViewportView(txtObservacion);

        txtGuardar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtGuardar.setText("Solo Guardar");
        txtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardarActionPerformed(evt);
            }
        });

        DateEvento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel13.setText("Total facturado");

        jLabel15.setText("Cliente");

        jLabel16.setText("Articulos");

        jLabel17.setText("Detalle de la Factura");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator4)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 14, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DateEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNumFactura))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jSeparator3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(27, 27, 27)
                                                        .addComponent(jLabel5)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtCantidad)
                                                    .addComponent(txtValUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnLimpiar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnEliminar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnAgregar)))
                                        .addGap(21, 21, 21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnImprimir)
                                            .addComponent(txtGuardar)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(19, 19, 19))))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtValUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnLimpiar)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGuardar)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtNumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(DateEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed
    
   
    //Código del botón agregar detalles
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        //Verifico que los campos estén vacios
        met = new Metodos();
        if(!met.campo_vacio(txtArticulo, "Artículo"))
        {
            if(!met.campo_vacio(txtCantidad, "Cantidad"))
            {
                if(!met.campo_vacio(txtValUnitario, "Valor unitario"))
                {
                    //Creo el objeto
                    Detalle detaa = new Detalle();
                    modelDeta = new modelJTDetalle();
                    
                    
                    //Le envio los datos de los txt al metodo SET del modelo
                    detaa.setNomb_Deta(txtArticulo.getText());
                    detaa.setDesc_Deta(txtDescripcion.getText());
                    detaa.setCant_Deta(Integer.parseInt(txtCantidad.getText()));
                    detaa.setValo_Deta(Integer.parseInt(txtValUnitario.getText()));
                    detaa.setNume_Fact(Long.parseLong(txtNumFactura.getText()));
                    
                    //Multiplico la cantidad por el valor unitario
                    long total = Long.parseLong(txtCantidad.getText()) * Long.parseLong(txtValUnitario.getText());
                    
                    //Agrego el total de la multiplicación al campo Valor total
                    detaa.setValt_Deta(total);
                    
                    //Agrego los datos del objeto al array listaDeta
                    listaDeta.add(detaa);
                    
                    //Muestro el total a pagar
                    txtTotal.setText(Long.toString(calcular_total()));
                    
                    
                    
                    //Le envio al modelo(modelJTDetalle) el array con los datos
                    modelDeta.setLsDatos(listaDeta);
                    
                    //Le envio a la tabla los datos que se ingresaron
                    TablaDeta.setModel(modelDeta);
                    
                    //Limpio las cajas de texto
                    limpiar();
                }
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArticuloActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

   
    //Código boton limpiar
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        //Ejecuto el metodo limpiar
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //Código para el boton guardar factura
    private void txtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardarActionPerformed
        
        //Verifico que el array no esté vacio
        if(listaDeta.isEmpty() == true)
        {
            //Envio mensaje de error
            JOptionPane.showMessageDialog(null,"No existe ningún dato en la factura para guardar","Error",JOptionPane.ERROR_MESSAGE);
            
            //Envio el focus
            txtArticulo.requestFocus();
        }
        else
        {
            if(DateEvento.getDate() == null)
            {
                //Envio mensaje de error
                JOptionPane.showMessageDialog(null,"No ha seleccionado una fecha de evento válida.","Error",JOptionPane.ERROR_MESSAGE);

                //Envio el focus
                DateEvento.requestFocus();
            }
            else
            {
                if(Long.parseLong(txtDescuento.getText()) > Long.parseLong(txtTotal.getText()))
                {
                    //Envio mensaje de error
                    JOptionPane.showMessageDialog(null,"El valor del descuento supera el total a pagar","Error",JOptionPane.ERROR_MESSAGE);

                    //Mando el focus
                    txtDescuento.requestFocus();
                }else
                {
                    Factura f = new Factura();
                    facCon = new FacturaControl();
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat ("yyyy-MM-dd"); 
                    java.util.Date fa = new Date();
                    String fechaEve = sdf.format (DateEvento.getDate());
                    String fechaAct = sdf.format (fa);
                    
                    f.setDesc_Fact(Long.parseLong(txtDescuento.getText()));
                    f.setFech_Even(fechaEve);
                    f.setFech_Fact(fechaAct);
                    f.setIden_Clie(txtIdentificacion.getText());
                    f.setNume_Fact(Long.parseLong(txtNumFactura.getText()));
                    f.setObse_Fact(txtObservacion.getText());
                    f.setTota_Fact(calcular_total());
                    boolean b1 = facCon.registrar(f);
                    
                    DetalleControl d = new DetalleControl();
                    boolean b2 = d.insertarDetalle(listaDeta);
                    
                    if(b1 == true && b2 == true)
                    {
                        JOptionPane.showMessageDialog(null,"Guardado correctamente","¡ Bien !",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Error al guardar los datos","¡ Error !",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_txtGuardarActionPerformed

    private void TablaDetaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TablaDetaPropertyChange
        
        try
        {
            int fila = TablaDeta.getSelectedRow();
            
            String Nomb_Deta = TablaDeta.getValueAt(fila,0).toString();
            String Desc_Deta = TablaDeta.getValueAt(fila,1).toString();
            long Cant_Deta = (long) TablaDeta.getValueAt(fila, 2);
            long Valo_Deta  = (long) TablaDeta.getValueAt(fila, 3);
            //long Valt_Deta  = (long) TablaDeta.getValueAt(fila, 4);
            
            modelDeta.setValueAt(Nomb_Deta, fila, 0);
            modelDeta.setValueAt(Desc_Deta, fila, 1);
            modelDeta.setValueAt(Cant_Deta, fila, 2);
            modelDeta.setValueAt(Valo_Deta, fila, 3);
            modelDeta.setValueAt(Cant_Deta*Valo_Deta, fila, 4);
            
            TablaDeta.repaint();
            
            txtTotal.setText(Long.toString(calcular_total()));
        }catch(Exception e)
        {
            
        }
        
    }//GEN-LAST:event_TablaDetaPropertyChange

    private void txtDescuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyReleased

        txtTotal.setText(String.valueOf(calcular_total()));
        try
        {
         //Verifico que el campo descuento no sea mayor al total a pagar
          if(Long.parseLong(txtDescuento.getText()) > Long.parseLong(txtTotal.getText()))
          {
              //Envio mensaje de error
              JOptionPane.showMessageDialog(null,"El valor del descuento supera el total a pagar","Error",JOptionPane.ERROR_MESSAGE);

              //Mando el focus
              txtDescuento.requestFocus();
          }else
          {
              //Paso de String a Integer el valor ingresado en el txt
              descuento = Long.parseLong(txtDescuento.getText());
              long total = Long.parseLong(txtTotal.getText());

              //Realizo el descuento
              long resta = total - descuento;

              //Muestro el total a pagar
              txtTotal.setText(Long.toString(resta));
          }
        }catch(Exception e)
        {}
        
    }//GEN-LAST:event_txtDescuentoKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try
        {
            int fila = TablaDeta.getSelectedRow();
            if(fila == -1)
            {
                JOptionPane.showMessageDialog(null,"Primero seleccione en la tabla, el articulo que desea eliminar.","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                listaDeta.remove(fila);
                TablaDeta.repaint();
                long to = calcular_total();
                txtTotal.setText(String.valueOf(to));
            }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Primero seleccione en la tabla, el articulo que desea eliminar.","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(FacturaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacturaVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateEvento;
    private javax.swing.JTable TablaDeta;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JButton txtGuardar;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumFactura;
    private javax.swing.JTextArea txtObservacion;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValUnitario;
    // End of variables declaration//GEN-END:variables
}