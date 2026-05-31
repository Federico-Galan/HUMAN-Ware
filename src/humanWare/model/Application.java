package humanWare.model;

import java.util.Date;
import enums.EstadoApplication; 

public class Application {
    private int idApplication;
    private Date fechaCreacion;
    private Date fechaContrato;
    private EstadoApplication estadoApplication; 
    private OfertaLaboral oferta;
    private Postulante postulante;

    public Application(OfertaLaboral oferta, Postulante postulante) {
        this.idApplication = (int) (Math.random() * 10000);
        this.fechaCreacion = new Date();
        this.fechaContrato = null;
        this.oferta = oferta;
        this.postulante = postulante;
        activar(); 
    }


    public void activar() {
        this.estadoApplication = EstadoApplication.ACTIVA; 
        System.out.println("La solicitud ahora está activa.");
    }

    public void desactivar() {
        this.estadoApplication = EstadoApplication.INACTIVA;
        this.fechaContrato = new Date(); 
        System.out.println("Solicitud desactivada. Puesto cubierto.");
    }

    public void cancelar() {
        this.estadoApplication = EstadoApplication.CANCELADA;
        System.out.println("La solicitud ha sido cancelada.");
    }


    public int getIdApplication() { return idApplication; }
    public Date getFechaCreacion() { return fechaCreacion; }
    public Date getFechaContrato() { return fechaContrato; }
    
    public EstadoApplication getEstadoApplication() { 
        return estadoApplication; 
    }
    
    public OfertaLaboral getOferta() { return oferta; }
    public Postulante getPostulante() { return postulante; }
}