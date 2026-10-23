package product;

public class MeatPizza implements Pizza{


    public MeatPizza() {
        System.out.println("MeatPizza constructor");
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
