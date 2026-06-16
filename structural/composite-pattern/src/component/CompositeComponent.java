package component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * this is component which made from other component
 * imagine it like box inside box*/
public class CompositeComponent implements Component{

    private final List<Component> components = new ArrayList<>();

    public CompositeComponent(Component... components) {
        this.components.addAll(Arrays.asList(components));
    }

    @Override
    public Double calculatePrice() {
        return components.stream().mapToDouble(Component::calculatePrice).sum();
    }
}
