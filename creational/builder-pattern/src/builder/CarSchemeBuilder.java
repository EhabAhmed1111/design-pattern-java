package builder;

import model.Car;

public class CarSchemeBuilder implements Builder{
    private int id;
    private String brand;
    private String model;
    private String color;
    private int nbrDoors;
    private String screenType;
    private double weight;
    private double height;

    @Override
    public CarSchemeBuilder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public CarSchemeBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarSchemeBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarSchemeBuilder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarSchemeBuilder nbrDoors(int nbrDoors) {
        this.nbrDoors = nbrDoors;
        return this;
    }

    @Override
    public CarSchemeBuilder screenType(String screenType) {
        this.screenType = screenType;
        return this;
    }

    @Override
    public CarSchemeBuilder weight(double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public CarSchemeBuilder height(double height) {
        this.height = height;
        return this;
    }

    @Override
    public Car build() {
        return new Car(
                id,
                brand,
                model,
                color,
                nbrDoors,
                screenType,
                weight,
                height
        );
    }
}
