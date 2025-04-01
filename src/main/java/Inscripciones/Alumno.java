package Inscripciones;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Alumno {
    private String nombre;
    private String apellido;
    private Integer legajo;
    private List<Materia> materiasAprobadas;
}
