package vista;
import modelo.Cliente;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

public class formCargarProducto extends javax.swing.JFrame {

    DefaultTableModel model; 
 
    public formCargarProducto() {
        initComponents();
        model = new DefaultTableModel();
        jButtonEliminarCliente.setVisible(false);

        setTitle("ALL-CAR");
    
       construirTabla();
    }
private void construirTabla() {
		
                String titulos[]={"ID","Codigo", "Producto","Cantidad", "Precio Costo", "Precio Venta","Fecha Ingreso"};
		String informacion[][]=obtenerMatriz(); 
                
                model.addColumn("ID");
                model.addColumn("Codigo");
                model.addColumn("Producto");
                model.addColumn("Cantidad");
                model.addColumn("Precio Costo");
                model.addColumn("Precio Venta");
                model.addColumn("Fecha ingreso");
               // model.addColumn("Nota");
                jtablaProducto= new JTable(informacion,titulos);
               
               jtablaProducto=new JTable(informacion,titulos);
		barraTabla1.setViewportView(jtablaProducto);

	}
private String[][] obtenerMatriz() {
		
		Producto buscarProducto=new Producto();
                
               
		ArrayList<Producto>miLista=buscarProducto.buscarUsuariosConMatriz();
		String matrizInfo[][]=new String[miLista.size()][7];
		
		for (int i = 0; i < miLista.size(); i++) {
                        matrizInfo[i][0]=miLista.get(i).getIdProducto()+"";
                        matrizInfo[i][1]=miLista.get(i).getCod_Producto()+"";
			matrizInfo[i][2]=miLista.get(i).getNombreProducto()+"";
			matrizInfo[i][3]=miLista.get(i).getCantidadProducto()+"";
			matrizInfo[i][4]=miLista.get(i).getPrecioCostoProd()+"";
			matrizInfo[i][5]=miLista.get(i).getPrecioVentaProd()+"";
			matrizInfo[i][6]=miLista.get(i).getFecha_ingreso()+"";
		}
			
		return matrizInfo;
	}
private String[][] buscarMatriz() {
		
		Producto buscarProd=new Producto();
                
               String sql= "SELECT * FROM productos WHERE codigo_interno LIKE '%"+ jTextBuscar.getText()+"%' "+ "OR producto LIKE '%" + jTextBuscar.getText() + "%'";
		ArrayList<Producto>miLista=buscarProd.buscarUsuarios(sql);
		String matrizInfo[][]=new String[miLista.size()][7];
		
		for (int i = 0; i < miLista.size(); i++) {
                        matrizInfo[i][0]=miLista.get(i).getIdProducto()+"";
                        matrizInfo[i][1]=miLista.get(i).getCod_Producto()+"";
			matrizInfo[i][2]=miLista.get(i).getNombreProducto()+"";
			matrizInfo[i][3]=miLista.get(i).getCantidadProducto()+"";
			matrizInfo[i][4]=miLista.get(i).getPrecioCostoProd()+"";
			matrizInfo[i][5]=miLista.get(i).getPrecioVentaProd()+"";
			matrizInfo[i][6]=miLista.get(i).getFecha_ingreso()+"";
		
		}
			
		return matrizInfo;
	}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraTabla1 = new javax.swing.JScrollPane();
        jtablaProducto = new javax.swing.JTable();
        panelFormularioCliente = new javax.swing.JPanel();
        jTextProducto = new javax.swing.JTextField();
        jTextCantidadIng = new javax.swing.JTextField();
        jTextCostoProd = new javax.swing.JTextField();
        jTextVentaProd = new javax.swing.JTextField();
        jTextID = new javax.swing.JTextField();
        jButtonModificarCliente = new javax.swing.JButton();
        jButtonGuardarCliente = new javax.swing.JButton();
        jButtonEliminarCliente = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextCodInt = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jDateIngreso = new com.toedter.calendar.JDateChooser();
        panelBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        barraTabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barraTabla1MouseClicked(evt);
            }
        });

        jtablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaProductoMouseClicked(evt);
            }
        });
        barraTabla1.setViewportView(jtablaProducto);

        jTextProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextProductoActionPerformed(evt);
            }
        });
        jTextProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextProductoKeyTyped(evt);
            }
        });

        jTextCantidadIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantidadIngActionPerformed(evt);
            }
        });
        jTextCantidadIng.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCantidadIngKeyTyped(evt);
            }
        });

        jTextCostoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCostoProdActionPerformed(evt);
            }
        });
        jTextCostoProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCostoProdKeyTyped(evt);
            }
        });

        jTextVentaProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextVentaProdKeyTyped(evt);
            }
        });

        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });

        jButtonModificarCliente.setText("Actualizar");
        jButtonModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarClienteActionPerformed(evt);
            }
        });

        jButtonGuardarCliente.setText("Guardar");
        jButtonGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarClienteActionPerformed(evt);
            }
        });

        jButtonEliminarCliente.setText("Eliminar");
        jButtonEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarClienteActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jLabel2.setText("Producto:");

        jLabel3.setText("Cantidad ingresada:");

        jLabel4.setText("Precio Costo:");

        jLabel5.setText("Precio Venta:");

        jLabel8.setText("Fecha ingreso:");

        jLabel9.setText("Cargar productos:");

        jScrollPane1.setViewportView(jTextCodInt);

        jLabel6.setText("Codigo Interno:");

        jDateIngreso.setDateFormatString("yyyy/MM/dd");

        javax.swing.GroupLayout panelFormularioClienteLayout = new javax.swing.GroupLayout(panelFormularioCliente);
        panelFormularioCliente.setLayout(panelFormularioClienteLayout);
        panelFormularioClienteLayout.setHorizontalGroup(
            panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonModificarCliente)
                                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                                        .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                        .addComponent(jDateIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextCantidadIng, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextCostoProd, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextVentaProd, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                        .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonGuardarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelFormularioClienteLayout.setVerticalGroup(
            panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addGap(36, 36, 36)
                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCantidadIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCostoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextVentaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                        .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonModificarCliente))
                    .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(29, 29, 29)
                        .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLimpiar)
                            .addComponent(jButtonEliminarCliente))))
                .addGap(18, 18, 18)
                .addComponent(jButtonGuardarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Busqueda:");

        jTextBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarActionPerformed(evt);
            }
        });
        jTextBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextBuscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFormularioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(barraTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFormularioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void jTextProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextProductoActionPerformed

    private void jTextCantidadIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidadIngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantidadIngActionPerformed

    private void jTextCostoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCostoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCostoProdActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDActionPerformed

    private void jButtonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarClienteActionPerformed
        
        Producto sqlP =new Producto();
        Producto pd =new Producto();
        
        int filaSec=jtablaProducto.getSelectedRow();
        String idSel=(String)jtablaProducto.getValueAt(filaSec,0);
        //System.out.println("fila seleccionada: "+ idSel );

        pd.setCod_Producto(jTextCodInt.getText());
        pd.setNombreProducto(jTextProducto.getText());
        pd.setCantidadProducto(Integer.parseInt(jTextCantidadIng.getText()));
        pd.setPrecioCostoProd(Float.parseFloat(jTextCostoProd.getText()));
        pd.setPrecioVentaProd(Float.parseFloat(jTextVentaProd.getText()));
        pd.setFecha_ingreso(fechaactual());

        pd.setIdProducto(Integer.parseInt(jTextID.getText()));
      
 
         JOptionPane.showMessageDialog(null,"variable id: "+ idSel);
         if(sqlP.ActualizarProducto(pd)){
            JOptionPane.showConfirmDialog(null,"Registro Modificado correctamente");
                  
            limpiarJTEXT();
            construirTabla();
        }else{
            JOptionPane.showConfirmDialog(null,"error al modificar el registro");
            
            limpiarJTEXT();
            construirTabla();
        }  
      
    }//GEN-LAST:event_jButtonModificarClienteActionPerformed
public static String fechaactual(){
    Date fecha= new Date();
    SimpleDateFormat formatofecha= new SimpleDateFormat("dd/MM/YYYY");
    return formatofecha.format(fecha);
    


}
    private void jButtonGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarClienteActionPerformed
    validaProducto();       
        Producto sqlC =new Producto();
        Producto pd =new Producto();
       // Transporte tr=new Transporte();
        //ps.setString(5,Double.parseDouble(JText.getText()));
        //cl.setIdCliente(Integer.parseInt(jTextID.getText()));
        pd.setCod_Producto(jTextCodInt.getText());
        pd.setNombreProducto(jTextProducto.getText());
        pd.setCantidadProducto(Integer.parseInt(jTextCantidadIng.getText()));
        pd.setPrecioCostoProd(Float.parseFloat(jTextCostoProd.getText()));
        pd.setPrecioVentaProd(Float.parseFloat(jTextVentaProd.getText()));
        pd.setFecha_ingreso(fechaactual());

        if(sqlC.registrarCliente(pd)){
            JOptionPane.showConfirmDialog(null,"Registro Guardado");
            
            limpiarJTEXT();
            construirTabla();
        }else{
            JOptionPane.showConfirmDialog(null,"error al guardar el registro");
            
            limpiarJTEXT();
            construirTabla();
        }
    }//GEN-LAST:event_jButtonGuardarClienteActionPerformed
public void validaProducto(){
    if(jTextProducto.getText().equals("")||jTextCantidadIng.getText().equals("")||jTextCostoProd.getText().equals("")||jTextVentaProd.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Complete los campos obligatorios");
    }

}

private void limpiarJTEXT(){
    
    jTextID.setText(null);
    jTextCodInt.setText(null);
    jTextProducto.setText(null);
    jTextCantidadIng.setText(null);
    jTextCostoProd.setText(null);
    jTextVentaProd.setText(null);

}

    private void jButtonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarClienteActionPerformed
    Cliente sqlC =new Cliente();
        Cliente cl =new Cliente();
        
        int fila=jtablaProducto.getSelectedRowCount();
        if(fila<1){
        JOptionPane.showMessageDialog(null,"Seleccione un registro...");
        }
        else{
            int sel=jtablaProducto.getSelectedRow();
            System.out.println(""+sel);
            int sele= Integer.parseInt(jTextID.getText());      
             sqlC.EliminarCliente(sele);
            limpiarJTEXT();
            construirTabla();
            
        }
  
               
    }//GEN-LAST:event_jButtonEliminarClienteActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiarJTEXT();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jtablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaProductoMouseClicked
       // int filaselec = jtablaClientes.rowAtPoint(evt.getPoint());
      //  System.out.println("fila 2: "+filaselec);
        //jTextID.setText(jtablaClientes.getValueAt(filaselec,0).toString());
        int filaselec = jtablaProducto.getSelectedRow();
        jTextID.setText(String.valueOf(jtablaProducto.getValueAt(filaselec,0)));
        jTextCodInt.setText(String.valueOf(jtablaProducto.getValueAt(filaselec,1)));
        jTextProducto.setText(String.valueOf(jtablaProducto.getValueAt(filaselec,2)));
        jTextCantidadIng.setText(String.valueOf(jtablaProducto.getValueAt(filaselec,3)));
        jTextCostoProd.setText(String.valueOf(jtablaProducto.getValueAt(filaselec,4)));
        jTextVentaProd.setText(String.valueOf(jtablaProducto.getValueAt(filaselec,5)));
        jDateIngreso.setToolTipText(String.valueOf(jtablaProducto.getValueAt(filaselec,6)));
    

    }//GEN-LAST:event_jtablaProductoMouseClicked


    @SuppressWarnings("static-access")
    private void barraTabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraTabla1MouseClicked
        model= new DefaultTableModel();
        int filaselec = jtablaProducto.getSelectedRow();
        if(SwingUtilities.isLeftMouseButton(evt)){

    
       
        jTextID.setText(String.valueOf(jtablaProducto.getValueAt(filaselec,0)));
        jTextCodInt.setText(String.valueOf(jtablaProducto.getValueAt(filaselec,1)));
        jTextProducto.setText(String.valueOf(jtablaProducto.getValueAt(filaselec,2)));
        jTextCantidadIng.setText(String.valueOf(jtablaProducto.getValueAt(filaselec,3)));
        jTextCostoProd.setText(String.valueOf(jtablaProducto.getValueAt(filaselec,4)));
        jTextVentaProd.setText(String.valueOf(jtablaProducto.getValueAt(filaselec,5)));
        jDateIngreso.setToolTipText(String.valueOf(jtablaProducto.getValueAt(filaselec,6)));

    }//GEN-LAST:event_barraTabla1MouseClicked
    }
    private void jTextProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextProductoKeyTyped
     char car =evt.getKeyChar();
     if((car<'a'||car>'z')&&(car<'A'||car>'Z'&&(car=='ñ')&&(car=='Ñ'))&&(car!=(char)KeyEvent.VK_BACK_SPACE)&&(car!=(char)KeyEvent.VK_SPACE)){
     evt.consume();
     JOptionPane.showMessageDialog(null,"solo se adminten letras","validar letras",JOptionPane.INFORMATION_MESSAGE);

     
     }
    }//GEN-LAST:event_jTextProductoKeyTyped

    private void jTextCantidadIngKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCantidadIngKeyTyped
   // validar float
         char num =evt.getKeyChar();
     if((num<'0'||num>'9')&& jTextCostoProd.getText().contains("-")&& (num!=(char)KeyEvent.VK_BACK_SPACE)){
     evt.consume();
     JOptionPane.showMessageDialog(null,"solo se adminten numeros","validar números",JOptionPane.INFORMATION_MESSAGE);
  
     }   
 
     
    }//GEN-LAST:event_jTextCantidadIngKeyTyped
public boolean ValCorreo(String correo){
    Pattern pat =null;
    Matcher mat=null;
    pat=Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    mat=pat.matcher(correo);
    if (mat.find()){
        return true;
        }else{
            return false;
            }
}
    private void jTextCostoProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCostoProdKeyTyped
        char num =evt.getKeyChar();
     if((num<'0'||num>'9')&& (num!=(char)KeyEvent.VK_BACK_SPACE)){
     evt.consume();
     JOptionPane.showMessageDialog(null,"solo se adminten numeros","validar números",JOptionPane.INFORMATION_MESSAGE);

     
     }   
    }//GEN-LAST:event_jTextCostoProdKeyTyped

    private void jTextVentaProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextVentaProdKeyTyped
       char num =evt.getKeyChar();
     if((num<'0'||num>'9')&& (num!=(char)KeyEvent.VK_BACK_SPACE)){
     evt.consume();
     JOptionPane.showMessageDialog(null,"solo se adminten numeros","validar números",JOptionPane.INFORMATION_MESSAGE);

     
     } 
    }//GEN-LAST:event_jTextVentaProdKeyTyped

    private void jTextBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarKeyPressed
             String titulos[]={"ID","Codigo", "Producto","Cantidad", "Precio Costo", "Precio Venta","Fecha Ingreso"};
		String informacion[][]=buscarMatriz(); 
                
                model.addColumn("ID");
                model.addColumn("Codigo");
                model.addColumn("Producto");
                model.addColumn("Cantidad");
                model.addColumn("Precio Costo");
                model.addColumn("Fecha ingreso");
    
                jtablaProducto= new JTable(informacion,titulos);
            
               jtablaProducto=new JTable(informacion,titulos);
		barraTabla1.setViewportView(jtablaProducto);

    
    }//GEN-LAST:event_jTextBuscarKeyPressed

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
            java.util.logging.Logger.getLogger(formCargarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCargarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCargarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCargarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCargarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane barraTabla1;
    private javax.swing.JButton jButtonEliminarCliente;
    private javax.swing.JButton jButtonGuardarCliente;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonModificarCliente;
    private com.toedter.calendar.JDateChooser jDateIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextCantidadIng;
    private javax.swing.JTextPane jTextCodInt;
    private javax.swing.JTextField jTextCostoProd;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextProducto;
    private javax.swing.JTextField jTextVentaProd;
    private javax.swing.JTable jtablaProducto;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelFormularioCliente;
    // End of variables declaration//GEN-END:variables
}
