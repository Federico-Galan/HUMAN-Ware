/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanWare.model;

import java.util.ArrayList;
import java.util.List;

public class Postulante {
    private String idPostulante;
    private double retribMin;
    private String jornada;
    private boolean dispViajar;
    private String vehiculo;
    private List<Application> solicitudes;

    public Postulante(String idPostulante, double retribMin, String jornada, 
            boolean dispViajar, String vehiculo) {
        this.idPostulante = idPostulante;
        this.retribMin = retribMin;
        this.jornada = jornada;
        this.dispViajar = dispViajar;
        this.vehiculo = vehiculo;
    }

    public String getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(String idPostulante) {
        this.idPostulante = idPostulante;
    }

    public double getRetribMin() {
        return retribMin;
    }

    public void setRetribMin(double retribMin) {
        this.retribMin = retribMin;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public boolean isDispViajar() {
        return dispViajar;
    }

    public void setDispViajar(boolean dispViajar) {
        this.dispViajar = dispViajar;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public String aplicarOferta(OfertaLaboral oferta){
        if(this.solicitudes != null && this.solicitudes.size() >= 3){
            return "ERROR!!! No se puede tener mas de 3 ofertas en simultaneo.";
        }
        Application nuevaSolicitud = new Application(oferta, this);
        if (this.solicitudes == null) {
            this.solicitudes = new ArrayList<>();
        }
        this.solicitudes.add(nuevaSolicitud);
        System.out.println("Oferta disponible: ");
        return oferta.getTitulo();
    }
    
    public void cancelarSolicitud(){
        System.out.println("Solicitud cancelada");
    }

    public void actualizarPerfil(){
        System.out.println("Perfil actualizado");
    }
}
