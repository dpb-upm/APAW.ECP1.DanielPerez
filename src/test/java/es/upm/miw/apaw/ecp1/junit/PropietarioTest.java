package es.upm.miw.apaw.ecp1.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PropietarioTest {

    private Propietario propietario;

    @BeforeEach
    void before() {
        LocalDateTime localDateTime = LocalDateTime.of(1988, 05, 10, 0, 0);
        this.propietario = new Propietario("1", "Daniel", 30,localDateTime);
    }

    @Test
    void testConstructor() {
        LocalDateTime localDateTime = LocalDateTime.of(1988, 05, 10, 0, 0);
        assertEquals("1", this.propietario.getId());
        assertEquals("Daniel", this.propietario.getNombre());
        assertEquals(30, this.propietario.getEdad());
        assertTrue(localDateTime.isEqual(this.propietario.getNacimiento()));

        LocalDateTime localDateTime2 = LocalDateTime.of(1988, 05, 10, 0, 0);
        this.propietario.setNacimiento(localDateTime2);
        assertTrue(localDateTime2.isEqual(this.propietario.getNacimiento()));

        this.propietario.setNombre("Daniel Perez");
        assertEquals("Daniel Perez", this.propietario.getNombre());

        this.propietario.setEdad(35);
        assertEquals(35, this.propietario.getEdad());
    }
}
