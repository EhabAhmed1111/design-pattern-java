import component.Component;
import component.CompositeComponent;
import component.MobilePhone;
import component.VideoGame;
import delivery.DeliverySystem;


public class Main {
    public static void main(String[] args) {
        /*
         * so by making a main interface that delivery system will deal with
         * this allow me to add any type of product
         * because at the end I will deal with it as it's a component
         * or a composite of component, right? */
        /* here we could move this CompositeComponent to become inside the function
         * that called addComponent I will make it and comment it for learning purpose*/
        Component component = new CompositeComponent(
                new MobilePhone("iPhone", 200.0),
                new VideoGame("LOL", 400.0)
        );
        DeliverySystem deliverySystem = new DeliverySystem();
        deliverySystem.addComponent(component);
        System.out.println(deliverySystem.getPrice());
    }
}