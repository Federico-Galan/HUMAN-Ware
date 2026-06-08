package humanWare.model;

import java.util.*;
import dto.PostulanteDTO;

public class Evaluador extends Empleado {
    
    public Evaluador(int legajo) {
        super(legajo);
    }
    
    public void iniciarSeleccion(OfertaLaboral oferta) {
        System.out.println("Iniciando proceso de selección para: " + oferta.getTitulo());
    }
    
    public List<PostulanteDTO> seleccionarCandidatos(OfertaLaboral oferta, List<PostulanteDTO> postulantes) {
        List<PostulanteDTO> candidatosAptos = new ArrayList<>();
        
        for (PostulanteDTO postulante : postulantes) {
            if (oferta.esApto(postulante)) {
                candidatosAptos.add(postulante);
            }
        }
        
        candidatosAptos.sort((p1, p2) -> {
            int puntaje1 = oferta.calcularPuntaje(p1);
            int puntaje2 = oferta.calcularPuntaje(p2);
            return Integer.compare(puntaje2, puntaje1);
        });
        
        return candidatosAptos;
    }
    
    public void generarInforme(OfertaLaboral oferta, List<PostulanteDTO> candidatos) {
        System.out.println("\n=== INFORME DE SELECCIÓN ===");
        System.out.println("Oferta: " + oferta.getTitulo());
        System.out.println("Candidatos aptos (" + candidatos.size() + "):");
        int puesto = 1;
        for (PostulanteDTO candidato : candidatos) {
            System.out.println(puesto + ". Postulante #" + candidato.getNumeroPostulante() + 
                             " - Puntaje: " + oferta.calcularPuntaje(candidato));
            puesto++;
        }
        System.out.println("=============================\n");
    }
    
    public void enviarNotificaciones(OfertaLaboral oferta, List<PostulanteDTO> candidatos) {
        for (PostulanteDTO candidato : candidatos) {
            System.out.println("Enviando email a " + candidato.getEmail() + 
                             " - Seleccionado para: " + oferta.getTitulo());
        }
        System.out.println("Enviando listado a la empresa: " + oferta.getEmpresa().getNombre());
    }
}