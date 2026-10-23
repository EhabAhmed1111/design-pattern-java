package factory;

import product.*;

public interface PizzaFactory {

    Pizza prepareCheesePizza();

    Pizza prepareMeatPizza();

    Pizza prepareRanchPizza();

    Pizza prepareDefaultPizza();
}
