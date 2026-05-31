/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanWare.model;

/**
 *
 * @author Usuario
 */
public class Usuario {
      private int idUsuario;
    private String nombreUsuario;
    private String contrasena;
    private String email;

    public Usuario(int idUsuario, String nombreUsuario, String contrasena, String email) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.email = email;
    }

    public boolean iniciarSesion() {
        System.out.println("Sesión iniciada");
        return true;
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada");
    }

    public void actualizarPerfil() {
        System.out.println("Perfil actualizado");
    }

    public void cambiarContrasena(String nuevaContrasena) {
        this.contrasena = nuevaContrasena;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
