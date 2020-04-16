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

public class Cliente extends Persona{

    private int idCliente;
    private String RazonSocial;
    private String CUIT;
    private String nota;
    conexion con = new conexion();
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

  
     
       public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
   

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }
   
public boolean registrarCliente(Cliente usr){
   // PreparedStatement ps=null;
   
    
    String sql="insert into clientes(razon_social,cuit,domicilio,telefono,email,nota)values(?,?,?,?,?,?)";
   
        try {
        //ps.setString(5,Double.parseDouble(JText.getText()));
        PreparedStatement ps = con.getConexion().prepareStatement(sql);
        // ps.setInt(1,1);
           
            ps.setString(1,usr.getNombre());
            ps.setString(2,usr.getApellido());
            ps.setString(3,usr.getCUIT());
            ps.setString(4,usr.getTelefono());
            ps.setString(5,usr.getCorreo());
            //ps.setString(6,transp.getNombre());
            ps.setString(6,usr.getNota());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        
        return false;
        }
    
    }

public boolean ActualizarCliente(Cliente usr){
 //   PreparedStatement ps=null;
    
   
    String sql="update clientes set razon_social=?,cuit=?,domicilio=?,telefono=?,email=?,nota=? where id_cliente=?";
    
        try {
        //ps.setString(5,Double.parseDouble(JText.getText()));
        PreparedStatement ps = con.getConexion().prepareStatement(sql);
           // ps.setInt(1,1);
            ps.setString(1,usr.getNombre());
            ps.setString(2,usr.getApellido());
            ps.setString(3,usr.getCUIT());
            ps.setString(4,usr.getTelefono());
            ps.setString(5,usr.getCorreo());
            //ps.setString(6,transp.getNombre());
            ps.setString(6,usr.getNota());
            ps.setInt(7,usr.getIdCliente());
           // ps.setInt(6,Integer.parseInt(usr.getIdCliente()));
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        
        return false;
        }
    
    }
public int EliminarCliente(int id ){
   
    Cliente usr= new Cliente();
    String sql="DELETE FROM clientes WHERE id_cliente='"+ id+"'";   
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
public ArrayList<Cliente> buscarUsuariosConMatriz() {

		
		ArrayList<Cliente> listaCl = new ArrayList<>();
		Cliente cl;
                		try {
                    try (Statement st = con.getConexion().createStatement();
                         ResultSet rs = st.executeQuery("SELECT * FROM clientes")) {
                        
                        while (rs.next()) {
                            cl = new Cliente();
                            cl.setIdCliente(Integer.parseInt(rs.getString("id_cliente")));
                            cl.setNombre(rs.getString("razon_social"));
                            cl.setApellido(rs.getString("cuit"));
                            //cl.setEdadPersona(Integer.parseInt(rs.getString("edad")));
                            cl.setCUIT(rs.getString("domicilio"));
                            cl.setTelefono(rs.getString("telefono"));
                            cl.setCorreo(rs.getString("email"));
                            cl.setNota(rs.getString("nota"));
                            listaCl.add(cl);
                        }
                    }
			con.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al consultar", "Error",
					JOptionPane.ERROR_MESSAGE);

		}
		return listaCl;
	}
public ArrayList<Cliente> buscarUsuarios(String sql) {

		
		ArrayList<Cliente> miLista = new ArrayList<>();
		Cliente cl;
                		try {
                    try (Statement estatuto = con.getConexion().createStatement();
                         ResultSet rs = estatuto.executeQuery(sql)) {
                        
                        while (rs.next()) {
                            cl = new Cliente();
                            cl.setIdCliente(Integer.parseInt(rs.getString("id_cliente")));
                            cl.setNombre(rs.getString("razon_social"));
                            cl.setApellido(rs.getString("cuit"));
                            //cl.setEdadPersona(Integer.parseInt(rs.getString("edad")));
                            cl.setCUIT(rs.getString("domicilio"));
                            cl.setTelefono(rs.getString("telefono"));
                            cl.setCorreo(rs.getString("email"));
                            cl.setNota(rs.getString("nota"));
                            miLista.add(cl);
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
   

}
