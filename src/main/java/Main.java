import java.util.List;

import com.cf.client.poloniex.PoloniexExchangeService;
import com.cf.data.model.poloniex.PoloniexTradeHistory;

/**
 * @author Skurishin Vladislav
 * @since 2020-02-04
 */
public class Main
{
    public static void main(String[] args)
    {
        String apiKey = "foo";
        String apiSecret = "bar";
        PoloniexExchangeService service = new PoloniexExchangeService(apiKey, apiSecret);
        List<PoloniexTradeHistory> usdtBtcTradeHistory = service.returnTradeHistory("USDT_BTC");
        System.out.println(usdtBtcTradeHistory.size());
    }
}
