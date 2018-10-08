package es.upm.miw.apaw.ecp1.junit;

public class Archivo {

    private String id;
    private String descripcion;
    private float tamanio;

    public Archivo(String id){
        this.id = id;
    }

    public Archivo(String id, float tamanio, String descripcion) {
        this.id = id;
        this.tamanio = tamanio;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    static class Builder {

        private Archivo archivo;

        public Builder id(String id) {
            assert id != null;
            archivo = new Archivo(id);
            return this;
        }

        public Builder descripcion(String nombre) {
            assert nombre != null;
            archivo.setDescripcion(nombre);
            return this;
        }

        public Builder tamanio(int tamanio){
            assert tamanio > 0;
            archivo.setTamanio(tamanio);
            return this;
        }

        public Archivo build() {
            return archivo;
        }
    }
}
