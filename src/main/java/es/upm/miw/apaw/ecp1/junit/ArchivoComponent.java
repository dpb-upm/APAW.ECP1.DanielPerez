package es.upm.miw.apaw.ecp1.junit;

public abstract class ArchivoComponent {

    public abstract void add(ArchivoComponent cc);

    public abstract void remove(ArchivoComponent cc);

    public abstract boolean isComposite();

    public abstract String view();
}
