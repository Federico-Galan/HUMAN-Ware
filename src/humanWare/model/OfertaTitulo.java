/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanWare.model;

/**
 *
 * @author  
 */
public class OfertaTitulo {
    private boolean obligatorio;
    private Titulo titulo;

    public OfertaTitulo(boolean obligatorio, Titulo titulo) {
        this.obligatorio = obligatorio;
        this.titulo = titulo;
    }

    
    public boolean validarTitulo(Titulo tituloPostulante) {
        if (!obligatorio) return true;
        if (tituloPostulante == null) return false;
        return this.titulo.getIdTitulo() == tituloPostulante.getIdTitulo();
    }
    
    public Titulo obtenerTitulo() { return titulo; }
    public boolean isObligatorio() { return obligatorio; }
    
    @Override
    public String toString() {
        return "OfertaTitulo{titulo=" + titulo.getNombre() + ", obligatorio=" + obligatorio + "}";
    }
}
