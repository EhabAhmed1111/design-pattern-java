import context.Context;
import strategy.FirstStrat;
import strategy.Strategies;

public class Main {
    public static void main(String[] args) {
        Strategies strategies = new FirstStrat();
        Context context = new Context(strategies);
        context.doSomething();
    }
}