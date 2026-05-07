package context;

import strategy.Strategies;

public class Context {

    private Strategies strategies;

    public Context (Strategies strategies) {
        this.strategies = strategies;
    }

    public void doSomething() {
        strategies.execute();
    }
}
