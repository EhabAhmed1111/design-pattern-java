package market_example;

public class StockMarket {
    private final Adapter adapter;
    public StockMarket(Adapter adapter) {
        this.adapter = adapter;
    }

    public void buildUIUsingXML() {
        adapter.buildUI();
    }
}
