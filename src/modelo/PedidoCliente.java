package modelo;

import conexion.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class PedidoCliente {

        private String Producto;
        private int CantidadProducto;
        private String cliente;
        private float imp_s_imp;
        private float imp_c_imp;
        private String detallepedido;
        private String nroPedido;
        private float precio;
        private float subtotal;
        private String fecha;
        conexion con = new conexion();

    public PedidoCliente() {
    }
        

    public PedidoCliente(float precio) {
        this.precio = precio;
    }
       

    public PedidoCliente(String Producto, int CantidadProducto, float precio) {
        this.Producto = Producto;
        this.CantidadProducto = CantidadProducto;
        this.precio = precio;
    }
        

    public PedidoCliente(String nroPedido,String Producto, int CantidadProducto,  float precio, float subtotal) {
        this.Producto = Producto;
        this.CantidadProducto = CantidadProducto;
        this.nroPedido = nroPedido;
        this.precio = precio;
        this.subtotal = subtotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

      public float getImp_s_imp() {
        return imp_s_imp;
    }

    public void setImp_s_imp(float imp_s_imp) {
        this.imp_s_imp = imp_s_imp;
    }

    public float getImp_c_imp() {
        return imp_c_imp;
    }

    public void setImp_c_imp(float imp_c_imp) {
        this.imp_c_imp = imp_c_imp;
    }
    


    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getCantidadProducto() {
        return CantidadProducto;
    }

    public void setCantidadProducto(int CantidadProducto) {
        this.CantidadProducto = CantidadProducto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDetallepedido() {
        return detallepedido;
    }

    public void setDetallepedido(String detallepedido) {
        this.detallepedido = detallepedido;
    }

    public String getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(String nroPedido) {
        this.nroPedido = nroPedido;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
 

        public void modificarPedidoCliente(){
                // Implementation Here.
        }

        public void eliminarPedidoCliente(){
                // Implementation Here.
        }

        public void cargarPedidoCliente(){
                // Implementation Here.
        }

      
 public static ArrayList<String> llenar_combo(){
        ArrayList<String> lista =new ArrayList<String>();
            //  String query ="SELECT * FROM clientes";
      
         // String sql="SELECT * FROM usuario WHERE nick='"+usuario+"' && password='"+pass+"'";
   
        try {
            //ps.setString(5,Double.parseDouble(JText.getText()));
           conexion con=new conexion();
            Statement estatuto = con.getConexion().createStatement();
           ResultSet rs = estatuto.executeQuery("SELECT * FROM clientes");
           
           while (rs.next()) {
               lista.add(rs.getString("razon_social"));
               
               }
                  
            
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
               
        }
       return lista;
        }
public ArrayList<PedidoCliente> buscarUsuariosConMatriz() {

		
		ArrayList<PedidoCliente> PedidoCl = new ArrayList<>();
		PedidoCliente cl;
                		try {
                    try (Statement st = con.getConexion().createStatement();
                         ResultSet rs = st.executeQuery("SELECT pedidos.id_pedido,clientes.razon_social,pedidos.total_s_imp,pedidos.total_c_imp,pedidos.fecha_pedido FROM pedidos,clientes WHERE pedidos.id_cliente=clientes.id_cliente")) {
                        
                        while (rs.next()) {
                            cl = new PedidoCliente();
                            cl.setNroPedido(rs.getString("id_pedido"));
                            cl.setCliente(rs.getString("razon_social"));
                            cl.setImp_s_imp(Float.parseFloat(rs.getString("total_s_imp")));
                            cl.setImp_c_imp(Float.parseFloat(rs.getString("total_c_imp")));
                            cl.setFecha(rs.getString("fecha_pedido"));
                            PedidoCl.add(cl);
                        }
                    }
			con.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al consultar", "Error",
					JOptionPane.ERROR_MESSAGE);

		}
		return PedidoCl;
	}        

}
