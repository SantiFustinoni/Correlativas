package Inscripciones;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasSolicitadas;
    private Boolean estaAprobada;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.getMateriasSolicitadas();
    }

    public Boolean aprobada(){
        estaAprobada = this.verificarAprobacion();
        return estaAprobada;
    }

    private Boolean verificarAprobacion() {
        return materiasSolicitadas.stream().allMatch(materia -> alumno.puedeCursar(materia));
    }

    private void getMateriasSolicitadas() {
        this.materiasSolicitadas = alumno.getMateriasSolicitadasAInscribirse();
    }
}
