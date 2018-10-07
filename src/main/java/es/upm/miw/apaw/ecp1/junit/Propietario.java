package es.upm.miw.apaw.ecp1.junit;

import java.time.LocalDateTime;

public class Propietario {

    private String id;
    private String nombre;
    private int edad;
    private LocalDateTime nacimiento;

    public Propietario(String id) {
        this.id = id;
    }

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
        return this.id == propietario.getId() && this.getNombre() == propietario.getNombre() & this.getEdad() == propietario.getEdad() && this.getNacimiento().isEqual(propietario.getNacimiento());
    }

    static class Builder {

        private Propietario propietario;

        public Builder id(String id) {
            assert id != null;
            propietario = new Propietario(id);
            return this;
        }

        public Builder nombre(String nombre) {
            assert nombre != null;
            propietario.setNombre(nombre);
            return this;
        }

        public Builder edad(int edad) {
            assert edad >= 0;
            propietario.setEdad(edad);
            return this;
        }

        public Builder nacimiento(String fecha) {
            assert fecha != null;
            propietario.setNacimiento(DateUtil.getFormatedDate("1988-05-10 00:00"));
            return this;
        }

        public Propietario build() {
            return propietario;
        }
    }
}
