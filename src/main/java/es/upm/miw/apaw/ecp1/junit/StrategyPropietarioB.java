package es.upm.miw.apaw.ecp1.junit;

public class StrategyPropietarioB implements StrategyPropietarioInterface  {

    static final String TIPO = "B";

    @Override
    public String getTipoIStrategy(){
        return TIPO;
    }
}
