package store;

import factory.AraqiPizzaFactory;
import factory.PizzaFactory;
import product.Pizza;

public class AraqiStore implements Store{

    private final PizzaFactory pizzaFactory;


    public AraqiStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    @Override
    public Pizza createPizza(String type){
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
