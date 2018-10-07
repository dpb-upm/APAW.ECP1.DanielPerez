package es.upm.miw.apaw.ecp1.junit;

public class Archivo {

    private String id;
    private Integer tamanio;
    private String descripcion;

    public Archivo(String id, Integer tamanio, String descripcion) {
        this.id = id;
        this.tamanio = tamanio;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
