package es.upm.miw.apaw.ecp1.junit;

import java.time.LocalDateTime;

public class PropietarioA extends Propietario {

    String tipo = "A";

    public PropietarioA(String id) {
        super(id);
    }

    public PropietarioA(String id, String nombre, int edad, LocalDateTime nacimiento) {
        super(id, nombre, edad, nacimiento);
    }

    public String getTipoPropietario(){
        return this.tipo;
    }
}
