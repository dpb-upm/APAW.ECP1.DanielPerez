package es.upm.miw.apaw.ecp1.junit;

public class Archivo {

    private String id;
    private float tamanio;
    private String descripcion;

    public Archivo(String id, float tamanio, String descripcion) {
        this.id = id;
        this.tamanio = tamanio;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
