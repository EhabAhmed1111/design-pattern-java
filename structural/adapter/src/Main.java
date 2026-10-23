import market_example.Adapter;
import market_example.ThirdPartyLibThatDealWithJSON;
import market_example.XMLData;
import market_example.JSONToXML;

void main() {

    ThirdPartyLibThatDealWithJSON thirdPartyLibThatDealWithJSON = new ThirdPartyLibThatDealWithJSON();
    Adapter adapter = new JSONToXML(thirdPartyLibThatDealWithJSON);
    adapter.buildUI();

    Adapter adapter1 = new XMLData();
    adapter1.buildUI();
}
