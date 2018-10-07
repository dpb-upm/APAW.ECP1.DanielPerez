package es.upm.miw.apaw.ecp1.junit;

import sun.rmi.server.InactiveGroupException;

import java.time.LocalDateTime;

public class Propietario {

    private String id;
    private String nombre;
    private Integer edad;
    private LocalDateTime nacimiento;

    public Propietario(String id, String nombre, Integer edad, LocalDateTime nacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.nacimiento = nacimiento;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public LocalDateTime getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDateTime nacimiento) {
        this.nacimiento = nacimiento;
    }
}
