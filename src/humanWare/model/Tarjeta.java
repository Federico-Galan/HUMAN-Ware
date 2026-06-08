/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanWare.model;

import java.util.Date;

/**
 *
 * @author  
 */
public class Tarjeta {
    private String numero;
    private String titular;
    private Date fechaExpira;
    private String banco;
    private String codSeguridad;
    
    public Tarjeta(String numero, String titular, Date fechaExpira, String banco, String codSeguridad) {
        this.numero = numero;
        this.titular = titular;
        this.fechaExpira = fechaExpira;
        this.banco = banco;
        this.codSeguridad = codSeguridad;
    }
    
    public boolean validar() {
        return numero != null && !numero.isEmpty() &&
               titular != null && !titular.isEmpty() &&
               fechaExpira != null &&
               banco != null && !banco.isEmpty() &&
               codSeguridad != null && !codSeguridad.isEmpty();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Date getFechaExpira() {
        return fechaExpira;
    }

    public void setFechaExpira(Date fechaExpira) {
        this.fechaExpira = fechaExpira;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCodSeguridad() {
        return codSeguridad;
    }

    public void setCodSeguridad(String codSeguridad) {
        this.codSeguridad = codSeguridad;
    }
    
}
