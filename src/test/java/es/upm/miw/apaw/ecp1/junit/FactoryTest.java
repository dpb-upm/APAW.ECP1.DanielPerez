package es.upm.miw.apaw.ecp1.junit;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryTest {

    //@Test
    void testConstructor() {
        FactoryServidor factory = FactoryServidor.getFactory();
        factory.getFactory().addArchivo(new Archivo.Builder().id("1").descripcion("Archivo de prueba").tamanio(10).build());
        factory.addArchivo(new Archivo.Builder().id("2").descripcion("Archivo de prueba 2").tamanio(10).build());
        assertEquals(2, factory.getServidor().getArchivos().size());

        factory.borrarArchivos();
        assertEquals(0, factory.getServidor().getArchivos().size());
    }

    @Test
    void testObservable() {

        FactoryServidor factory = FactoryServidor.getFactory();
        Servidor servidor = new Servidor();

        factory.addObserver(servidor);
        factory.removeObserver(servidor);

        factory.addArchivo(new Archivo.Builder().id("1").descripcion("Archivo de prueba").tamanio(10).build());

        AtomicInteger total = new AtomicInteger();
        factory.getServidor().getArchivos().forEach((k, v) -> {
            if (v.getDescripcion().contains("NOTIFIED")){
                total.getAndIncrement();
            }
        });
        assertEquals(0, total.intValue());

        factory.addObserver(servidor);
        factory.addArchivo(new Archivo.Builder().id("2").descripcion("Archivo de prueba").tamanio(10).build());

        total.set(0);
        factory.getServidor().getArchivos().forEach((k, v) -> {
            if (v.getDescripcion().contains("NOTIFIED")){
                total.getAndIncrement();
            }
        });
        assertEquals(1, total.intValue());
    }
}
