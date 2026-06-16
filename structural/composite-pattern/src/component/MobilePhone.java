package component;

public class MobilePhone extends Product{
    public MobilePhone(String title, Double price) {
        super(title, price);
    }

    @Override
    public Double calculatePrice() {
        return getPrice();
    }
}
