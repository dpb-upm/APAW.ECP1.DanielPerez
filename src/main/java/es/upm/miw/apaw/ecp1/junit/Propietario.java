package es.upm.miw.apaw.ecp1.junit;

import java.time.LocalDateTime;

public class Propietario {

    private String id;
    private String nombre;
    private int edad;
    private LocalDateTime nacimiento;

    public Propietario(String id, String nombre, int edad, LocalDateTime nacimiento) {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDateTime getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDateTime nacimiento) {
        this.nacimiento = nacimiento;
    }

    public boolean equals(Propietario propietario){
        return this.id == propietario.getId() && this.getNombre() == propietario.getNombre() & this.getEdad() == propietario.getEdad();
    }
}
