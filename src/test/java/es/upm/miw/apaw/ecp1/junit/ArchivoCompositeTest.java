package es.upm.miw.apaw.ecp1.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArchivoCompositeTest {

    private ArchivoComponent root;
    private ArchivoComponent tree;
    private ArchivoComponent leaf;

    @BeforeEach
    void before() {
        this.root = new DirectorioComposite();
        this.leaf = new ArchivoLeaf("1", 1, "Archivo 1 leaf");
        this.root.add(this.leaf);

        this.root.add(new DirectorioComposite());
        this.root.add(new ArchivoLeaf("1", 2, "Archivo 1 comp"));
        this.root.add(new ArchivoLeaf("2", 3, "Archivo 2 comp"));
        this.root.add(new ArchivoLeaf("3", 4, "Archivo 3 comp"));

        this.root.add(new DirectorioComposite());
        this.leaf = new ArchivoLeaf("2", 5, "Archivo 2 leaf");
        this.root.add(this.leaf);
    }

    @Test
    void testComposite() {
        int sumLeaf = 0;
        int sumTree = 0;
        for (Iterator<ArchivoComponent> it = this.root.iterator(); it.hasNext(); ) {
            if(it.next().isComposite()){
                sumTree++;
            } else {
                sumLeaf++;
            }
        }

        assertEquals(7, this.root.total());
        assertEquals(5, sumLeaf);
        assertEquals(3, sumTree);
    }
}
