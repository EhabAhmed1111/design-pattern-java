package pizza;

public class Ranch extends Pizza {

    private final Pizza pizza;

    public Ranch(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " With ranch";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.55;
    }
}
