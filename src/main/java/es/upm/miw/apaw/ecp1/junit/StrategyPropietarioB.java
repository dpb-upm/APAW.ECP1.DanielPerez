package es.upm.miw.apaw.ecp1.junit;

public class StrategyPropietarioB implements StrategyPropietarioInterface  {

    public static String tipo = "B";

    @Override
    public String getTipoIStrategy(){
        return tipo;
    }
}
