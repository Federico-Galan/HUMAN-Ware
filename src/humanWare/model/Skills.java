/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanWare.model;

/**
 *
 * @author  
 */
public class Skills {
    private int idSkill;
    private String nombre;

    public Skills(int idSkill, String nombre) {
        this.idSkill = idSkill;
        this.nombre = nombre;
    }

    public int getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(int idSkill) {
        this.idSkill = idSkill;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtenerNombre() { return nombre; }
    
    @Override
    public String toString() {
        return "Skills{id=" + idSkill + ", nombre='" + nombre + "'}";
    }
    
    
}
