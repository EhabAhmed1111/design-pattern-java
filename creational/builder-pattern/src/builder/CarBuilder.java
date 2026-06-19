package builder;

import model.Car;

/*
* this is how we separate the construction code from the object representation
* but if there is another builder with same fields
* so now we introduce director which is optional by the way */
public class CarBuilder implements Builder {
    private int id;
    private String brand;
    private String model;
    private String color;
    private int nbrDoors;
    private String screenType;
    private double weight;
    private double height;

    @Override
    public CarBuilder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder nbrDoors(int nbrDoors) {
        this.nbrDoors = nbrDoors;
        return this;
    }

    @Override
    public CarBuilder screenType(String screenType) {
        this.screenType = screenType;
        return this;
    }

    @Override
    public CarBuilder weight(double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public CarBuilder height(double height) {
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
