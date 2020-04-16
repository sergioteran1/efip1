package modelo;

import conexion.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.formPrincipal;
import vista.formRegistar;

public class Usuario extends Persona {
   
     
     String usuario;

    public Usuario() {
    }

    public Usuario(String usuario) {
        this.usuario = usuario;
    }

     
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
   
public void registrarUsuario(String usuario, String pass){
  // PreparedStatement ps=null;
       
      
        try {
            String cap="";
            conexion cn= new conexion();
           Statement estatuto = cn.getConexion().createStatement();
           ResultSet rs = estatuto.executeQuery("SELECT * FROM usuarios WHERE usuario='"+usuario+"' && pass='"+pass+"'");
         
           while(rs.next())
            {
                cap=rs.getString("tipo_usuario");
              //cl.setCUIT(rs.getString("domicilio"));
               
                
            }
            if(cap.equals("Administrador"))
            {
              
                    formPrincipal ingreso = new formPrincipal();
                    ingreso.setVisible(true);
                    ingreso.pack();
                    formPrincipal.jUsuario.setText(usuario);
                    
                   
                
            }
            if(cap.equals("R_Venta"))
            {
         
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                     formPrincipal ingresos = new formPrincipal();
                    ingresos.setVisible(true);
                    ingresos.pack();
                    formPrincipal.jUsuario.setText(usuario);
                    
            }
            if((!cap.equals("Administrador"))&& (!cap.equals("R_Venta")))
            {
                JOptionPane.showMessageDialog(null, "No existe sus datos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(formRegistar.class.getName()).log(Level.SEVERE, null, ex);
        
            }
        }
  
}