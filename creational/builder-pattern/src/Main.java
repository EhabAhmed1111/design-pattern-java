import builder.Builder;
import builder.CarBuilder;
import builder.CarDirector;
import builder.CarSchemeBuilder;
import model.Car;

public class Main {
    public static void main(String[] args) {

        CarDirector carDirector = new CarDirector();
        Builder carBuilder = new CarBuilder();
        Builder carSchemeBuilder = new CarSchemeBuilder();

        Car hundi = carDirector.hundiModel(carBuilder);
        Car carScheme = carDirector.scheme(carSchemeBuilder);

        System.out.println(hundi.brand());
    }
}