package Inscripciones;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Alumno {
    private String nombre;
    private String apellido;
    private List<Materia> materiasAprobadas;
    private List<Materia> materiasAInscribirse;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAprobadas = new ArrayList<>();
        this.materiasAInscribirse = new ArrayList<>();
    }

    public Boolean puedeCursar(Materia unaMateria){
        return unaMateria.cumpleCorrelativas(this);
    }

    public List<Materia> inscribirseAMateria(Materia materia) {
        materiasAInscribirse.add(materia);
        return materiasAInscribirse;
    }

    public void addMateriaAprobada(Materia unaMateria){
        materiasAprobadas.add(unaMateria);
    }
}
