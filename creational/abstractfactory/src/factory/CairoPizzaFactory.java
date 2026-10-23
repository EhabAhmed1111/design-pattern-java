package factory;

import product.*;

public class CairoPizzaFactory implements  PizzaFactory {

    public CairoPizzaFactory() {
        System.out.println("CairoPizzaFactory");
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
