import pizza.BasicPizza;
import pizza.Pizza;
import pizza.Ranch;
import pizza.Souce;

void main() {
    Pizza pizza = new BasicPizza();

    Pizza ranch = new Ranch(pizza);

    Pizza souce = new Souce(ranch);

    System.out.println( souce.getDescription() + " " + souce.cost());
}
