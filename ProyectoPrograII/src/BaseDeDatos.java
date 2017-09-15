
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Alvarado
 */
public class BaseDeDatos {
     private String base_datos;
    private Connection dbcon;
    public Statement query;

    public Connection getDbcon() {
        return dbcon;
    }

    public void setDbcon(Connection dbcon) {
        this.dbcon = dbcon;
    }

    public Statement getQuery() {
        return query;
    }

    public void setQuery(Statement query) {
        this.query = query;
    }

    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        BaseDeDatos.conn = conn;
    }

    public static Statement getSt() {
        return st;
    }

    public static void setSt(Statement st) {
        BaseDeDatos.st = st;
    }

    public static ResultSet getRs() {
        return rs;
    }

    public static void setRs(ResultSet rs) {
        BaseDeDatos.rs = rs;
    }

    static Connection conn = null;
    static Statement st = null;
    static ResultSet rs = null;

    public BaseDeDatos(String base_datos) {
        this.base_datos = base_datos;
    }

    public void setBase_datos(String base_datos) {
        this.base_datos = base_datos;
    }

    public BaseDeDatos() {
    }
    

    public void conectar() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("1");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "PROYECTO", "1234");
            System.out.println("2");
            query = conn.createStatement();
            System.out.println("conecto");
        } catch (Exception e) {
            System.out.println("Clase no encontrada");
            e.printStackTrace();
        }
    }
    
    
    public void desconectar() {
        try {
            query.close();
            conn.close();
        } catch (Exception e) {
        }
    }

    public void commit() {
        try {
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
