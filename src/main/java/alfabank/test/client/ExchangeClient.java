package alfabank.test.client;

import alfabank.test.model.ExchangeModel;

public interface ExchangeClient {

    ExchangeModel getLatestRates(String appId);

    ExchangeModel getHistoricalRates(String date, String appId);
}
