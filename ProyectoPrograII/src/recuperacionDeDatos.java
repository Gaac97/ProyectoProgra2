
import static BaseDeDatos.conn;
import static BaseDeDatos.conn;
import static BaseDeDatos.conn;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Alvarado
 */
public class recuperacionDeDatos {
     PreparedStatement pst = null;

    public ArrayList<Usuario> cargarUsuario() {
        ArrayList<Usuario> listTransacciones = new ArrayList();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "MIGUEL", "mafr1997");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COD_TRANSACCION, DESCRIPCION, VALOR, FECHA_TRANSACCION, TIPO_TRANSACCION, NUM_CUENTA"
                    + " FROM TRANSACCIONES ORDER BY 2");
            while (rs.next()) {
                Usuario c1 = new Usuario();
                c1.setCodigo_transaccion(rs.getString("COD_TRANSACCION"));
                c1.setDescripcion_transaccion(rs.getString("DESCRIPCION"));
                c1.setValor_transaccion(rs.getDouble("VALOR"));
                c1.setFecha_transaccion(rs.getString("FECHA_TRANSACCION"));
                c1.setTipo_transaccion(rs.getString("TIPO_TRANSACCION"));
                c1.setNumero_cuenta(rs.getString("NUM_CUENTA"));
                listTransacciones.add(c1);
            }
        } catch (SQLException e) {
            System.out.println("error al listar");
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(recuperacionDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listTransacciones;
    }
    
}
