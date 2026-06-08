/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanWare.model;

/**
 *
 * @author  
 */
public class OfertaSkill {
    private int nivelMinimo;
    private Skills skill;

    public OfertaSkill(int nivelMinimo, Skills skill) {
        this.nivelMinimo = nivelMinimo;
        this.skill = skill;
    }
     
    public boolean validarNivel(int nivelPostulante) {
        return nivelPostulante >= nivelMinimo;
    }
    
    public Skills obtenerSkill() { return skill; }
    public int getNivelMinimo() { return nivelMinimo; }
    public void setNivelMinimo(int nivelMinimo) { this.nivelMinimo = nivelMinimo; }
    
    @Override
    public String toString() {
        return "OfertaSkill{skill=" + skill.getNombre() + ", nivelMinimo=" + nivelMinimo + "}";
    }
    
    
}
