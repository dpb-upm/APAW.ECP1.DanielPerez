package es.upm.miw.apaw.ecp1.junit;

public class ArchivoLeaf implements ArchivoComponent {

    private String id;
    private float tamanio;
    private String descripcion;

    public ArchivoLeaf(String id, int tamanio, String descripcion) {
        this.id = id;
        this.tamanio = tamanio;
        this.descripcion = descripcion;
    }

    @Override
    public void add(ArchivoComponent cc) {
        // Es una hoja y no se implementa
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void remove(ArchivoComponent cc) {
        // Es una hoja y no se implementa
    }

    @Override
    public int total() {
        return 1;
    }

    @Override
    public String view() {
        return "Leaf " + this.id;
    }
}
