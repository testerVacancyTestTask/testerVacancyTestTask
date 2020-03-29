package blocks;

import org.testng.Assert;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$$;

public class InternetBankingExchangingBlock {

    public InternetBankingExchangingBlock checkBuyRateLessThanSaleForEachCurrency() {
        $$(byClassName("main-page-exchange__row")).forEach(currencyRow -> {
            String buy = currencyRow.$$(byClassName("main-page-exchange__indicator")).get(0).getText();
            String sale = currencyRow.$$(byClassName("main-page-exchange__indicator")).get(1).getText();
            Assert.assertTrue(getParseValue(buy) < getParseValue(sale));
        });
        return this;
    }

    private float getParseValue(String buy) {
        return Float.parseFloat(buy.replace(",", "."));
    }
}
