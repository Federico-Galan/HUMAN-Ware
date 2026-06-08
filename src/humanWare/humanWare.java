/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package humanWare;

import dto.PostulanteDTO;
import enums.TipoJornada;
import humanWare.model.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author  
 */
public class humanWare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Iniciando Test de HUMAN-Ware ===\n");

        Empresa empresa = new Empresa(1, "Tech Solutions", "contacto@tech.com", "12345678");
        Publicador publicador = new Publicador(100);
        Evaluador evaluador = new Evaluador(200);

        Titulo tituloIngeniero = new Titulo(1, "Ingeniero en Sistemas");
        Skills skillJava = new Skills(1, "Java");
        
        OfertaTitulo reqTitulo = new OfertaTitulo(true, tituloIngeniero);
        OfertaSkill reqSkill = new OfertaSkill(3, skillJava);

        OfertaLaboral oferta = new OfertaLaboral(10, "Desarrollador Java", "Backend Dev", 1000, 2000, TipoJornada.AMBAS, "Oficina Central");
        oferta.setTituloRequerido(reqTitulo);
        oferta.agregarHabilidadRequerida(reqSkill);
        
        empresa.publicarOferta(oferta, publicador);

        Postulante postulante = new Postulante("P001", 1500, "AMBAS", false, "No");
        PostulanteDTO postulanteDTO = new PostulanteDTO(postulante.getIdPostulante(), "p001@correo.com", tituloIngeniero, postulante.getRetribMin(), TipoJornada.AMBAS);

        postulante.aplicarOferta(oferta);
        List<PostulanteDTO> listaPostulantes = new ArrayList<>();
        listaPostulantes.add(postulanteDTO);

        System.out.println("");
        evaluador.iniciarSeleccion(oferta);
        List<PostulanteDTO> seleccionados = evaluador.seleccionarCandidatos(oferta, listaPostulantes);
        evaluador.generarInforme(oferta, seleccionados);
        evaluador.enviarNotificaciones(oferta, seleccionados);
    }
    
}
