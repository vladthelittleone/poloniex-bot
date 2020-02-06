import java.io.IOException;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
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
        Exchange bitstamp = ExchangeFactory.INSTANCE.createExchange(PoloniexExchange.class.getName());

        MarketDataService marketDataService = bitstamp.getMarketDataService();

        OrderBook orderBook = marketDataService.getOrderBook(CurrencyPair.BTC_USD);

        System.out.println(orderBook.toString());
    }
}
