package component;


/** this class is abstract because it has different meaning
 * this mean there are a many kind of product
 * so to make this clear we made Product then each type will inherit from it
 * this also mean that there is no product are simple product
 * it should have a more precise type like videoGame or mobilePhone */
public abstract class Product implements Component {
    protected final String title;
    protected final Double price;

    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }
}
