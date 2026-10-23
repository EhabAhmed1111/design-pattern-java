import factory.CairoPizzaFactory;
import factory.PizzaFactory;
import product.Pizza;
import store.EgyptStore;
import store.Store;

void main() {
    PizzaFactory cairoPizzaFactory = new CairoPizzaFactory();
    Store egyptStore = new EgyptStore(cairoPizzaFactory);

    egyptStore.createPizza("cheese");
}
