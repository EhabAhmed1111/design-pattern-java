package component;

public class VideoGame extends Product{
    public VideoGame(String title, Double price) {
        super(title, price);
    }

    @Override
    public Double calculatePrice() {
        return getPrice();
    }
}
