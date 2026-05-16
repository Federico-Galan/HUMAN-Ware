package humanWare.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private int idEmpresa;
    private String nombre;
    private String email;
    private String telefono;
    private List<OfertaLaboral> ofertasPublicadas;

    public Empresa(int idEmpresa, String nombre, String email, String telefono) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.ofertasPublicadas = new ArrayList<>();
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void publicarOferta(OfertaLaboral oferta, Publicador publicador){
        oferta.setEmpresa(this);
        publicador.publicarOferta(oferta);
        ofertasPublicadas.add(oferta);
    }
    
    public void cancelarOferta(OfertaLaboral oferta) {
        oferta.cancelar();
        System.out.println("Empresa " + nombre + " canceló la oferta: " + oferta.getTitulo());
    }
    
    @Override
    public String toString() {
        return "Empresa{id=" + idEmpresa + ", nombre='" + nombre + "'}";
    }    
}
