package vista;

import conexion.conexion;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.GenerarNumero;
import modelo.PedidoCliente;
import modelo.Producto;
/**
 *
 * @author Sergio
 */
public class formCargarPedido extends javax.swing.JFrame {

    /**
     * Creates new form cargarPedido
     */
  
    private DefaultTableModel modelo2;
  
    
       public formCargarPedido() {
        initComponents();
        //jComboBoxProducto
        ArrayList<String> lista =new ArrayList<String>();
       lista= Producto.llenarProducto();
       jComboBoxProducto.addItem("");
       for(int i=0;i<lista.size();i++){
       jComboBoxProducto.addItem(lista.get(i));
       }
       
        
       ArrayList<String> listar =new ArrayList<String>();
       listar= PedidoCliente.llenar_combo();
       jComboBoxCliente.addItem("");
       for(int i=0;i<listar.size();i++){
       jComboBoxCliente.addItem(listar.get(i));
       }
       numeros();
        modelo2=new DefaultTableModel();
        modelo2.addColumn("Codigo");
        modelo2.addColumn("Producto");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Precio");
        modelo2.addColumn("Subtotal");
        jTablePedido.setModel(modelo2);
    }
    public void cargarPrecio(){
    if( jComboBoxProducto.getSelectedItem().toString().isEmpty() ){ 
       System.out.println("Vacío");
    }else{       
       System.out.println("valor: "+jComboBoxProducto.getSelectedItem());
    }
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextNroPedido = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxProducto = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        barraTabla = new javax.swing.JScrollPane();
        jTablePedido = new javax.swing.JTable();
        jBtnCargarPedido = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();
        jTextProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBtonBuscarProducto = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextTotal = new javax.swing.JTextField();
        jTextIva = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ALL-CAR");

        jScrollPane1.setViewportView(jTextNroPedido);

        jLabel1.setText("Realizar Pedido");

        jLabel2.setText("Nro pedido:");

        jLabel3.setText("Lista de productos:");

        jComboBoxProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxProductoMouseClicked(evt);
            }
        });
        jComboBoxProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProductoActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel4.setText("Cantidad de producto: ");

        jLabel5.setText("Cliente:");

        jComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClienteActionPerformed(evt);
            }
        });

        jTablePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Cantidad", "Precio", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTablePedido.setName("Descripción de Pedido"); // NOI18N
        barraTabla.setViewportView(jTablePedido);

        jBtnCargarPedido.setText("Cargar");
        jBtnCargarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCargarPedidoActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        jButton3.setText("Cargar Pedido");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Descripción de Pedido:");

        jLabel7.setText("Producto:");

        jLabel8.setText("Precio:");

        jBtonBuscarProducto.setText("Buscar producto");
        jBtonBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtonBuscarProductoActionPerformed(evt);
            }
        });

        jLabel9.setText("IVA:");

        jLabel10.setText("Total:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnCargarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(barraTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextIva, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7))
                                        .addGap(3, 3, 3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxProducto, 0, 270, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(jBtonBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtonBuscarProducto)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jBtnCargarPedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jTextIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jMenu1.setText("Clientes");
        jMenuBar1.add(jMenu1);

        jMenu4.setText("Pedidos");

        jMenu5.setText("Edit");
        jMenu4.add(jMenu5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jComboBoxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProductoActionPerformed

    private void jComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClienteActionPerformed
      
       
    }//GEN-LAST:event_jComboBoxClienteActionPerformed

    private void jBtnCargarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCargarPedidoActionPerformed
 
         try {
            
       
             
             conexion con =new conexion();
             float precio=0,subtotal=0;
             int cantidad = Integer.parseInt(jSpinner1.getValue().toString());
            
             String prodSele = jComboBoxProducto.getSelectedItem().toString();
             String buscarPrecio="SELECT * FROM productos WHERE producto='" + prodSele +"'";
             PreparedStatement ps;
             ps = con.getConexion().prepareStatement(buscarPrecio);
             ResultSet re = ps.executeQuery();
             if (re.next()){
                 jTextProducto.setText(re.getString("producto"));
                 jTextPrecio.setText(re.getString("precio_venta"));
             }
             precio=Float.parseFloat(jTextPrecio.getText());
            subtotal=cantidad*precio; 
           
            String nroP=jTextNroPedido.getText(); 
            String prod=jTextProducto.getText();
            String cant=jSpinner1.getValue().toString();
            String pr=jTextPrecio.getText();
            String st=String.valueOf(subtotal);
            modelo2=(DefaultTableModel) jTablePedido.getModel();
            modelo2.addRow(new Object[]{nroP,prod,cant,pr,st});
            /*for(int i=0;i<jTablePedido.getRowCount();i++){
              String datos[]={nroP,prod,cant,pr,st};
            modelo2.addRow(datos);
            jTablePedido.setModel(modelo2);
           }*/
         } catch (SQLException ex) {
             Logger.getLogger(formCargarPedido.class.getName()).log(Level.SEVERE, null, ex);
         }
    
           
   
  limpiar();
   
   
    }//GEN-LAST:event_jBtnCargarPedidoActionPerformed
     
 public void limpiar(){
 jTextProducto.setText(null);
 jTextPrecio.setText(null);
jComboBoxProducto.setSelectedIndex(0);
jSpinner1.setValue(0);

}
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try {
             conexion con =new conexion();
            
             String sqlDetPed="INSERT INTO detallePedido (id_pedido,nomb_prod,cant_prod,precio_vta,sub_total)VALUES (?,?,?,?,?)";
             PreparedStatement ps =con.getConexion().prepareStatement(sqlDetPed);
            for(int i =0;i<jTablePedido.getRowCount();i++){
             ps.setString(1,jTablePedido.getValueAt(i,0).toString());
             ps.setString(2,jTablePedido.getValueAt(i,1).toString());
             ps.setInt(3,Integer.parseInt(jTablePedido.getValueAt(i,2).toString()));
             ps.setFloat(4,Float.parseFloat(jTablePedido.getValueAt(i,3).toString()));
             ps.setFloat(5,Float.parseFloat(jTablePedido.getValueAt(i,4).toString()));
             ps.executeUpdate();
            }
           
         } catch (SQLException ex) {
             Logger.getLogger(formCargarPedido.class.getName()).log(Level.SEVERE, null, ex);
         }
         try{
         double iva=1.21,total_s_imp=0,total_c_imp=0;
         
         conexion con =new conexion();
         String sqlPed="INSERT INTO pedidos (id_pedido,id_cliente,total_s_imp,total_c_imp,fecha_pedido)VALUES (?,?,?,?,?)";
         PreparedStatement ps =con.getConexion().prepareStatement(sqlPed);
         for(int i =0;i<jTablePedido.getRowCount();i++){
         total_s_imp+=Double.parseDouble(jTablePedido.getValueAt(i,4).toString());
         }  
         String clienteSele = jComboBoxCliente.getSelectedItem().toString();
             String buscarCliente="SELECT * FROM clientes WHERE razon_social='" + clienteSele +"'";
             //PreparedStatement ps;
             ps = con.getConexion().prepareStatement(buscarCliente);
             ResultSet re = ps.executeQuery();
             String idCl = null,fecha,id_recibo;
             if (re.next()){
             idCl=re.getString("id_cliente");
                 
             }  
            id_recibo=jTextNroPedido.getText();    
            fecha=fechaactual();
          //  System.out.println("idcliente: "+idCl+"fecha: "+fecha+"nuremo: "+id_recibo);  
            total_c_imp=total_s_imp*iva;
           //  System.out.println("total sin impuesto:"+total_s_imp+"con impuesto"+total_c_imp);
          String sqlPedido="INSERT INTO pedidos (id_pedido,id_cliente,total_s_imp,total_c_imp,fecha_pedido)VALUES (?,?,?,?,?)";
             PreparedStatement psp =con.getConexion().prepareStatement(sqlPedido);
            for(int i =0;i<jTablePedido.getRowCount();i++){
             psp.setString(1,id_recibo);
             psp.setInt(2,Integer.parseInt(idCl));
             psp.setDouble(3,total_s_imp);
             psp.setDouble(4,total_c_imp);
             psp.setString(5,fecha);
             psp.executeUpdate();
            }
          jTablePedido.setVisible(false);
          numeros();
         }catch(SQLException e){
             Logger.getLogger(formCargarPedido.class.getName()).log(Level.SEVERE, null, e);
         }
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBtonBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtonBuscarProductoActionPerformed
    formCargarProducto fcp =new formCargarProducto();
   //   formPrincipal.jdpescritorio.add(fcp);
      fcp.toFront();
      fcp.setVisible(true);
    }//GEN-LAST:event_jBtonBuscarProductoActionPerformed

    private void jComboBoxProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxProductoMouseClicked
           jComboBoxProducto.addItemListener(new ItemListener() {

 

          

            public void itemStateChanged(ItemEvent e) {

                if (e.getStateChange() == ItemEvent.SELECTED) {

                 //   JOptionPane.showMessageDialog(rootPane, "JCombobox1 cambia", "Eventos", JOptionPane.WARNING_MESSAGE);
               String prods=jComboBoxProducto.getSelectedItem().toString(); 
                 jTextProducto.setText(jComboBoxProducto.getSelectedItem().toString());
                    System.out.println("producto selectionado: "+prods); 
                    // Aqui es donde se escribe el manejador del evento

                }

            }

        });
    }//GEN-LAST:event_jComboBoxProductoMouseClicked
    public static String fechaactual(){
    Date fecha= new Date();
    SimpleDateFormat formatofecha= new SimpleDateFormat("dd/MM/YYYY");
    return formatofecha.format(fecha);
    }
    private String numeros(){
        conexion con= new conexion();
         int j;
        String c="";
         String SQL="select max(id_pedido) from pedidos";
      
        try {
            Statement st = (Statement) con.getConexion().createStatement();
            ResultSet rs=st.executeQuery(SQL);
            if(rs.next())
            {              
                 c=rs.getString(1);
            }
            
           
            if(c==null){
                jTextNroPedido.setText("00000001");
            }
            else{
                 j=Integer.parseInt(c);
                 GenerarNumero gen= new GenerarNumero();
                 gen.generar(j);
                 jTextNroPedido.setText(gen.serie());
            }
       } catch (SQLException ex) {
           Logger.getLogger(formCargarPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
   return c;
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
            java.util.logging.Logger.getLogger(formCargarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCargarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCargarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCargarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCargarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JScrollPane barraTabla;
    private javax.swing.JButton jBtnCargarPedido;
    private javax.swing.JButton jBtonBuscarProducto;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTablePedido;
    private javax.swing.JTextField jTextIva;
    private javax.swing.JTextPane jTextNroPedido;
    protected static javax.swing.JTextField jTextPrecio;
    protected static javax.swing.JTextField jTextProducto;
    private javax.swing.JTextField jTextTotal;
    // End of variables declaration//GEN-END:variables
}
