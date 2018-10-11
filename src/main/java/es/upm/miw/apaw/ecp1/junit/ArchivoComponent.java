package es.upm.miw.apaw.ecp1.junit;

public interface ArchivoComponent {

    void add(ArchivoComponent cc);

    boolean isComposite();

    void remove(ArchivoComponent cc);

    int total();

    String view();
}
