package alfabank.test.service.serviceinterface;

import java.util.List;

public interface ExchangeService {

    List<String> getCharCodes();

    int getKeyForTag(String charCode);

    void refreshRates();

}