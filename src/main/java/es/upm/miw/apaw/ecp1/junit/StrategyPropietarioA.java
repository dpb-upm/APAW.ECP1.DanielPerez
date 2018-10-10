package es.upm.miw.apaw.ecp1.junit;

public class StrategyPropietarioA implements StrategyPropietarioInterface {

    public static String tipo = "A";

    @Override
    public String getTipoIStrategy() {
        return tipo;
    }
}
