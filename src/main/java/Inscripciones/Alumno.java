package Inscripciones;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Alumno {
    private String nombre;
    private String apellido;
    private List<Materia> materiasAprobadas;
    private List<Materia> materiasSolicitadasAInscribirse;

    public Alumno(String nombre, String apellido, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAprobadas = materiasAprobadas;
        this.materiasSolicitadasAInscribirse = new ArrayList<>();
    }

    public Boolean puedeCursar(Materia unaMateria){
        return unaMateria.cumpleCorrelativas(this);
    }

    private List<Materia> inscribirseAMateria(List<Materia> materias) {
        materiasSolicitadasAInscribirse.addAll(materias);
        return materiasSolicitadasAInscribirse;
    }
}
