package es.upm.miw.apaw.ecp1.junit;

import java.util.List;

public class ArchivoLeaf extends ArchivoComponent {

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
    protected void addAllChildren(List<ArchivoComponent> list) {
        // No se implementa
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
        return this.descripcion;
    }
}
