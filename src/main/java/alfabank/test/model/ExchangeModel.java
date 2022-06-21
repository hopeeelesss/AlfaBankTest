package alfabank.test.model;

import lombok.Data;

import java.util.Map;

/**
 * Модель для работы с курсами валют от openexchangerates.org
 * Пример json`а:
 * https://openexchangerates.org/api/historical/2020-12-21.json?app_id=3b8c120bb3624e3eb59a8002fdc0c03e
 */
@Data
public class ExchangeModel {

    private String disclaimer;
    private String license;
    private Integer timestamp;
    private String base;
    private Map<String, Double> rates;

    public ExchangeModel() {
    }
}
