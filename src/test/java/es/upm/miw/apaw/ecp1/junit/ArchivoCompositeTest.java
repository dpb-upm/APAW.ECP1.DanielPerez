package es.upm.miw.apaw.ecp1.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArchivoCompositeTest {

    private ArchivoComponent root;
    private ArchivoComponent tree;
    private ArchivoComponent leaf;

    @BeforeEach
    void before() {
        this.root = new DirectorioComposite();
        this.leaf = new ArchivoLeaf("1", 100, "Archivo 1");
        this.root.add(leaf);

        this.tree = new DirectorioComposite();


    }

    @Test
    void testComposite() {

    }
}
