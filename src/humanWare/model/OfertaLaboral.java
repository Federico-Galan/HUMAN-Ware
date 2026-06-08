/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanWare.model;

import dto.PostulanteDTO;
import enums.EstadoOferta;
import enums.TipoJornada;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author
 */
public class OfertaLaboral {

    private int idOferta;
    private String titulo;
    private String descripcion;
    private double salarioMin;
    private double salarioMax;
    private TipoJornada jornada;
    private String oficina;
    private EstadoOferta estado;
    private Date fechaCobertura;

    private Empresa empresa;
    private OfertaTitulo tituloRequerido;
    private List<OfertaSkill> habilidadesRequeridas;

    public OfertaLaboral(int idOferta, String titulo, String descripcion, double salarioMin, double salarioMax, TipoJornada jornada, String oficina) {
        this.idOferta = idOferta;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
        this.jornada = jornada;
        this.oficina = oficina;
        this.estado = EstadoOferta.ACTIVA;
        this.habilidadesRequeridas = new ArrayList<>();
        this.fechaCobertura = null;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSalarioMin() {
        return salarioMin;
    }

    public void setSalarioMin(double salarioMin) {
        this.salarioMin = salarioMin;
    }

    public double getSalarioMax() {
        return salarioMax;
    }

    public void setSalarioMax(double salarioMax) {
        this.salarioMax = salarioMax;
    }

    public TipoJornada getJornada() {
        return jornada;
    }

    public void setJornada(TipoJornada jornada) {
        this.jornada = jornada;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public EstadoOferta getEstado() {
        return estado;
    }

    public void setEstado(EstadoOferta estado) {
        this.estado = estado;
    }

    public Date getFechaCobertura() {
        return fechaCobertura;
    }

    public void setFechaCobertura(Date fechaCobertura) {
        this.fechaCobertura = fechaCobertura;
    }

    public List<OfertaSkill> getHabilidadesRequeridas() {
        return habilidadesRequeridas;
    }

    public void setHabilidadesRequeridas(List<OfertaSkill> habilidadesRequeridas) {
        this.habilidadesRequeridas = habilidadesRequeridas;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void cerrar() {
        this.estado = EstadoOferta.CUBIERTA;
        this.fechaCobertura = new Date();
        System.out.println("Oferta cerrada: " + titulo);
    }

    public void cancelar() {
        this.estado = EstadoOferta.CANCELADA;
        System.out.println("Oferta cancelada: " + titulo);
    }

    public void cubrir() {
        this.estado = EstadoOferta.CUBIERTA;
        this.fechaCobertura = new Date();
        System.out.println("Oferta cubierta: " + titulo);
    }

    public boolean esApto(PostulanteDTO postulante) {
        if (tituloRequerido != null && !tituloRequerido.validarTitulo(postulante.getTitulo())) {
            return false;
        }

        for (OfertaSkill skillReq : habilidadesRequeridas) {
            int nivelPostulante = postulante.getNivelHabilidad(skillReq.obtenerSkill().getIdSkill());
            if (!skillReq.validarNivel(nivelPostulante)) {
                return false;
            }
        }

        if (postulante.getRetribucionMinima() > salarioMax) {
            return false;
        }

        if (postulante.getTipoJornada() != TipoJornada.AMBAS
                && postulante.getTipoJornada() != jornada) {
            return false;
        }

        return true;
    }

    public int calcularPuntaje(PostulanteDTO postulante) {
        int puntajeTotal = 0;
        for (OfertaSkill skillReq : habilidadesRequeridas) {
            int nivelPostulante = postulante.getNivelHabilidad(skillReq.obtenerSkill().getIdSkill());
            puntajeTotal += nivelPostulante;
        }
        return puntajeTotal;
    }

    public void agregarHabilidadRequerida(OfertaSkill skill) {
        this.habilidadesRequeridas.add(skill);
    }

    public void setTituloRequerido(OfertaTitulo tituloRequerido) {
        this.tituloRequerido = tituloRequerido;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getTitulo() {
        return titulo;
    }
}
