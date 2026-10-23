package factory;

import product.*;

public class AraqiPizzaFactory implements PizzaFactory {

    public AraqiPizzaFactory() {
        System.out.println("AraqiPizzaFactory");
    }
    
    @Override
    public Pizza prepareCheesePizza() {
        return new CheesePizz();
    }

    @Override
    public Pizza prepareMeatPizza() {
        return new MeatPizza();
    }

    @Override
    public Pizza prepareRanchPizza() {
        return new RanchPizza();
    }

    @Override
    public Pizza prepareDefaultPizza() {
        return new DefaultPizza();
    }
}
