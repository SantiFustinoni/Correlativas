package Inscripciones;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Materia {
    private String nombreMateria;
    private List<Materia> correlativas;

    public Materia(String nombreMateria) {
        this.nombreMateria = nombreMateria;
        correlativas = new ArrayList<>();
    }

    public Boolean cumpleCorrelativas(Alumno alumno) {
        return alumno.getMateriasAprobadas().containsAll(correlativas);
    }

    public void addCorrelativa(Materia unaCorrelativa) {
        correlativas.add(unaCorrelativa);
    }
}
