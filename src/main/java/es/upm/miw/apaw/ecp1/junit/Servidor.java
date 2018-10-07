package es.upm.miw.apaw.ecp1.junit;

import java.util.HashMap;
import java.util.Map;

public class Servidor {

    private String id;
    private TipoServidor tipo;
    private boolean lleno;
    private Propietario propietario;
    private Map<String, Archivo> archivos;

    public Servidor(String id, TipoServidor tipo, Propietario propietario) {
        this.id = id;
        this.tipo = tipo;
        this.lleno = false;
        this.propietario = propietario;
        this.archivos = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public TipoServidor getTipo() {
        return tipo;
    }

    public void setTipo(TipoServidor tipo) {
        this.tipo = tipo;
    }

    public boolean isLleno() {
        return lleno;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Map<String, Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(Map<String, Archivo> archivos) {
        this.archivos = archivos;
    }

    public void setArchivo(Archivo archivo) {
        this.archivos.put(archivo.getId(), archivo);
    }
}
