package modelo;

import conexion.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Producto {
        private int idProducto;
        private String cod_Producto;
        private String NombreProducto;
        private int CantidadProducto;
        private float PrecioCostoProd;
        private float PrecioVentaProd;
        
        private String CategoriaProducto;
        private String origen;
        private String fecha_ingreso;
        conexion con=new conexion();
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCod_Producto() {
        return cod_Producto;
    }

    public void setCod_Producto(String cod_Producto) {
        this.cod_Producto = cod_Producto;
    }

   

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public int getCantidadProducto() {
        return CantidadProducto;
    }

    public void setCantidadProducto(int CantidadProducto) {
        this.CantidadProducto = CantidadProducto;
    }

    public float getPrecioCostoProd() {
        return PrecioCostoProd;
    }

    public void setPrecioCostoProd(float PrecioCostoProd) {
        this.PrecioCostoProd = PrecioCostoProd;
    }

    public float getPrecioVentaProd() {
        return PrecioVentaProd;
    }

    public void setPrecioVentaProd(float PrecioVentaProd) {
        this.PrecioVentaProd = PrecioVentaProd;
    }

 

    public String getCategoriaProducto() {
        return CategoriaProducto;
    }

    public void setCategoriaProducto(String CategoriaProducto) {
        this.CategoriaProducto = CategoriaProducto;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    
     public static ArrayList<String> llenarProducto(){
        ArrayList<String> lista =new ArrayList<String>();
     
        conexion con = new conexion();
   
   
        try {
            //ps.setString(5,Double.parseDouble(JText.getText()));
           Statement estatuto = con.getConexion().createStatement();
           ResultSet rs = estatuto.executeQuery("SELECT * FROM productos");
           while (rs.next()) {
               lista.add(rs.getString("producto"));
              //lista.add(rs.getString("precio_venta"));
               }
                  
            
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        
        
        }
       return lista;
        }
    void descontarstock(String codi,String can)
    {
       int des = Integer.parseInt(can);
       String cap="";
       int desfinal;
       
        try {
            Statement estatuto = con.getConexion().createStatement();
           ResultSet rs = estatuto.executeQuery("SELECT * FROM productos WHERE id_producto='"+codi+"'");
            while(rs.next())
            {
                cap= rs.getString(4);
            }
            
            
        } catch (Exception e) {
        }
        desfinal=Integer.parseInt(cap)-des;
        String modi="UPDATE producto SET Stock='"+desfinal+"' WHERE cod_pro = '"+codi+"'";
        try {
            PreparedStatement pst = (PreparedStatement) con.getConexion();
            pst.executeUpdate(modi);
        } catch (Exception e) {
        }
        
    }      
public boolean registrarCliente(Producto prod){
   // PreparedStatement ps=null;
  
    String sql="insert into productos(codigo_interno,producto,cant_producto,precio_costo,precio_venta)values(?,?,?,?,?)";
   
        try {
        //ps.setString(5,Double.parseDouble(JText.getText()));
        PreparedStatement ps = con.getConexion().prepareStatement(sql);
        // ps.setInt(1,1);

            ps.setString(1,prod.getCod_Producto());
            ps.setString(2,prod.getNombreProducto());
            ps.setInt(3,prod.getCantidadProducto());
            ps.setFloat(4,prod.getPrecioCostoProd());
            ps.setFloat(5,prod.getPrecioVentaProd());
            ps.setString(6,prod.getFecha_ingreso());
            
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        
        return false;
        }
    
    }

public boolean ActualizarProducto(Producto pd){
 //   PreparedStatement ps=null;
    
    
    String sql="update productos set codigo_interno=?,producto=?,cant_producto=?,precio_costo=?,precio_venta=?,fecha_ingreso=? where id_producto=?";
    
        try {
        //ps.setString(5,Double.parseDouble(JText.getText()));
        PreparedStatement ps = con.getConexion().prepareStatement(sql);
           // ps.setInt(1,1);
            ps.setString(1,pd.getCod_Producto());
            ps.setString(2,pd.getNombreProducto());
            ps.setInt(3,pd.getCantidadProducto());
            ps.setFloat(4,pd.getPrecioCostoProd());
            ps.setFloat(5,pd.getPrecioVentaProd());
            //ps.setString(6,transp.getNombre());
            ps.setString(6,pd.getFecha_ingreso());
            ps.setInt(7,pd.getIdProducto());
           // ps.setInt(6,Integer.parseInt(usr.getIdCliente()));
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        
        return false;
        }
    
    }
public int EliminarCliente(int id ){
   // JTable t=new JTable();
    Cliente usr= new Cliente();
    String sql="DELETE FROM clientes WHERE id_cliente=?";   
   int res=0;
   try{
      
        PreparedStatement ps = con.getConexion().prepareStatement(sql);
      ps.setInt(1,usr.getIdCliente());
      res=ps.executeUpdate();
      if(res>0){
      JOptionPane.showMessageDialog(null,"registro eliminado");
      }
   }catch(SQLException e){
       System.out.println("res valor: "+res);
       JOptionPane.showMessageDialog(null,"error al eliminar registro"+e.getMessage());
   }
   return res;
}
public ArrayList<Producto> buscarUsuariosConMatriz() {

		
		ArrayList<Producto> miLista = new ArrayList<>();
		
                Producto pd;
                		try {
                    try (Statement estatuto = con.getConexion().createStatement();
                         ResultSet rs = estatuto.executeQuery("SELECT * FROM productos")) {
                        
                        while (rs.next()) {
                            pd = new Producto();
                            pd.setIdProducto(Integer.parseInt(rs.getString("id_producto")));
                            pd.setCod_Producto(rs.getString("codigo_interno"));
                            pd.setNombreProducto(rs.getString("producto"));
                            pd.setCantidadProducto(Integer.parseInt(rs.getString("cant_producto")));
                            pd.setPrecioCostoProd(Float.parseFloat(rs.getString("precio_costo")));
                            //cl.setEdadPersona(Integer.parseInt(rs.getString("edad")));
                            pd.setPrecioVentaProd(Float.parseFloat(rs.getString("precio_venta")));
                            pd.setFecha_ingreso(rs.getString("fecha_ingreso"));
                            miLista.add(pd);
                        }
                    }
			con.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al consultar", "Error",
					JOptionPane.ERROR_MESSAGE);

		}
		return miLista;
	}
public ArrayList<Producto> buscarUsuarios(String sql) {

		
		ArrayList<Producto> miLista = new ArrayList<>();
		Producto pd;
               
                		try {
                    try (Statement estatuto = con.getConexion().createStatement();
                         ResultSet rs = estatuto.executeQuery(sql)) {
                        
                        while (rs.next()) {
                            pd = new Producto();
                            pd.setCod_Producto(rs.getString("codigo_interno"));
                            pd.setNombreProducto(rs.getString("producto"));
                            pd.setCantidadProducto(Integer.parseInt(rs.getString("cant_producto")));
                            pd.setPrecioCostoProd(Float.parseFloat(rs.getString("precio_costo")));
                            pd.setPrecioVentaProd(Float.parseFloat(rs.getString("precio_venta")));
                            pd.setFecha_ingreso(rs.getString("fecha_ingreso"));
                          
                            miLista.add(pd);
                        }
                    }
			con.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error en la busqueda", "Error",
					JOptionPane.ERROR_MESSAGE);

		}
		return miLista;
	}
  

}
