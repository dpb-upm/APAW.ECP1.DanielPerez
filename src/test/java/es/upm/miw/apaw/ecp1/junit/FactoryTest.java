package es.upm.miw.apaw.ecp1.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryTest {

    @Test
    void testConstructor() {
        FactoryServidor.getFactory().setArchivo(new Archivo.Builder().id("1").descripcion("Archivo de prueba").tamanio(10).build());
        FactoryServidor.getFactory().setArchivo(new Archivo.Builder().id("2").descripcion("Archivo de prueba 2").tamanio(10).build());

        assertEquals(2, FactoryServidor.getFactory().getServidor().getArchivos().size());

        FactoryServidor.getFactory().borrarArchivos();
        assertEquals(0, FactoryServidor.getFactory().getServidor().getArchivos().size());
    }
}
