package vista;
import modelo.Cliente;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class formCliente extends javax.swing.JFrame {

    /**
     * Creates new form formCliente
     */
    DefaultTableModel model = new DefaultTableModel();
    
    public formCliente() {
        initComponents();
        jButtonEliminarCliente.setVisible(false);
        jTextID.setVisible(false);
        setTitle("ALL-CAR: Clientes");
       construirTabla();
                
    }
private void construirTabla() {
		
                String titulos[]={"ID","Nombre", "CUIT", "Domicilio", "Telefono","Correo","Nota" };
		String informacion[][]=obtenerMatriz(); 
                
                model.addColumn("ID");
                model.addColumn("Nombre");
                model.addColumn("Apellido");
                model.addColumn("Cuit");
                model.addColumn("Telefono");
                model.addColumn("Correo");
               // model.addColumn("Transporte");
                model.addColumn("Nota");
                jtablaClientes= new JTable(informacion,titulos);
               // jtablaClientes.setModel(model);
               //jtablaClientes=new JTable(informacion,titulos);
		barraTabla.setViewportView(jtablaClientes);

                       //jtablaClientes.setVisible(true);
	}
private String[][] obtenerMatriz() {
		
		Cliente buscarPersona=new Cliente();
                
               
		ArrayList<Cliente>listaCl=buscarPersona.buscarUsuariosConMatriz();
		String matrizInfo[][]=new String[listaCl.size()][7];
		
		for (int i = 0; i < listaCl.size(); i++) {
                        matrizInfo[i][0]=listaCl.get(i).getIdCliente()+"";
			matrizInfo[i][1]=listaCl.get(i).getNombre()+"";
			matrizInfo[i][2]=listaCl.get(i).getApellido()+"";
			matrizInfo[i][3]=listaCl.get(i).getCUIT()+"";
			matrizInfo[i][4]=listaCl.get(i).getTelefono()+"";
			matrizInfo[i][5]=listaCl.get(i).getCorreo()+"";
                        matrizInfo[i][6]=listaCl.get(i).getNota()+"";
		}
			
		return matrizInfo;
	}
private String[][] buscarMatriz() {
		
		Cliente buscarPersona=new Cliente();
                
               String sql= "SELECT * FROM clientes WHERE razon_social LIKE '%"+ jTextBuscar.getText()+"%' ";
		ArrayList<Cliente>miLista=buscarPersona.buscarUsuarios(sql);
		String matrizInfo[][]=new String[miLista.size()][7];
		
		for (int i = 0; i < miLista.size(); i++) {
                        matrizInfo[i][0]=miLista.get(i).getIdCliente()+"";
			matrizInfo[i][1]=miLista.get(i).getNombre()+"";
			matrizInfo[i][2]=miLista.get(i).getApellido()+"";
			matrizInfo[i][3]=miLista.get(i).getCUIT()+"";
			matrizInfo[i][4]=miLista.get(i).getTelefono()+"";
			matrizInfo[i][5]=miLista.get(i).getCorreo()+"";
                        matrizInfo[i][6]=miLista.get(i).getNota()+"";
		}
			
		return matrizInfo;
	}

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraTabla = new javax.swing.JScrollPane();
        jtablaClientes = new javax.swing.JTable();
        panelFormularioCliente = new javax.swing.JPanel();
        jTextRazonSocial = new javax.swing.JTextField();
        jTextCuit = new javax.swing.JTextField();
        jTextDomicilio = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        jTextCorreo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNota = new javax.swing.JTextArea();
        jTextID = new javax.swing.JTextField();
        jButtonModificarCliente = new javax.swing.JButton();
        jButtonGuardarCliente = new javax.swing.JButton();
        jButtonEliminarCliente = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        barraTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barraTablaMouseClicked(evt);
            }
        });

        jtablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaClientesMouseClicked(evt);
            }
        });
        barraTabla.setViewportView(jtablaClientes);

        jTextRazonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRazonSocialActionPerformed(evt);
            }
        });
        jTextRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextRazonSocialKeyTyped(evt);
            }
        });

        jTextCuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCuitActionPerformed(evt);
            }
        });
        jTextCuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCuitKeyTyped(evt);
            }
        });

        jTextDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDomicilioActionPerformed(evt);
            }
        });
        jTextDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDomicilioKeyTyped(evt);
            }
        });

        jTextTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelefonoKeyTyped(evt);
            }
        });

        jTextCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextCorreoFocusLost(evt);
            }
        });
        jTextCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCorreoActionPerformed(evt);
            }
        });

        jTextAreaNota.setColumns(20);
        jTextAreaNota.setRows(5);
        jScrollPane1.setViewportView(jTextAreaNota);

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

        jLabel2.setText("Razon Social");

        jLabel3.setText("CUIT:");

        jLabel4.setText("Domicilio:");

        jLabel5.setText("Telefono:");

        jLabel6.setText("Nota");

        jLabel8.setText("Correo:");

        jLabel9.setText("CLIENTE");

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
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)))
                            .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextTelefono)
                            .addComponent(jTextCorreo)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(jTextCuit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextDomicilio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextRazonSocial, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        panelFormularioClienteLayout.setVerticalGroup(
            panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                        .addComponent(jTextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(panelFormularioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonModificarCliente)
                            .addComponent(jButtonLimpiar)
                            .addComponent(jButtonEliminarCliente)))
                    .addGroup(panelFormularioClienteLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
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
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void jTextRazonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRazonSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRazonSocialActionPerformed

    private void jTextCuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCuitActionPerformed

    private void jTextDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDomicilioActionPerformed

    private void jTextCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCorreoActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDActionPerformed

    private void jButtonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarClienteActionPerformed
        
        Cliente sqlC =new Cliente();
        Cliente cl =new Cliente();
        
        int filaSec=jtablaClientes.getSelectedRow();
        String idSel=(String)jtablaClientes.getValueAt(filaSec,0);
       // System.out.println("fila seleccionada: "+ idSel );

        cl.setNombre(jTextRazonSocial.getText());
        cl.setApellido(jTextCuit.getText());
        cl.setCUIT(jTextDomicilio.getText());
        cl.setTelefono(jTextTelefono.getText());
        cl.setCorreo(jTextCorreo.getText());
        cl.setNota(jTextAreaNota.getText());
        cl.setIdCliente(Integer.parseInt(idSel));
 
         JOptionPane.showMessageDialog(null,"variable id: "+ idSel);
         if(sqlC.ActualizarCliente(cl)){
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
        Cliente sqlC =new Cliente();
        Cliente cl =new Cliente();
       
        cl.setNombre(jTextRazonSocial.getText());
        cl.setApellido(jTextCuit.getText());
        cl.setCUIT(jTextDomicilio.getText());
        cl.setTelefono(jTextTelefono.getText());
        cl.setCorreo(jTextCorreo.getText());
       // tr.setNombre(jTextTransp.getText());
        cl.setNota(jTextAreaNota.getText());
        if(sqlC.registrarCliente(cl)){
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
    if(jTextRazonSocial.getText().equals("")||jTextCuit.getText().equals("")||jTextDomicilio.getText().equals("")||jTextTelefono.getText().equals("")||jTextCorreo.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Complete los campos obligatorios");
    }

}

private void limpiarJTEXT(){
    jTextID.setText(null);
    jTextRazonSocial.setText(null);
    jTextCuit.setText(null);
    jTextDomicilio.setText(null);
    jTextTelefono.setText(null);
    jTextCorreo.setText(null);
    //jTextTransp.setText(null);
    jTextAreaNota.setText(null);
}

    private void jButtonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarClienteActionPerformed
    Cliente sqlC =new Cliente();
      
        
        int fila=jtablaClientes.getSelectedRowCount();
        if(fila<1){
        JOptionPane.showMessageDialog(null,"Seleccione un registro...");
        }
        else{
            int sel=jtablaClientes.getSelectedRow();
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

    private void jtablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaClientesMouseClicked
       // int filaselec = jtablaClientes.rowAtPoint(evt.getPoint());
      //  System.out.println("fila 2: "+filaselec);
        //jTextID.setText(jtablaClientes.getValueAt(filaselec,0).toString());
        int filaselec = jtablaClientes.getSelectedRow();
        jTextID.setText(String.valueOf(jtablaClientes.getValueAt(filaselec,0)));
        //jTextNombre.setText(String.valueOf(jtablaClientes.getValueAt(filaselec,0)));
        jTextCuit.setText(String.valueOf(jtablaClientes.getValueAt(filaselec,1)));
        jTextDomicilio.setText(String.valueOf(jtablaClientes.getValueAt(filaselec,2)));
        jTextTelefono.setText(String.valueOf(jtablaClientes.getValueAt(filaselec,3)));
        jTextCorreo.setText(String.valueOf(jtablaClientes.getValueAt(filaselec,4)));

        //jTextApellido.setText(jtablaClientes.getValueAt(filaselec,1).toString());
        //jTextCuit.setText(jtablaClientes.getValueAt(filaselec,2).toString());
       // jTextTelefono.setText(jtablaClientes.getValueAt(filaselec,3).toString());
        jTextCorreo.setText(jtablaClientes.getValueAt(filaselec,5).toString());
        jTextAreaNota.setText(String.valueOf(jtablaClientes.getValueAt(filaselec,6)));
    }//GEN-LAST:event_jtablaClientesMouseClicked

    private void barraTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraTablaMouseClicked
 int filaselec = jtablaClientes.getSelectedRow();
        jTextID.setText(String.valueOf(jtablaClientes.getValueAt(filaselec,0)));
        jTextRazonSocial.setText(String.valueOf(jtablaClientes.getValueAt(filaselec,1)));
        jTextCuit.setText(String.valueOf(jtablaClientes.getValueAt(filaselec,2)));
        jTextDomicilio.setText(String.valueOf(jtablaClientes.getValueAt(filaselec,3)));
        jTextTelefono.setText(String.valueOf(jtablaClientes.getValueAt(filaselec,4)));
        jTextCorreo.setText(String.valueOf(jtablaClientes.getValueAt(filaselec,5)));
        jTextAreaNota.setText(String.valueOf(jtablaClientes.getValueAt(filaselec,6)));
    }//GEN-LAST:event_barraTablaMouseClicked

    private void jTextRazonSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextRazonSocialKeyTyped
     char car =evt.getKeyChar();
     if((car<'a'||car>'z')&&(car<'A'||car>'Z'&&(car=='ñ')&&(car=='Ñ'))&&(car!=(char)KeyEvent.VK_BACK_SPACE)&&(car!=(char)KeyEvent.VK_SPACE)){
     evt.consume();
     JOptionPane.showMessageDialog(null,"solo se adminten letras","validar letras",JOptionPane.INFORMATION_MESSAGE);
     }
    }//GEN-LAST:event_jTextRazonSocialKeyTyped

    private void jTextCuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCuitKeyTyped
    /* char car =evt.getKeyChar();
     if((car<'a'||car>'z')&&(car<'A'||car>'Z'&&(car=='ñ')&&(car=='Ñ'))&&(car!=(char)KeyEvent.VK_BACK_SPACE)&&(car!=(char)KeyEvent.VK_SPACE)){
     evt.consume();
     JOptionPane.showMessageDialog(null,"solo se adminten letras","validar letras",JOptionPane.INFORMATION_MESSAGE);

     
     }*/
        char num =evt.getKeyChar();
     if((num<'0'||num>'9')&& (num!=(char)KeyEvent.VK_BACK_SPACE)){
     evt.consume();
     JOptionPane.showMessageDialog(null,"solo se adminten numeros","validar números",JOptionPane.INFORMATION_MESSAGE);
 
     } 
    }//GEN-LAST:event_jTextCuitKeyTyped
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
    private void jTextCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextCorreoFocusLost
        if(ValCorreo(jTextCorreo.getText())){
        
        }else{
            JOptionPane.showMessageDialog(null,"Correo no valido","validar correo",JOptionPane.INFORMATION_MESSAGE);
            jTextCorreo.requestFocus();
            }
    }//GEN-LAST:event_jTextCorreoFocusLost

    private void jTextDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDomicilioKeyTyped
       /* char car =evt.getKeyChar();
        if((car<'a'||car>'z')&&(car<'A'||car>'Z'&&(car=='ñ')&&(car=='Ñ'))&&(car!=(char)KeyEvent.VK_BACK_SPACE)&&(car!=(char)KeyEvent.VK_SPACE)){
        evt.consume();
        JOptionPane.showMessageDialog(null,"solo se adminten letras","validar letras",JOptionPane.INFORMATION_MESSAGE);
        }  */ 
    }//GEN-LAST:event_jTextDomicilioKeyTyped

    private void jTextTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelefonoKeyTyped
     char num =evt.getKeyChar();
     if((num<'0'||num>'9')&& (num!=(char)KeyEvent.VK_BACK_SPACE)){
     evt.consume();
     JOptionPane.showMessageDialog(null,"solo se adminten numeros","validar números",JOptionPane.INFORMATION_MESSAGE);
 
     } 
    }//GEN-LAST:event_jTextTelefonoKeyTyped

    private void jTextBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarKeyPressed
                String titulos[]={"ID","Razon Social", "CUIT", "Domicilio", "Telefono","Correo","Nota" };

		String informacion[][]=buscarMatriz(); 
                
                model.addColumn("ID");
                model.addColumn("Nombre");
                model.addColumn("Apellido");
                model.addColumn("Cuit");
                model.addColumn("Telefono");
                model.addColumn("Correo");
               // model.addColumn("Transporte");
                model.addColumn("Nota");
                jtablaClientes= new JTable(informacion,titulos);
               // jtablaClientes.setModel(model);
               jtablaClientes=new JTable(informacion,titulos);
		barraTabla.setViewportView(jtablaClientes);

    
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
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCliente().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaNota;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextCorreo;
    private javax.swing.JTextField jTextCuit;
    private javax.swing.JTextField jTextDomicilio;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextRazonSocial;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JTable jtablaClientes;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelFormularioCliente;
    // End of variables declaration//GEN-END:variables
}
