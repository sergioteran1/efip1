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


public class Proveedor extends Persona {
private int id_prov;
conexion con = new conexion();
    
public Proveedor(){
super();
}



    public int getId_prov() {
        return id_prov;
    }

    public void setId_prov(int id_prov) {
        this.id_prov = id_prov;
    }
    
    
    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

        private String CUIT;
        private String RazonSocial;


public boolean registrarProveedor(Proveedor pv){
   // PreparedStatement ps=null;
    
    String sql="insert into proveedores(nombre_prov,razonsocial,CUIT,domicilio,telefono,email,)values(?,?,?,?,?,?)";
   
        try {
        //ps.setString(5,Double.parseDouble(JText.getText()));
        PreparedStatement ps = con.getConexion().prepareStatement(sql);
           // ps.setInt(1,1);
            ps.setString(1,pv.getNombre());
            ps.setString(2,pv.getRazonSocial());
            ps.setString(3,pv.getCUIT());
            ps.setString(4,pv.getDomicilio());
            ps.setString(5,pv.getTelefono());
            ps.setString(6,pv.getCorreo());
            
            //ps.setString(6,transp.getNombre());
          //  ps.setString(6,usr.getNota());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        
        return false;
        }
    
    }

public boolean ActualizarProveedor(Proveedor pv){
 //   PreparedStatement ps=null;
    
 
    String sql="update proveedores set nombre_prov=?,razonsocial=?,CUIT=?,domicilio=?,telefono=?,email=? where id_proveedor=?";
    
        try {
        //ps.setString(5,Double.parseDouble(JText.getText()));
        PreparedStatement ps = con.getConexion().prepareStatement(sql);
           // ps.setInt(1,1);
            ps.setString(1,pv.getNombre());
            ps.setString(2,pv.getRazonSocial());
            ps.setString(3,pv.getCUIT());
            ps.setString(4,pv.getDomicilio());
            ps.setString(5,pv.getTelefono());
            //ps.setString(6,transp.getNombre());
            ps.setString(6,pv.getCorreo());
            ps.setInt(7,pv.getId_prov());
           // ps.setInt(6,Integer.parseInt(usr.getIdCliente()));
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        
        return false;
        }
    
    }
public int EliminarCliente(int id ){
   // JTable t=new JTable();
   Proveedor pv=null; 
   //Cliente usr= new Cliente();
    String sql="DELETE FROM proveedores WHERE id_proveedor=?";   
   int res=0;
   try{
     
       PreparedStatement ps = con.getConexion().prepareStatement(sql);
      ps.setInt(1,pv.getId_prov());
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
public ArrayList<Proveedor> buscarProvConMatriz() {

		conexion con = new conexion();
		ArrayList<Proveedor> miLista = new ArrayList<>();
		Proveedor pv;
                
                		try {
                    try (Statement estatuto = con.getConexion().createStatement();
                         ResultSet rs = estatuto.executeQuery("SELECT * FROM proveedores")) {
                        
                        while (rs.next()) {
                          pv=new Proveedor();  
                           pv.setId_prov(Integer.parseInt(rs.getString("id_proveedor")));
                            pv.setNombre(rs.getString("nombre_prov"));
                            pv.setRazonSocial(rs.getString("razonsocial"));
                            //cl.setEdadPersona(Integer.parseInt(rs.getString("edad")));
                            pv.setCUIT(rs.getString("CUIT"));
                            pv.setDomicilio(rs.getString("domicilio"));
                            pv.setTelefono(rs.getString("telefono"));
                            pv.setCorreo(rs.getString("email"));
                           // cl.setNota(rs.getString("nota"));
                            miLista.add(pv);
                        }
                    }
			con.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al buscar consulta: ", "Error",JOptionPane.ERROR_MESSAGE);

		}
		return miLista;
	}
public ArrayList<Proveedor> buscarUsuarios(String sql) {

		
		ArrayList<Proveedor> miLista = new ArrayList<>();
		Proveedor pv;
               
                		try {
                    try (Statement estatuto = con.getConexion().createStatement();
                         ResultSet rs = estatuto.executeQuery(sql)) {
                        
                        while (rs.next()) {
                           pv = new Proveedor();
                            pv.setId_prov(Integer.parseInt(rs.getString("id_proveedor")));
                            pv.setNombre(rs.getString("nombre_prov"));
                            pv.setRazonSocial(rs.getString("razonsocial"));
                            //cl.setEdadPersona(Integer.parseInt(rs.getString("edad")));
                            pv.setCUIT(rs.getString("CUIT"));
                            pv.setDomicilio(rs.getString("domicilio"));
                            pv.setTelefono(rs.getString("telefono"));
                            pv.setCorreo(rs.getString("email"));
                            miLista.add(pv);
                        }
                    }
			con.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al  buscar proveedor", "Error",JOptionPane.ERROR_MESSAGE);

		}
		return miLista;
	}
}
