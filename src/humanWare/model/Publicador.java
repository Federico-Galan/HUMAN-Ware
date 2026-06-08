/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanWare.model;

import enums.EstadoOferta;

/**
 *
 * @author  
 */

public class Publicador extends Empleado {
    
    public Publicador(int legajo) {
        super(legajo);
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
    
    public boolean validarOferta(OfertaLaboral oferta) {
        
        if (oferta.getTitulo() == null || oferta.getTitulo().isEmpty()) return false;
        if (oferta.getSalarioMin() <= 0) return false;
        if (oferta.getSalarioMax() < oferta.getSalarioMin()) return false;
        if (oferta.getOficina() == null || oferta.getOficina().isEmpty()) return false;
        return true;
    }
    
    public void publicarOferta(OfertaLaboral oferta) {
        if (validarOferta(oferta)) {
            oferta.setEstado(EstadoOferta.ACTIVA); 
            System.out.println("Oferta publicada: " + oferta.getTitulo());
        } else {
            System.out.println("Error: Oferta inválida para publicar");
        }
    }
    }


    

