package delivery;

import component.Component;
import component.CompositeComponent;

/**
 * here we will make the component*/
public class DeliverySystem {
    private Component component;

    public DeliverySystem() {

    }

//    public void addComponent(Component... component) {
//        this.component = new CompositeComponent(component);
//    }
    public void addComponent(Component component) {
        this.component = component;
    }

    public Double getPrice() {
        return component.calculatePrice();
    }

}
