package alfabank.test.client;

import alfabank.test.model.ExchangeModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "OERClient", url = "${exchange.url.general}")
public interface FeignExchangeClient extends ExchangeClient {

    @Override
    @GetMapping("/latest.json")
    ExchangeModel getLatestRates(
            @RequestParam("app_id") String appId
    );

    @Override
    @GetMapping("/historical/{date}.json")
    ExchangeModel getHistoricalRates(
            @PathVariable String date,
            @RequestParam("app_id") String appId
    );
}
