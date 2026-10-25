package pizza;

public class BasicPizza extends Pizza {
    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
