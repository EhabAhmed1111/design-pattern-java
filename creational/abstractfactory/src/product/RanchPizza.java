package product;

public class RanchPizza implements Pizza{


    public RanchPizza() {
        System.out.println("RanchPizza constructor");
    }

    @Override
    public void cut() {
        System.out.println("cutting pizza");
    }

    @Override
    public void prepare() {
        System.out.println("prepare pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking pizza");
    }

    @Override
    public void sauce() {
        System.out.println("sauce");
    }
}
