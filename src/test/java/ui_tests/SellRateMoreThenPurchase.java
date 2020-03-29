package ui_tests;

import base.BaseUITest;
import org.testng.annotations.Test;

public class SellRateMoreThenPurchase extends BaseUITest {

    @Test
    public void sellRateMoreThenPurchase() {
        pages().getGoogleHomePage()
                .openPage()
                .searchWithGoogleByText("Открытие");
        pages().getSearchResultPage()
                .checkSearchResultContainsLink("https://www.open.ru/")
                .clickLinkByText("Банк «Открытие» — вклады, кредитные и дебетовые ...");
        pages().getTheOpeningBankPage()
                .getInternetBankingExchangingBlock()
                .checkBuyRateLessThanSaleForEachCurrency();
    }
}
