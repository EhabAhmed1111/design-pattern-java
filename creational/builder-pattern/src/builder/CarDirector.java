package builder;

import model.Car;

public class CarDirector {

    // here what if there is a different type of builder that  share same function
    // for that we will make director deal with interface that are common for builders
    public Car hundiModel(Builder builder) {
        // here I want to clear that the builder could be done by using setter
        // but here I use the chain so it become more easier and faster
        return builder
                .id(1)
                .brand("hundi")
                .color("black")
                .screenType("ga")
                .weight(115.0)
                .nbrDoors(4)
                .height(115.0)
                .build();
    }

    public Car scheme(Builder builder) {
        return builder
                .id(2)
                .brand("another")
                .color("white")
                .screenType("ga")
                .weight(115.0)
                .nbrDoors(4)
                .height(115.0)
                .build();
    }
}
