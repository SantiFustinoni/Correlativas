package Inscripciones;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class InscripcionTest {
    @Test
    @DisplayName("La inscripcion deberia aprobarse porque matematica es correlativa y el alumno la tiene aprobada")
    void testInscripcionAprobada() {
        Alumno alumno = new Alumno("Juan", "Perez");
        Materia matematicas = new Materia("Matemáticas");
        Materia fisica = new Materia("Física");

        // Física requiere haber aprobado Matemáticas
        fisica.addCorrelativa(matematicas);

        // El alumno aprueba Matemáticas
        alumno.addMateriaAprobada(matematicas);

        // Se inscribe en Física
        alumno.inscribirseAMateria(fisica);

        Inscripcion inscripcion = new Inscripcion(alumno);

        // Verificamos que la inscripción sea aprobada
        assertTrue(inscripcion.aprobada(), "La inscripción debería estar aprobada");
    }

    @Test
    @DisplayName("La inscripcion deberia rechazarse porque matematica es correlativa y el alumno no la tiene aprobada")
    void testInscripcionNoAprobada() {
        Alumno alumno = new Alumno("Maria", "Gomez");
        Materia matematicas = new Materia("Matemáticas");
        Materia fisica = new Materia("Física");

        // Física requiere haber aprobado Matemáticas
        fisica.addCorrelativa(matematicas);

        // El alumno NO aprueba Matemáticas

        // Se inscribe en Física
        alumno.inscribirseAMateria(fisica);

        Inscripcion inscripcion = new Inscripcion(alumno);

        // Verificamos que la inscripción NO sea aprobada
        assertFalse(inscripcion.aprobada(), "La inscripción no debería estar aprobada");
    }
}