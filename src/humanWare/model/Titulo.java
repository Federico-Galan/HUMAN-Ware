/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanWare.model;

/**
 *
 * @author  
 */
public class Titulo {
    
    private int idTitulo;
    private String nombre;

    public Titulo(int idTitulo, String nombre) {
        this.idTitulo = idTitulo;
        this.nombre = nombre;
    }

    public int getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(int idTitulo) {
        this.idTitulo = idTitulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Titulo{id=" + idTitulo + ", nombre='" + nombre + "'}";
    }
}
