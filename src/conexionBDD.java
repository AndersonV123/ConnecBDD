import java.sql.*;


public class conexionBDD {
    String servidor;
    String usuario;
    String password;
    String mensaje;

    public conexionBDD(String servidor, String usuario, String password) {
        this.servidor = servidor;
        this.usuario = usuario;
        this.password = password;
    }

    public conexionBDD() {
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void conexionLocal(String servidor, String usuario, String password){
        try(Connection connection=DriverManager.getConnection(servidor,usuario,password)){
            if(connection!=null){
                mensaje="Conexión correcta";
                System.out.println(mensaje);
            }
        }
        catch (SQLException e){
            //mensaje="Conexión fallida";
            //System.out.println(mensaje);
            e.printStackTrace();
        }

    }
}