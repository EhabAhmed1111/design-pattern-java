package market_example;

public class JSONToXML implements Adapter {

    private final ThirdPartyLibThatDealWithJSON  thirdPartyLibThatDealWithJSON;

    public JSONToXML(ThirdPartyLibThatDealWithJSON thirdPartyLibThatDealWithJSON) {
        this.thirdPartyLibThatDealWithJSON = thirdPartyLibThatDealWithJSON;
    }

    @Override
    public void buildUI() {
        thirdPartyLibThatDealWithJSON.create();
    }
}
