/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanWare.model;

import java.util.List;

public class Postulante {
    private int nroPostulante;
    private double retribucionMin;
    private String tipoJornada;
    private boolean disponibilidadViaje;
    private String vehiculo;
    private List<Application> solicitudes;

    public Postulante(int nroPostulante, double retribucionMin, String tipoJornada, 
            boolean disponibilidadViaje, String vehiculo) {
        this.nroPostulante = nroPostulante;
        this.retribucionMin = retribucionMin;
        this.tipoJornada = tipoJornada;
        this.disponibilidadViaje = disponibilidadViaje;
        this.vehiculo = vehiculo;
    }

    public int getNroPostulante() {
        return nroPostulante;
    }

    public void setNroPostulante(int nroPostulante) {
        this.nroPostulante = nroPostulante;
    }

    public double getRetribucionMin() {
        return retribucionMin;
    }

    public void setRetribucionMin(double retribucionMin) {
        this.retribucionMin = retribucionMin;
    }

    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public boolean isDisponibilidadViaje() {
        return disponibilidadViaje;
    }

    public void setDisponibilidadViaje(boolean disponibilidadViaje) {
        this.disponibilidadViaje = disponibilidadViaje;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public String aplicarOferta(OfertaLaboral oferta){
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
