package store;

import factory.CairoPizzaFactory;
import factory.PizzaFactory;
import product.Pizza;

public class EgyptStore implements Store {
    private final PizzaFactory pizzaFactory;


    public EgyptStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    @Override
    public Pizza  createPizza(String type){
        switch (type){
            case "cheese" -> {
                return pizzaFactory.prepareCheesePizza();
            }
            case  "meat" -> {
                return pizzaFactory.prepareMeatPizza();
            }
            case  "ranch" -> {
                return  pizzaFactory.prepareRanchPizza();
            }
        }
        return pizzaFactory.prepareDefaultPizza();
    }
}
