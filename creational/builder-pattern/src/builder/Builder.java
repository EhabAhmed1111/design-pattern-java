package builder;

import model.Car;

public interface Builder {

    Builder id(int id);

    Builder brand(String brand);

    Builder model(String model);

    Builder color(String color);

    Builder nbrDoors(int nbrDoors);

    Builder screenType(String screenType);

    Builder weight(double weight);


    Builder height(double height);

    Car build();
}
