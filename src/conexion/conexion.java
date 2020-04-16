
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;




public class conexion {
private  Connection conn=null;  
private final String driver="com.mysql.jdbc.Driver";
private final String base="all_car";
private  final String user="root";
private final String pass="";
private final String url= "jdbc:mysql://localhost:3306/"+base;
PreparedStatement ps=null;
    public conexion()  {
   
    }
public Connection getConexion(){
    try {
        Class.forName(driver);
        conn=(Connection) DriverManager.getConnection(this.url,this.user,this.pass);

    } 
    catch (SQLException e) {
        System.err.println(e);
    }catch(ClassNotFoundException ex){
    Logger.getLogger(conexion.class.getName()).log(Level.SEVERE,null, ex);
    }
return conn;
}
 public void desconectar(){
      conn = null;
   }

}