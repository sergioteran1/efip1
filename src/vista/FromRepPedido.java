/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.PedidoCliente;

/**
 *
 * @author viviana
 */
public class FromRepPedido extends javax.swing.JFrame {

    DefaultTableModel model=new DefaultTableModel();
    public FromRepPedido() {
        initComponents();
        construirTabla();
    }
private void construirTabla() {
		
                String titulos[]={"Nro Pedido","Cliente", "Importe s/imp", "Importe c/imp", "Fecha"};
		String informacion[][]=obtenerMatriz(); 
                
                model.addColumn("Nro Pedido");
                model.addColumn("Cliente");
                model.addColumn("Importe s/imp");
                model.addColumn("Importe c/imp");
                model.addColumn("Fecha");
                model.addColumn("Correo");
               
                jTableRepPedido= new JTable(informacion,titulos);
               // jtablaClientes.setModel(model);
               //jtablaClientes=new JTable(informacion,titulos);
		jScrollPane1.setViewportView(jTableRepPedido);

                       //jtablaClientes.setVisible(true);
	}
private String[][] obtenerMatriz() {
		
		Cliente buscarPersona=new Cliente();
                PedidoCliente pC=new PedidoCliente();
               
		ArrayList<PedidoCliente>listaPed=pC.buscarUsuariosConMatriz();
		String matrizInfo[][]=new String[listaPed.size()][5];
		
		for (int i = 0; i < listaPed.size(); i++) {
                        matrizInfo[i][0]=listaPed.get(i).getNroPedido()+"";
			matrizInfo[i][1]=listaPed.get(i).getCliente()+"";
			matrizInfo[i][2]=listaPed.get(i).getImp_s_imp()+"";
			matrizInfo[i][3]=listaPed.get(i).getImp_c_imp()+"";
			matrizInfo[i][4]=listaPed.get(i).getFecha()+"";
			
		}
			
		return matrizInfo;
	}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRepPedido = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Pedidos:");

        jTableRepPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableRepPedido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FromRepPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromRepPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromRepPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromRepPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromRepPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRepPedido;
    // End of variables declaration//GEN-END:variables
}
