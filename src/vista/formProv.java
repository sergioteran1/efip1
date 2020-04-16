package vista;

import modelo.Cliente;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Proveedor;

public class formProv extends javax.swing.JFrame {

  
    DefaultTableModel model = new DefaultTableModel();
    
    public formProv() {
        initComponents();
        jButtonEliminarCliente.setVisible(false);
        jTextID.setVisible(false);
        setTitle("ALL-CAR: Proveedores");
       construirTabla();
                
    }
private void construirTabla() {
		
    String titulos[]={"ID","Nombre","Razon Social","CUIT", "Domicilio", "Telefono","Correo" };
    String informacion[][]=obtenerMatriz(); 
    model.addColumn("ID");
    model.addColumn("Nombre");
    model.addColumn("Razon Social");
    model.addColumn("CUIT");
    model.addColumn("Domicilio");
    model.addColumn("Telefono");
    model.addColumn("Correo");
    jtablaProv= new JTable(informacion,titulos);
    jtablaProv=new JTable(informacion,titulos);
    barraTabla.setViewportView(jtablaProv);
}
private String[][] obtenerMatriz() {
		
    Proveedor buscarProv=new Proveedor();
    ArrayList<Proveedor>miLista=buscarProv.buscarProvConMatriz();
    String matrizInfo[][]=new String[miLista.size()][7];
    for (int i = 0; i < miLista.size(); i++) {
        matrizInfo[i][0]=miLista.get(i).getId_prov()+"";
        matrizInfo[i][1]=miLista.get(i).getNombre()+"";
	matrizInfo[i][2]=miLista.get(i).getRazonSocial()+"";
	matrizInfo[i][3]=miLista.get(i).getCUIT()+"";
	matrizInfo[i][4]=miLista.get(i).getDomicilio()+"";
	matrizInfo[i][5]=miLista.get(i).getTelefono()+"";
	matrizInfo[i][6]=miLista.get(i).getCorreo()+"";
    }
return matrizInfo;
}
private String[][] buscarMatriz() {
		
    Proveedor buscarPersona=new Proveedor();
    String sql= "SELECT * FROM proveedores WHERE nombre_prov LIKE '%"+ jTextBuscar.getText()+"%' "+ "OR razonsocial LIKE '%" + jTextBuscar.getText() + "%'";
    ArrayList<Proveedor>miLista=buscarPersona.buscarUsuarios(sql);
    String matrizInfo[][]=new String[miLista.size()][7];
    for (int i = 0; i < miLista.size(); i++) {
        matrizInfo[i][0]=miLista.get(i).getId_prov()+"";
        matrizInfo[i][1]=miLista.get(i).getNombre()+"";
	matrizInfo[i][2]=miLista.get(i).getRazonSocial()+"";
	matrizInfo[i][3]=miLista.get(i).getCUIT()+"";
        matrizInfo[i][4]=miLista.get(i).getDomicilio()+"";
	matrizInfo[i][5]=miLista.get(i).getTelefono()+"";
	matrizInfo[i][6]=miLista.get(i).getCorreo()+"";
    }
return matrizInfo;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraTabla = new javax.swing.JScrollPane();
        jtablaProv = new javax.swing.JTable();
        panelFormularioCliente = new javax.swing.JPanel();
        jTextRazonSocialProv = new javax.swing.JTextField();
        jTextTelefonoProv = new javax.swing.JTextField();
        jTextCorreoProv = new javax.swing.JTextField();
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
        jLabel6 = new javax.swing.JLabel();
        jTextNombreProv = new javax.swing.JTextField();
        jTextDomProv = new javax.swing.JTextField();
        jTextCuitProv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        panelBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextBuscar = new javax.swing.JTextField();
        jUsuario = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        barraTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barraTablaMouseClicked(evt);
            }
        });

        jtablaProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtablaProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaProvMouseClicked(evt);
            }
        });
        barraTabla.setViewportView(jtablaProv);

        jTextRazonSocialProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRazonSocialProvActionPerformed(evt);
            }
        });
        jTextRazonSocialProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextRazonSocialProvKeyTyped(evt);
            }
        });

        jTextTelefonoProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelefonoProvKeyTyped(evt);
            }
        });

        jTextCorreoProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextCorreoProvFocusLost(evt);
            }
        });
        jTextCorreoProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCorreoProvActionPerformed(evt);
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

        jLabel2.setText("Razon Social:");

        jLabel4.setText("Domicilio:");

        jLabel5.setText("Telefono:");

        jLabel8.setText("Correo:");

        jLabel9.setText("Proveedor");

        jLabel6.setText("Nombre:");

        jTextNombreProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreProvActionPerformed(evt);
            }
        });
        jTextNombreProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreProvKeyTyped(evt);
            }
        });

        jTextDomProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDomProvKeyTyped(evt);
            }
        });

        jTextCuitProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCuitProvKeyTyped(evt);
            }
        });

        jLabel7.setText("CUIT:");

        javax.swing.GroupLayout panelFormularioClienteLayout = new javax.swing.GroupLayout(panelFormularioCliente);
        panelFormularioCliente.setLayout(panelFormularioClienteLayout);
        panelFormularioClienteLayout.setHorizontalGroup(
            panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioClienteLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonGuardarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioClienteLayout.createSequentialGroup()
                                .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jButtonModificarCliente))))
                    .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                        .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)))
                            .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTelefonoProv)
                            .addComponent(jTextCorreoProv)
                            .addComponent(jTextRazonSocialProv, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextNombreProv)
                            .addComponent(jTextDomProv)
                            .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 175, Short.MAX_VALUE))
                            .addComponent(jTextCuitProv))))
                .addContainerGap())
        );
        panelFormularioClienteLayout.setVerticalGroup(
            panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                        .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jTextNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextRazonSocialProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addGap(11, 11, 11)
                        .addComponent(jTextCuitProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextDomProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(17, 17, 17)
                        .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextTelefonoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextCorreoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(102, 102, 102)
                        .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonModificarCliente)
                            .addComponent(jButtonLimpiar)
                            .addComponent(jButtonEliminarCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioClienteLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)))
                .addComponent(jButtonGuardarCliente)
                .addContainerGap())
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

        jLabel10.setText("Usuario:");

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBuscarLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barraTabla)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelFormularioCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void jTextRazonSocialProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRazonSocialProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRazonSocialProvActionPerformed

    private void jTextCorreoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCorreoProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCorreoProvActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDActionPerformed

    private void jButtonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarClienteActionPerformed
        
        Proveedor sqlV =new Proveedor();
        Proveedor pv =new Proveedor();
        
        int filaSec=jtablaProv.getSelectedRow();
        String idSel=(String)jtablaProv.getValueAt(filaSec,0);
        System.out.println("fila seleccionada: "+ idSel );
     
        pv.setNombre(jTextNombreProv.getText());
        pv.setRazonSocial(jTextRazonSocialProv.getText());
        pv.setCUIT(jTextCuitProv.getText());
        pv.setDomicilio(jTextDomProv.getText());
        pv.setTelefono(jTextTelefonoProv.getText());
        pv.setCorreo(jTextCorreoProv.getText());
        pv.setId_prov(Integer.parseInt(idSel));
 
        if(sqlV.ActualizarProveedor(pv)){
            JOptionPane.showConfirmDialog(null,"Registro Modificado correctamente");
            limpiarJTEXT();
            construirTabla();
        }else{
            JOptionPane.showConfirmDialog(null,"error al modificar el registro");
            limpiarJTEXT();
            construirTabla();
        }  
        
    }//GEN-LAST:event_jButtonModificarClienteActionPerformed

    private void jButtonGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarClienteActionPerformed
        validaCliente();       
        Proveedor sqlP =new Proveedor();
        Proveedor pv=new Proveedor();
        pv.setNombre(jTextNombreProv.getText());
        pv.setRazonSocial(jTextRazonSocialProv.getText());
        pv.setCUIT(jTextCuitProv.getText());
        pv.setDomicilio(jTextDomProv.getText());
        pv.setTelefono(jTextTelefonoProv.getText());
        pv.setCorreo(jTextCorreoProv.getText());
  
        if(sqlP.registrarProveedor(pv)){
            JOptionPane.showConfirmDialog(null,"Registro Guardado");
            limpiarJTEXT();
            construirTabla();
        }else{
            JOptionPane.showConfirmDialog(null,"error al guardar el registro");
            limpiarJTEXT();
            construirTabla();
        }
    }//GEN-LAST:event_jButtonGuardarClienteActionPerformed
public void validaCliente(){
    if(jTextNombreProv.getText().equals("")||jTextRazonSocialProv.getText().equals("")||jTextCuitProv.getText().equals("")||jTextDomProv.getText().equals("")||jTextTelefonoProv.getText().equals("")||jTextCorreoProv.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Complete los campos obligatorios");
    }
}

private void limpiarJTEXT(){
    jTextID.setText(null);
    jTextNombreProv.setText(null);
    jTextRazonSocialProv.setText(null);
    jTextDomProv.setText(null);
    jTextCuitProv.setText(null);
    jTextTelefonoProv.setText(null);
    jTextCorreoProv.setText(null);

}

    private void jButtonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarClienteActionPerformed
    Cliente sqlC =new Cliente();

        
        int fila=jtablaProv.getSelectedRowCount();
        if(fila<1){
        JOptionPane.showMessageDialog(null,"Seleccione un registro...");
        }
        else{
            int sel=jtablaProv.getSelectedRow();
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

    private void jTextRazonSocialProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextRazonSocialProvKeyTyped
     char car =evt.getKeyChar();
     if((car<'a'||car>'z')&&(car<'A'||car>'Z'&&(car=='ñ')&&(car=='Ñ'))&&(car!=(char)KeyEvent.VK_BACK_SPACE)&&(car!=(char)KeyEvent.VK_SPACE)){
     evt.consume();
     JOptionPane.showMessageDialog(null,"solo se adminten letras","validar letras",JOptionPane.INFORMATION_MESSAGE);

     
     }
    }//GEN-LAST:event_jTextRazonSocialProvKeyTyped
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
    private void jTextCorreoProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextCorreoProvFocusLost
        if(ValCorreo(jTextCorreoProv.getText())){
        
        }else{
            JOptionPane.showMessageDialog(null,"Correo no valido","validar correo",JOptionPane.INFORMATION_MESSAGE);
            jTextCorreoProv.requestFocus();
            }
    }//GEN-LAST:event_jTextCorreoProvFocusLost

    private void jTextTelefonoProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelefonoProvKeyTyped
       char num =evt.getKeyChar();
     if((num<'0'||num>'9')&& (num!=(char)KeyEvent.VK_BACK_SPACE)){
     evt.consume();
     JOptionPane.showMessageDialog(null,"solo se adminten numeros","validar números",JOptionPane.INFORMATION_MESSAGE);

     
     } 
    }//GEN-LAST:event_jTextTelefonoProvKeyTyped

    private void jTextBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarKeyPressed
                String titulos[]={"ID","Nombre","Razon Social", "CUIT", "Domicilio", "Telefono","Correo"};

		String informacion[][]=buscarMatriz(); 
                
                model.addColumn("ID");
                model.addColumn("Nombre");
                model.addColumn("Razon Social");
                model.addColumn("CUIT");
                model.addColumn("Domicilio");
                model.addColumn("Telefono");
                model.addColumn("Correo");
                jtablaProv= new JTable(informacion,titulos);
               // jtablaClientes.setModel(model);
               jtablaProv=new JTable(informacion,titulos);
		barraTabla.setViewportView(jtablaProv);

    
    }//GEN-LAST:event_jTextBuscarKeyPressed

    private void jtablaProvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaProvMouseClicked
        int filaselec = jtablaProv.getSelectedRow();
        jTextID.setText(String.valueOf(jtablaProv.getValueAt(filaselec,0)));
        jTextNombreProv.setText(String.valueOf(jtablaProv.getValueAt(filaselec,1)));
        jTextRazonSocialProv.setText(String.valueOf(jtablaProv.getValueAt(filaselec,2)));
        jTextCuitProv.setText(String.valueOf(jtablaProv.getValueAt(filaselec,3)));
        jTextDomProv.setText(String.valueOf(jtablaProv.getValueAt(filaselec,4)));
        jTextTelefonoProv.setText(String.valueOf(jtablaProv.getValueAt(filaselec,5)));
        jTextCorreoProv.setText(String.valueOf(jtablaProv.getValueAt(filaselec,6)));
    }//GEN-LAST:event_jtablaProvMouseClicked

    private void barraTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraTablaMouseClicked
        int filaselec = jtablaProv.getSelectedRow();
        jTextID.setText(String.valueOf(jtablaProv.getValueAt(filaselec,0)));
        jTextNombreProv.setText(String.valueOf(jtablaProv.getValueAt(filaselec,1)));
        jTextRazonSocialProv.setText(String.valueOf(jtablaProv.getValueAt(filaselec,2)));
        jTextCuitProv.setText(String.valueOf(jtablaProv.getValueAt(filaselec,3)));
        jTextDomProv.setText(String.valueOf(jtablaProv.getValueAt(filaselec,4)));
        jTextTelefonoProv.setText(String.valueOf(jtablaProv.getValueAt(filaselec,5)));
        jTextCorreoProv.setText(String.valueOf(jtablaProv.getValueAt(filaselec,6)));

    }//GEN-LAST:event_barraTablaMouseClicked

    private void jTextNombreProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreProvActionPerformed

    private void jTextNombreProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreProvKeyTyped
char car =evt.getKeyChar();
     if((car<'a'||car>'z')&&(car<'A'||car>'Z'&&(car=='ñ')&&(car=='Ñ'))&&(car!=(char)KeyEvent.VK_BACK_SPACE)&&(car!=(char)KeyEvent.VK_SPACE)){
     evt.consume();
     JOptionPane.showMessageDialog(null,"solo se adminten letras","validar letras",JOptionPane.INFORMATION_MESSAGE);

     
     }
    }//GEN-LAST:event_jTextNombreProvKeyTyped

    private void jTextDomProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDomProvKeyTyped
    char car =evt.getKeyChar();
     if((car<'a'||car>'z')&&(car<'A'||car>'Z'&&(car=='ñ')&&(car=='Ñ'))&&(car!=(char)KeyEvent.VK_BACK_SPACE)&&(car!=(char)KeyEvent.VK_SPACE)){
     evt.consume();
     JOptionPane.showMessageDialog(null,"solo se adminten letras","validar letras",JOptionPane.INFORMATION_MESSAGE);

     
     }
    }//GEN-LAST:event_jTextDomProvKeyTyped

    private void jTextCuitProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCuitProvKeyTyped
       char num =evt.getKeyChar();
     if((num<'0'||num>'9')&& (num!=(char)KeyEvent.VK_BACK_SPACE)){
     evt.consume();
     JOptionPane.showMessageDialog(null,"solo se adminten numeros","validar números",JOptionPane.INFORMATION_MESSAGE);

     
     }   
    }//GEN-LAST:event_jTextCuitProvKeyTyped

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
            java.util.logging.Logger.getLogger(formProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formProv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane barraTabla;
    private javax.swing.JButton jButtonEliminarCliente;
    private javax.swing.JButton jButtonGuardarCliente;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonModificarCliente;
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
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextCorreoProv;
    private javax.swing.JTextField jTextCuitProv;
    private javax.swing.JTextField jTextDomProv;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNombreProv;
    private javax.swing.JTextField jTextRazonSocialProv;
    private javax.swing.JTextField jTextTelefonoProv;
    public static javax.swing.JLabel jUsuario;
    private javax.swing.JTable jtablaProv;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelFormularioCliente;
    // End of variables declaration//GEN-END:variables
}
