package es.upm.miw.apaw.ecp1.junit;

import java.time.LocalDateTime;

public class Propietario {

    private String id;
    private String nombre;
    private int edad;
    private LocalDateTime nacimiento;

    private StrategyPropietario strategy;

    public void setStrategyA(){
        StrategyPropietarioInterface strategyPropietario = new StrategyPropietarioA();
        this.strategy.setStrategy(strategyPropietario);
    }

    public void setStrategyB(){
        StrategyPropietarioInterface strategyPropietario = new StrategyPropietarioB();
        this.strategy.setStrategy(strategyPropietario);
    }

    public void setStrategyDefault(){
        StrategyPropietarioInterface strategyPropietario = new StrategyPropietarioDefault();
        this.strategy.setStrategy(strategyPropietario);
    }

    public Propietario(String id) {
        this.strategy = new StrategyPropietario();
        this.strategy.setStrategy(new StrategyPropietarioDefault());
        this.id = id;
    }

    public Propietario(String id, String nombre, int edad, LocalDateTime nacimiento) {
        this.strategy = new StrategyPropietario();
        this.strategy.setStrategy(new StrategyPropietarioDefault());
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.nacimiento = nacimiento;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        String n = nombre + strategy.getTipoStrategy();
        return n;
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

    public boolean iguales(Propietario propietario){
        return this.id.equals(propietario.getId()) && this.getNombre().equals(propietario.getNombre()) && this.getEdad() == propietario.getEdad() && this.getNacimiento().isEqual(propietario.getNacimiento());
    }

    static class Builder {

        private Propietario propietario;

        public Builder id(String id) {
            assert id != null;
            propietario = new Propietario(id);
            propietario.strategy = new StrategyPropietario();
            propietario.strategy.setStrategy(new StrategyPropietarioDefault());
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
