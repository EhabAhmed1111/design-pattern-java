package product;

public class CheesePizz implements Pizza{

    public CheesePizz() {
        System.out.println("CheesePizz constructor");
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
