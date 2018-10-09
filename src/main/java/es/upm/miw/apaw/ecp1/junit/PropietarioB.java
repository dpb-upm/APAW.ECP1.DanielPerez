package es.upm.miw.apaw.ecp1.junit;

import java.time.LocalDateTime;

public class PropietarioB extends Propietario {

    String tipo = "B";

    public PropietarioB(String id) {
        super(id);
    }

    public PropietarioB(String id, String nombre, int edad, LocalDateTime nacimiento) {
        super(id, nombre, edad, nacimiento);
    }

    public String getTipoPropietario(){
        return this.tipo;
    }
}
