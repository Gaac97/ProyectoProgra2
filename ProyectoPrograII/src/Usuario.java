
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Alvarado
 */
public class Usuario {
   public String nombre;
   public String Nickname;
   public String contrasena;
   public String Pais;
   public String fecha;
   private ArrayList<Usuario> ListSolicitudes= new ArrayList();
   private ArrayList<Usuario>ListMensajes = new ArrayList();
   private ArrayList <Usuario> ListPost = new ArrayList();

    public Usuario(String nombre, String Nickname, String contrasena, String Pais, String fecha) {
        this.nombre = nombre;
        this.Nickname = Nickname;
        this.contrasena = contrasena;
        this.Pais = Pais;
        this.fecha = fecha;
    }

    

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
 


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   

    public ArrayList<Usuario> getListSolicitudes() {
        return ListSolicitudes;
    }

    public void setListSolicitudes(Usuario x) {
      ListSolicitudes.add(x);
    }

    public ArrayList<Usuario> getListMensajes() {
        return ListMensajes;
    }

    public void setListMensajes(Usuario y) {
        ListMensajes.add(y);
    }

    public ArrayList<Usuario> getListPost() {
        return ListPost;
    }

    public void setListPost(Usuario x) {
        ListPost.add(x
        );
    }
    

    @Override
    public String toString() {
        return Nickname;
    }
   
   
    
}
