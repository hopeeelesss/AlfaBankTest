package alfabank.test;

import alfabank.test.service.serviceinterface.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataInit {

    private ExchangeService exchangeService;

    @Autowired
    public DataInit(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }

    @PostConstruct
    public void firstDataInit() {
        exchangeService.refreshRates();
    }
}
