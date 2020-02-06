import java.io.IOException;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.ExchangeSpecification;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.marketdata.OrderBook;
import org.knowm.xchange.poloniex.PoloniexExchange;
import org.knowm.xchange.service.marketdata.MarketDataService;

/**
 * @author Skurishin Vladislav
 * @since 2020-02-04
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
        ExchangeSpecification exSpec = new PoloniexExchange().getDefaultExchangeSpecification();
        exSpec.setUserName("34387");
        exSpec.setApiKey("a4SDmpl9s6xWJS5fkKRT6yn41vXuY0AM");
        exSpec.setSecretKey("sisJixU6Xd0d1yr6w02EHCb9UwYzTNuj");
        Exchange poloniex = ExchangeFactory.INSTANCE.createExchange(exSpec);

        MarketDataService marketDataService = poloniex.getMarketDataService();

        OrderBook orderBook = marketDataService.getOrderBook(CurrencyPair.BTC_USD);

        System.out.println(orderBook.toString());
    }
}
