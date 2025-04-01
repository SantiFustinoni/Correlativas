package Inscripciones;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Materia {
    private String nombreMateria;
    private List<Materia> correlativas;

    public Materia(String nombreMateria, List<Materia> correlativas) {
        this.nombreMateria = nombreMateria;
        this.correlativas = correlativas;
    }

    public Boolean cumpleCorrelativas(Alumno alumno) {
        return alumno.getMateriasAprobadas().containsAll(correlativas);
    }
}
