package es.upm.miw.apaw.ecp1.junit;

public class StrategyPropietario {

    private StrategyPropietarioInterface strategy;

    public void setStrategy(StrategyPropietarioInterface strategy) {
        this.strategy = strategy;
    }

    public String getTipoStrategy(){
        return strategy.getTipoIStrategy();
    }
}
