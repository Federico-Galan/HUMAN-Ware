package dto;

import enums.TipoJornada;
import humanWare.model.Titulo;

public class PostulanteDTO {
    private String numeroPostulante;
    private String email;
    private Titulo titulo;
    private double retribucionMinima;
    private TipoJornada tipoJornada;

    public PostulanteDTO(String numeroPostulante, String email, Titulo titulo, double retribucionMinima, TipoJornada tipoJornada) {
        this.numeroPostulante = numeroPostulante;
        this.email = email;
        this.titulo = titulo;
        this.retribucionMinima = retribucionMinima;
        this.tipoJornada = tipoJornada;
    }

    public String getNumeroPostulante() {
        return numeroPostulante;
    }

    public String getEmail() {
        return email;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public double getRetribucionMinima() {
        return retribucionMinima;
    }

    public TipoJornada getTipoJornada() {
        return tipoJornada;
    }

    public int getNivelHabilidad(int idSkill) {
        return 5; 
    }
}