/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import enums.EstadoOferta;
import enums.TipoJornada;
/**
 *
 * @author 
 */
public class OfertaLaboralDTO{
    private int idOferta;
    private String titulo;
    private double salarioMin;
    private double salarioMax;
    private TipoJornada jornada;
    private EstadoOferta estado;
    
    public OfertaLaboralDTO(int idOferta, String titulo, double salarioMin, double salarioMax, TipoJornada jornada, EstadoOferta estado){
        this.idOferta = idOferta;
        this.titulo = titulo;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
        this.jornada = jornada;
        this.estado = estado;
    }
    
    public int getIdOferta(){
        return idOferta;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public double getSalarioMin(){
        return salarioMin;
    }
    
    public double getSalarioMax(){
        return salarioMax;
    }
    
    public TipoJornada getJornada(){
        return jornada;
    }
    
    public EstadoOferta getEstado(){
        return estado;
    }
}
